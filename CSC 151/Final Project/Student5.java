import javax.swing.*;

public class Student5 {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // we need WidgetView to allow for user input.  This is how
        // we create a button for the user to click, add it to the
        // gui, and wait for the user to Do His Thing
        // The method addAndWait will not return until the user has clicked the button.
        // This program doesn't do anything interesting afterward, but
        // it does print a message to the console so we can see that things
        // do work as advertised.
        JButton jb = new JButton("waiting for you now: click this button and see console output");
        wv.addAndWait(jb);

        // put a msg on the console showing when the button was pushed
        System.out.println("button pushed");
    }

}
