package ClassWork.DataRaceTest;

/**
 * Created by java6 on 14.09.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MySting stringThreads = new MySting();


        Thread thread01 = new Thread(stringThreads);
        Thread thread02 = new Thread(stringThreads);
        Thread thread03 = new Thread(stringThreads);

        thread01.start();
        thread02.start();
        thread03.start();

        Thread.sleep(3000);


        System.out.println(stringThreads.myHashSet.size());
    }
}
