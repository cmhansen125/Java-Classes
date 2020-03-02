import javax.swing.*;

public class Student9 {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // This is similar to previous programs....
        JTextField jtf1 = new JTextField(11);
        jtf1.setText("kilroy was here");
        wv.add(jtf1);

        JTextField jtf2 = new JTextField("but not godot");
        wv.add(jtf2);

        JButton jb = new JButton("waiting for you now: push this button");
        wv.addAndWait(jb);
        System.out.println("button pushed");

        // At this point in the program, the user has pushed the button.

        // You'll only rarely want to do another round of user input, but it does work that
        // we can set up another round of user input by adding another widget with
        // an addAndWait method call.  We could set up another JButton, but for variety
        // let's use a JTextField.  Remember that
        // we can use a JTextField for user input.  The addAndWait will return when
        // the user clicks Enter while the text cursor is in the JTextField.
        // If the user changes the JTextField,
        // those changes will be reflected in the return value from getText after addAndWait returns.
        JTextField jtf3 = new JTextField("waiting for you: change this field, put the cursor here , click enter");
        wv.addAndWait(jtf3);
        String changedField = jtf3.getText();
        System.out.println("enter captured");

        // We could use a JTextField for this last user output, but let's use a JLabel for variety.
        JLabel jl = new JLabel("the text field is now " + changedField);
        wv.add(jl);
    }
}
