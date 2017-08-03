

import java.util.ArrayList;
/**
 * Created by java6 on 03.08.17.
 */
public class MainMerge {

    static ArrayList<Integer> myList1 = new ArrayList<>();
    static ArrayList<Integer> myList2 = new ArrayList<>();





    public static void main(String[] args) {
        myList1.add(3);
        myList1.add(3);
        myList1.add(3);
        myList1.add(3);
        myList2.add(4);
        myList2.add(4);
        myList2.add(4);
        myList2.add(4);

        System.out.println(MergeTwoList.merge(myList1,myList2));

    }
}
