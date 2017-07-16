/**
 * Created by My comp on 16.07.2017.
 */
public class BrickToHole {
    public static void main(String[] args) {
        System.out.println(brickToHole(5,7,15,10));
    }



    public static int brickToHole(int x,int y,int z,int d){
        int [] arr = {x,y,z,x};
        int parties = 0;
        for(int i = 0; i <3; i++){
            double diagonal = Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2));
            if (diagonal < d){
                parties += 1;

            }

        }

    return parties;
    }
//    public static int brickToHole(int x,int y,int z,int d){
//        double a = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
//        double b = Math.sqrt(Math.pow(y, 2) + Math.pow(z, 2));
//        double c = Math.sqrt(Math.pow(x, 2) + Math.pow(z, 2));
//        int parties = 0;
//        if (a < d){
//            parties += 1;
//        }
//        if (b < d){
//            parties += 1;
//        }
//        if (c < d){
//            parties += 1;
//        }
//        return parties;
//    }



}
