package HomeWork.HomeWork19;

public class MainIteration {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new ThreadFirst());
        Thread thread02 = new Thread(new ThreadSecond());

        thread01.start();
        thread02.start();

    }
}
