import java.util.Scanner;

/**
 * Created by My comp on 21.06.2017.
 */
public class TwoInDegree {
    public static void main(String[] args) {
        int b = 5;
        while (b == 5) {

            System.out.println("Type number");

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (isNumberDegreeTwo(i) == true){
                System.out.println("number is degree two");
                break;
            }
            else {
                System.out.println("number is not degree two");
            }
        }
    }

    public static boolean isNumberDegreeTwo(int b) {

        for (int i = 0; i<10; i++){
            int c = 2 << i;
            if (b == c) {
                return true;
            }

        }
    return false;
    }

}
