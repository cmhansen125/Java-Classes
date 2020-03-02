import java.awt.event.ActionListener;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * A really simple class to display Swing widgets in a FlowLayout GUI.
 * <p>
 *
 * @author parks
 */
public class WidgetView {
	
	public static final int DEFAULT_X_SIZE = 600;
	public static final int DEFAULT_Y_SIZE = 400;

    private JFrame jframe;
    private JPanel anchor;
    private boolean userClicked = false;

    private Lock lock;
    private Condition waitingForUser;

    private JComponent userInputComponent = null;
    private ActionListener eventHandler;

    /**
     * Default constructor will display an empty JFrame that has a Flow layout
     * JPanel as its content pane and initialize the frame to a default size.
     */
    public WidgetView() {
    	this(DEFAULT_X_SIZE, DEFAULT_Y_SIZE);
    }
    
    /**
     * Constructor will display an empty JFrame that has a Flow layout
     * JPanel as its content pane and initialize the frame to a given size.
     */
    public WidgetView(int pixelSizeInX, int pixelSizeInY) {
        lock = new ReentrantLock();
        waitingForUser = lock.newCondition();
        //  lambda expression requires Java 8
        eventHandler = e -> {
            if (e.getSource() != userInputComponent) {
                return;
            }
            lock.lock();
            userClicked = true;
            waitingForUser.signalAll();
            lock.unlock();
        };

        /* java 7 solution
         * eventHandler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() != userInputComponent) {
                    return;
                }
                lock.lock();
                userClicked = true;
                waitingForUser.signalAll();
                lock.unlock();
            }
        };
        */

        jframe = new JFrame();
        anchor = new JPanel();
        jframe.setContentPane(anchor);
        jframe.setSize(pixelSizeInX, pixelSizeInY);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }

    /**
     * Add a Swing widget to the GUI.
     *
     * @param jcomp Swing widget (subclasses of JComponent--like JLabel and
     *              JTextField) to be added to the JFrame
     */
    public void add(JComponent jcomp) {
        anchor.add(jcomp);
        jframe.setContentPane(anchor);
    }

    /**
     * Add an Abstract Button (like a JButton) to the JFrame. Create an action
     * listener to wait (suspend the caller) until it is clicked.
     *
     * @param absButton Button (like a JButton) to add to the JFrame
     */
    public void addAndWait(AbstractButton absButton) {
        userInputComponent = absButton;
        absButton.addActionListener(eventHandler);

        addWait(absButton);
    }

    /**
     * Add a JTextField to the JFrame, and wait for the user to put the cursor
     * in the field and click Enter. The caller is suspended until enter is
     * clicked.
     *
     * @param jTextField Field to add to the JFrame
     */
    public void addAndWait(JTextField jTextField) {
        userInputComponent = jTextField;
        jTextField.addActionListener(eventHandler);

        addWait(jTextField);
    }

    private void addWait(JComponent jcomp) {
        add(jcomp);
        lock.lock();
        try {
            while (!userClicked) {
                waitingForUser.await();
            }
        }
        catch (InterruptedException e1) {
            System.err.println("WidgetView reports that something really bad just happened");
            e1.printStackTrace();
            System.exit(0);
        }
        userClicked = false;
        waitingForUser.signalAll();
        lock.unlock();
    }
}
