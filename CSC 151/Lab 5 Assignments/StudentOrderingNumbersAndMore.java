import javax.swing.*;

public class StudentOrderingNumbersAndMore {

    public static void main(String[] args) {
        WidgetView wv = new WidgetView();

        // This last program differs from the previous one only at the end....

        // JLabels are similar to JTextFields, but JTextFields can be modified by
        // the user.  JLabels can't
        JLabel jlInstructions = new JLabel("Enter 3 numbers and I'll order them");
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JTextField num3 = new JTextField(5);

        // add the initial widgets
        wv.add(jlInstructions);
        wv.add(num1);
        wv.add(num2);
        wv.add(num3);

        JButton execute = new JButton("Push me after entering the numbers");
        wv.addAndWait(execute);

        // When addAndWait returns, the user has pushed the execute JButton.
        // Hopefully the user has entered three valid numbers.

        // read the (String) contents of the JTextFields, and convert them to int
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int n3 = Integer.parseInt(num3.getText());

        int hi = n1;
        hi = Math.max(hi, n2);
        hi = Math.max(hi, n3);

        int lo = n1;
        lo = Math.min(lo, n2);
        lo = Math.min(lo, n3);

        int mid = n1 + n2 + n3 - hi - lo;

        JLabel hiLabel = new JLabel("highest " + hi);
        JLabel midLabel = new JLabel("middle " + mid);
        JLabel loLabel = new JLabel("lowest " + lo);

        // update the gui with our results
        wv.add(hiLabel);
        wv.add(midLabel);
        wv.add(loLabel);

        // Lets add one more bit of information.  Remember that the relational operators
        // return boolean results indicating whether the relation holds or not.  So
        // (5 > 6) has the value false, and
        // (5 < 6) has the value true.
        // We can test whether the user entered
        // any numbers that were equal (5, 3, 5), for instance, or (2, 2, 1).

        boolean loEqualsMid = lo == mid;  // test whether lo and mid are equal.  assign that result to loEqMid
        boolean midEqualsHi = mid == hi;  // test whether mid and hi are equal.  assign that result to midEqHi
        JLabel loEqualsMidLabel = new JLabel("it is " + loEqualsMid + " that low and middle are equal");
        JLabel midEqualsHiLabel = new JLabel("it is " + midEqualsHi + " that middle and high are equal");

        wv.add(midEqualsHiLabel);
        wv.add(loEqualsMidLabel);
    }
}
