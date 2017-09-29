import java.util.Scanner;

/**
 * Created by My comp on 21.06.2017.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        int b = 5;
        while (b > 0) {
            System.out.println("Type temperature in fahrenheit or 'exit'");

            Scanner scanner1 = new Scanner(System.in);
            String a = scanner1.next();

            Scanner scanner2 = new Scanner(System.in);
            int i = scanner2.nextInt();

            if (a == "exit") {
                break;
            }
            System.out.println(toCelsius(i));
        }
    }

    public static int toCelsius(int i) { return ( i - 32 ) * 5 / 9; } //method toCelsius

}
