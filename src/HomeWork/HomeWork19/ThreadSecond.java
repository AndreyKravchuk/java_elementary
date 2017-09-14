package HomeWork.HomeWork19;

public class ThreadSecond extends Thread {

    MyIteration myIteration = new MyIteration();

    @Override
    public void run() {
        try {
            sleep(4);
            for (int i = 1; i < 200; i++){
                myIteration.iteration();
                System.out.println("    " + Thread.currentThread() + " " + myIteration.j + "    ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
