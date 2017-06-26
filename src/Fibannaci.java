/**
 * Created by andrey.kravchuk on 26.06.2017.
 */
public class Fibannaci {
    public static void main(String[] args) {
        System.out.println(fibonacci(18));
    }

    private static int fibonacci(int n){
        if (n < 2){
            return  n;
        }
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}

