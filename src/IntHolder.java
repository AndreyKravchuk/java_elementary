import java.util.Arrays;

/**
 * Created by user on 19.07.2017.
 */
public class IntHolder {
   private static int arrInt [] = {12,34,2,5,7,0,43,123,-56,89,45};

    private static int sum(){
        int sum = 0;
        for (int anArr : arrInt){
            sum += anArr;
        }
        return sum;
    }

    private static int size(){
        return arrInt.length;
    }

    private static double averag(){
        return sum()/size();
    }

    private static void joinNumberToArray(){
        arrInt[12] = 3;
    }


    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(size());
        System.out.println(averag());
        System.out.println(Arrays.toString(arrInt));
//        joinNumberToArray();
        System.out.println(Arrays.toString(arrInt));
    }

}
