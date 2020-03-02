import javax.swing.*;

public class Student6 {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // Let's start combining things.

        // We'll create a JTextField with an initial value, and
        // create a JButton to wait for user input.
        // While the program is waiting for the button to be clicked,
        // the user can modify the JTextField.  Then he can
        // click the button.
        // After the button is clicked, we can read the current
        // content of the JTextField and print it to the console.
        JTextField jtf1 = new JTextField("caterpillar");
        wv.add(jtf1);

        // we can add a JButton and wait for the user to click it
        JButton jb = new JButton("change the JTextField to 'butterfly' and click this button");
        wv.addAndWait(jb);

        // Our JTextField should have a new value
        String s = jtf1.getText();
        System.out.println(s);
    }

}
