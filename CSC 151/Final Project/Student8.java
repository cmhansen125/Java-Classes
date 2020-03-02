import javax.swing.*;

public class Student8
{

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // This is the same program as the last example, but we'll use a JLabel to show
        // the user's input instead of a JTextField.  JLabels and JTextFields differ mostly
        // in that JTextFields can be changed by the user, and JLabels can't.


        // we can also use a JTextField for user input.  If the user changes the JTextField,
        // those changes will be reflected in the return value from getText after addAndWait returns.
        JTextField jtf3 = new JTextField("waiting for you: change this field, put the cursor here and click enter");
        wv.addAndWait(jtf3);

        // When we get to this point in the program, the user has clicked Enter
        // Capture the text in the JTextField.  It will reflect what the user entered.
        String changedField = jtf3.getText();
        System.out.println("enter captured:  JTextField is now " + changedField);

        // Here's our JLabel that reflects the data we captured from the
        // user input
        JLabel jl = new JLabel("the text field is now " + changedField);
        wv.add(jl);
    }

}
