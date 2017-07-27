import java.util.ArrayList;

/**
 * Created by user on 27.07.2017.
 */
public class SumOfTwo {
    public ArrayList<Integer> newlist = new ArrayList<>();
    public static ArrayList<Integer> resultList = new ArrayList<>();
    public int number;

    public static ArrayList<Integer> sumOfNumber(ArrayList<Integer> newlist, int number){

        for (int i = 0; i < newlist.size();i++){
            int secondNumber = number - newlist.get(i);
            for (int j =0; j < newlist.size(); j++){

                if (secondNumber == newlist.get(j)){
                    int firstNumber = number - newlist.get(j);
                    resultList.add(firstNumber);
                    resultList.add(secondNumber);
                }
            }


        }
    return resultList;
   }



    public static void main(String[] args) {
        ArrayList<Integer> mylist= new ArrayList<>();
        mylist.add(5);
        mylist.add(20);
        mylist.add(3);
        mylist.add(1);
        mylist.add(15);
        mylist.add(10);
        mylist.add(7);
        mylist.add(8);
        mylist.add(9);
        mylist.add(12);

        int x = 25;

        System.out.println(sumOfNumber(mylist,x));


}


    }
