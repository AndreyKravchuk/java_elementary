import java.util.ArrayList;
/**
 * Created by andrey.kravchuk on 03.08.2017.
 */
public class TestLastFiveNumber extends LastFiveNumbers{
    public static void main(String[] args) {
        add(5);
        add(6);
        add(7);
        add(8);
        add(9);
        add(10);
        add(11);
        add(12);
        System.out.println(LastFiveNumbers.get());
    }
}
