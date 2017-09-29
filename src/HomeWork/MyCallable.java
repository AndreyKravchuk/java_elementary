package TestMatrix;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * Created by andrey.kravchuk on 26.09.2017.
 */
public class MyCallable implements Callable<int[]> {

    int[][]matrix1;
    int[][]matrix2;
    int index;

    public MyCallable (int [][] matrix1, int [][] matrix2, int index){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.index = index;
    }

    @Override
    public int [] call() throws Exception {
        System.out.println("Thread: " + Thread.currentThread().getName());
        int[] vector = new int[matrix2[0].length];
            for (int j = 0; j < vector.length; j++) {
                vector[j] = multiElement(index, j);
            }
        return vector;
    }

    private int multiElement(int a, int b){
        int element = 0;
        for (int e = 0; e < matrix1[0].length; e++){
            element += matrix1[a][e] * matrix2[e][b];
        }
        return element;
    }
}
