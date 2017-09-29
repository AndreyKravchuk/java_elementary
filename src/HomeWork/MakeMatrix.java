package TestMatrix;

import java.util.Random;

/**
 * Created by andrey.kravchuk on 26.09.2017.
 */
public class MakeMatrix {
    private int row;
    private int column;

    public MakeMatrix(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int [][] makeMatrix(){
        int [][] newMatrix = new int [row][column];
        Random random = new Random();
        for (int i = 0; i < newMatrix.length; i++){
            for (int j = 0; j < newMatrix[0].length; j ++){
                newMatrix[i][j] = random.nextInt(9);
            }
        }
    return newMatrix;
    }
}
