package ClassWork.Read;

import java.util.Scanner;

/**
 * Created by java6 on 17.08.17.
 */
public class ConsoleReader implements Reader {



@Override
    public String readMyFile() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
    return s;
    }

}
