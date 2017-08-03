import java.util.ArrayList;
/**
 * Created by java6 on 03.08.17.
 */
public class MergeTwoList {
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> mergeList = new ArrayList<>();
        for (int i = 0;i < list1.size();i++){
            mergeList.add(list1.get(i));
            mergeList.add(list2.get(i));
        }
        return mergeList;
     }
}
