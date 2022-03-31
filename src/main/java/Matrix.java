import java.util.ArrayList;

public class Matrix {

    public static ArrayList<Integer> indexesOfNullColumns(int[][] matrix) {
        ArrayList<Integer> indexesOfNullColumns = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[j][i] != 0){
                    break;
                }
                if (j == matrix.length-1){
                    indexesOfNullColumns.add(i);
                }
            }
        }
        return indexesOfNullColumns;
    }

    public static int[] indexOfMaximum(int[][] matrix) {
        int[] indexOfMaximum = new int[2];
        int sorMax = 0;
        int oszlopMax = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[sorMax][oszlopMax] < matrix[i][j]){
                    sorMax = i;
                    oszlopMax = j;
                    indexOfMaximum[0] = sorMax;
                    indexOfMaximum[1] = oszlopMax;
                }
            }
        }

        return indexOfMaximum;
    }
}
