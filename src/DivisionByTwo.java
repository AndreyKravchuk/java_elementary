import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import sun.font.TrueTypeFont;

import java.util.Scanner;
/**
 * Created by My comp on 21.06.2017.
 */
public class DivisionByTwo {
    public static void main(String[] args) {
        int b = 5;
        while (b == 5) {

            System.out.println("Type number");

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (isDifisionByTwo(i) == true){
                System.out.println("number division by two without remnunt");
                break;
            }
        }
    }
    public static boolean isDifisionByTwo(int i){
        if (i % 2 == 0){
            return true;
        }
        else {
            return false;
        }

    }

}
