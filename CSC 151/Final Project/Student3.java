import javax.swing.*;

public class Student3 {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // create another JTextField, but this one is created 
        // with an initial String
        // the JTextField is created with enough columns to 
        // hold the string
        JTextField jtf2 = new JTextField("but not godot");
        wv.add(jtf2);
    }

}
