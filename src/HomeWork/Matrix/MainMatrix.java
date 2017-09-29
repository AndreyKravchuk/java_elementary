package TestMatrix;

import java.util.Arrays;

/**
 * Created by andrey.kravchuk on 26.09.2017.
 */
public class MainMatrix {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        MakeMatrix objectMatrix1 = new MakeMatrix(1000,2000);
        int [][] matrix1 = objectMatrix1.makeMatrix();

        MakeMatrix objectMatrix2 = new MakeMatrix(2000,3000);
        int [][] matrix2 = objectMatrix2.makeMatrix();

        MultiMatrix multiMatrix01 = new MultiMatrix(matrix1, matrix2);
        System.out.println(Arrays.deepToString(multiMatrix01.multiMatrix()));


        long finish = System.currentTimeMillis();

        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);




    }
}
