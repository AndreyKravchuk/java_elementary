package TestMatrix;

import com.sun.jmx.snmp.tasks.TaskServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by andrey.kravchuk on 27.09.2017.
 */
public class ExecutorsMain {
    public static void main(String[] args) throws Exception {

        int row = 1000;
        int row2 = 2000;
        int column = 3000;

        long start = System.currentTimeMillis();

        MakeMatrix matrixObject1 = new MakeMatrix(row,row2);
        int [][] matrix01 = matrixObject1.makeMatrix();

        MakeMatrix matrixObject2 = new MakeMatrix(row2,column);
        int [][] matrix02 = matrixObject2.makeMatrix();

        int[][] newMultiMatrix = new int[row][column];

        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future> results = new ArrayList<>();

        for (int i = 1; i < newMultiMatrix.length; i++) {
            MyCallable myCallable = new MyCallable(matrix01,matrix02,i);
            results.add(service.submit(myCallable));
        }

        boolean finished = false;

        while (!finished) {
            finished = true;
            for (Future result : results) {
                if(!result.isDone()) {
                    finished = false;
                }
            }
            System.out.println("Waiting...");
            Thread.sleep(100);
        }

        for (Future result : results) {
            result.get();
        }
        System.out.println("");
        System.out.println("Finished");
        service.shutdown();
        System.out.println(newMultiMatrix);
        System.out.println(results);
        long finish = System.currentTimeMillis();

        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
    }


}
