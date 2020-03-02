import javax.swing.*;

public class Student4 {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // we can add a JButton, though this one won't do anything.
        // you typically won't call the add method with a button
        // because the purpose of the button is to notify our program
        // when the user clicks it.  and the add method
        // isn't smart enough to do that.
        // that being said, putting a button in the gui using
        // add does work
        JButton jb = new JButton("waiting for you now: click this button and nothing happens");
        wv.add(jb);
    }

}
