import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

/**
 * SlotMachineGUI.java
 *
 * This class creates a graphical representation of a slot machine.  It allows users to 
 * pull a lever and view the three symbols currently shown on each wheel.
 *
 * @author Dan Longo
 * @author Suzanne Balik
 * @version 2.0
 */
public class SlotMachineGUI extends JFrame implements ActionListener
{
	public static final int WIDTH = 700;
	public static final int HEIGHT = 400;
	public static final int X = 200;
	public static final int Y = 200;
	public static final int SHORT_DELAY = 100;
	public static final int LONG_DELAY = 1000;
	public static final int NORMAL_SPINS = 201;
	public static final int TESTING_SPINS = 5;
	
	/** This is the model which controls the game play */
	private SlotMachine model;
	/** This timer handles telling the model when to turn the reels */
	private Timer timer;
	/** This is the number of times the reels will spin*/
	private int maxSpins;
	/** This is the seed for the SlotMachine random number generator*/
	private int seed;
	/** This label is the symbol shown on the first reel */
	private JLabel symbol1;
	/** This label is the symbol shown on the second reel */
	private JLabel symbol2;
	/** This label is the symbol shown on the third reel */
	private JLabel symbol3;
	/** This label shows the current points earned */
	private JLabel points;

	/** This is the button for the lever */
	private JButton lever;
	/** This label shows the status of the machine */
	private JLabel statusField;

	/** This variable keeps track of how many spins have occurred */
	private int spins;

	/** This is the list of images shown as symbols */
	private ImageIcon[] pictures;

	/**
	 * This is the constructor where the GUI components are created and put together.
	 */
	public SlotMachineGUI(int seed)
	{
		setTitle("CSC116 Slot Machine");
		setSize(WIDTH, HEIGHT);
		setLocation(X, Y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pictures = new ImageIcon[Reel.NUMBER_OF_SYMBOLS];

		for(int i = 0; i < pictures.length; i++)
		{
			pictures[i] = new ImageIcon("images/" + (i+1) + ".gif");
		}

		spins = 0;
		this.seed = seed;
		model = new SlotMachine(seed);
		if (seed < 0) {
			maxSpins = NORMAL_SPINS;
		}
		else {
			maxSpins = TESTING_SPINS;
		}
		timer = new Timer(SHORT_DELAY, this);
		Container c = getContentPane();

		symbol1 = new JLabel(pictures[0]);
		symbol2 = new JLabel(pictures[0]);
		symbol3 = new JLabel(pictures[0]);
		points = new JLabel("Current Tokens: " + model.getNumberOfTokens());
		lever = new JButton("Pull Lever");
		lever.addActionListener(this);

		statusField = new JLabel("Pull the lever to begin.", JLabel.CENTER);

		JPanel cen = new JPanel();
		cen.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		panel.add(symbol1);
		panel.add(symbol2);
		panel.add(symbol3);
		cen.add(panel);
		cen.add(points);
		c.add(statusField, BorderLayout.NORTH);
		c.add(cen, BorderLayout.CENTER);
		c.add(lever, BorderLayout.SOUTH);

		setVisible(true);
	}

	/**
	 * This method responds to the lever being pulled and to the timer.
	 *
	 * @param e The action that occurred to cause this method to execute.
	 */
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == lever)
		{
			if (model.getNumberOfTokens() >= SlotMachine.BET_AMOUNT) {
				model.makeBet();
				points.setText("Current Tokens: " + model.getNumberOfTokens());
				lever.setEnabled(false);
				statusField.setText("Spinning...");
				timer.setDelay(SHORT_DELAY);
				if (seed >= 0) {
					timer.setDelay(LONG_DELAY);
				}
				timer.start();
			}
			else {
				lever.setEnabled(false);
				statusField.setText("Game Over");
			}
		}
		else if(e.getSource() == timer)
		{
			model.turnReel();
			spins++;
			updatePictures();
			
			if(spins == maxSpins - 5 || seed >= 0)
			{
				timer.setDelay(LONG_DELAY);
			}
		
			if(spins == maxSpins)
			{
				timer.stop();
				spins = 0;
				model.determineOutcome();
				statusField.setText(model.getStatus());
				points.setText("Current Tokens: " +
						model.getNumberOfTokens());
				lever.setEnabled(true);
			}
		}
	}

	/**
	 * This method updates the image shown on each wheel.
	 */
	public void updatePictures()
	{
		symbol1.setIcon(pictures[model.getCurrentIndexOfReel(0)]);
		symbol2.setIcon(pictures[model.getCurrentIndexOfReel(1)]);
		symbol3.setIcon(pictures[model.getCurrentIndexOfReel(2)]);
	}	

	/**
	 * This is the main method, where program execution begins.
	 *
	 * @param args Command line arguments - not used.
	 */
	public static void main(String[] args)
	{
		if (args.length == 1) {
			new SlotMachineGUI(Integer.parseInt(args[0]));
		} 
		else if (args.length == 0) {
			new SlotMachineGUI(-1);
		}
		else {
			System.out.println("Usage: java SlotMachineGUI <seed>");
		}
	}
}
