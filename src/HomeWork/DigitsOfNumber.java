/**
 * Created by andrey.kravchuk on 26.06.2017.
 */
public class DigitsOfNumber {
    public static void main(String[] args) {
        digits(777546);
    }

    private static int digits(int a) {
        if (a < 10) {
            System.out.println(a);
            return a;
        } else {
            int result = digits(a / 10);
            System.out.println(a % 10);
            return result;
        }

    }
}
