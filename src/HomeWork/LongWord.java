/**
 * Created by My comp on 18.07.2017.
 */
public class LongWord {
    public static void main(String[] args) {
        String arr [] = {"abra", "abrakadarbra", "nowords", "yellow"};
        int a = 0;
        int b;
        String longWord = "a";
        for (String anArr : arr) {
            b = anArr.length();
            if (b > a) {
                longWord = anArr;
                a = anArr.length();
            }

        }
        System.out.println(longWord);
    }
}
