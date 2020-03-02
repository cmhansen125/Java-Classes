import javax.swing.*;

public class Student7 {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // we can also use a JTextField to trigger user input if the user presses the enter key
        // while the cursor is in the JTextField.  You probably won't use this very often,
        // but it is available.
        // If the user changes the JTextField,
        // those changes will be reflected in the return value from getText after addAndWait returns.
        JTextField jtf3 = new JTextField("waiting for you again: change this field, put the cursor here and click enter");
        wv.addAndWait(jtf3);

        // When we get to this point in the program, the user has clicked Enter
        // Capture the text in the JTextField.  It will reflect what the user entered.
        String changedField = jtf3.getText();
        System.out.println("enter captured:  JTextField is now " + changedField);

        // We can create a new JTextField that reflects the data we captured from the
        // user input
        JTextField jtf4 = new JTextField("the text field is now " + changedField);
        wv.add(jtf4);
    }

}
