import java.util.Arrays;

/**
 * Created by My comp on 16.07.2017.
 */
public class MinThreeNumberOfArray {
    public static void main(String[] args) {
        minThreeNumber();
    }
    private static void minThreeNumber(){
        int [] arr = {0,1,3,7,1,8,3,12,43,1,7,2,0};
        int [] arrMin = {100,101,102};
        for (int anArr : arr) {
            if (anArr < arrMin[0]) {
                arrMin[0] = anArr;

            } else if (anArr < arrMin[1]){
                arrMin[1] = anArr;

            } else if (anArr < arrMin[2]){
                arrMin[2] = anArr;
            }

        }
        System.out.println(Arrays.toString(arrMin));
    }
}
