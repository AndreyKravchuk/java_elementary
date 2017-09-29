/**
 * Created by My comp on 21.06.2017.
 */
public class PrintChess {
    public static void main(String[] args) {
        String [][] arr = new String[10][10];

        for (int i = 0; i < 10 ; i++){
            for (int j = 0; j < 10 ;j++){
//                if (i % 2 == 0 & j % 2 == 0 | i % 2 != 0 & j % 2 != 0){
                if (i % 2 == j % 2){

                    arr[i][j] = "   *";
                }
                else {
                    arr[i][j] = "    ";
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
