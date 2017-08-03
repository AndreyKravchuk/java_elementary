import java.util.ArrayList;
/**
 * Created by andrey.kravchuk on 03.08.2017.
 */
public class LastFiveNumbers {
    static ArrayList<Integer> list1 = new ArrayList<>(5);

    public static void add(int a){
        list1.add(a);
        if (list1.size() >= 6){
            list1.remove(0);
        }
    }

    public static ArrayList<Integer> get(){
        return list1;
    }

}
