package ClassWork.DataRaceTest;

import java.lang.reflect.Array;
import java.util.HashSet;

/**
 * Created by java6 on 14.09.17.
 */
public class MySting {
    private String myString = "A typical example of a race condition may occur when a logic " +
            "gate combines signals that have traveled along different paths from the same source. " +
            "The inputs to the gate can change at slightly different times in response to a change " +
            "in the source signal. The output may, for a brief period, change to an unwanted state " +
            "before settling back to the designed state.";

    private String [] myArr = myString.split(" ");



    public HashSet<String> myHashSet = new HashSet<>();



    public void inputSet() {
        for (int i = 0; i < myArr.length; i++){
            myHashSet.add(myArr[i]);
        }
    }



}
