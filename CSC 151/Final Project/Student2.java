import javax.swing.*;

public class Student2 {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // create a JTextField object of 11 columns
        JTextField jtf1 = new JTextField(11);

        // set the field's content
        // if you create the text field specifying the number
        // of columns, you must explicitly put the text into
        // it using the setText method
        jtf1.setText("kilroy was here");

        // don't forget to add the text field to the gui.
        // the gui can't be responsible for things it isn't told about
        wv.add(jtf1);
    }

}
