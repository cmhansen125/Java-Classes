import java.util.Scanner;
public class CurrencyDemo

{

      public static void main(String[] args)

      {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter an amount in euros: ");

            double euros = in.nextDouble();

           

            double dollars = Currency.euroToDollar(euros);

            System.out.printf("%.2f euros is $%.2f", euros, dollars);

           

            in.close();

      }

}