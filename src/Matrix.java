import java.util.Random;

public class Matrix {
    private final int[][] matrix;
    Random r = new Random();

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
    }
    public Matrix(int[][] arr) {
        this(arr.length, arr[0].length);
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(arr[i], 0, matrix[i], 0, matrix[i].length);
        }
    }
    public Matrix(boolean square) {
        if (!square) {
            int rows = r.nextInt(2, 5), columns = rows + r.nextInt(1, 3);
            matrix = new int[rows][columns];
        } else {
            int size = r.nextInt(2, 5);
            matrix = new int[size][size];
        }
    }

    public static void fillMatrix(int[][] mtr) {
        Random r = new Random();
        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < mtr[i].length; j++) {
                mtr[i][j] = r.nextInt(-17, 31);
            }
        }
    }
    public void fillMatrix() {
        fillMatrix(matrix);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            sb.append("[");
            for (int i = 0; i < row.length; i++) {
                sb.append(row[i]);
                if (i < (row.length - 1)) sb.append(", ");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    public int[][] toTwoDimArray() {
        int[][] arr = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(matrix[i], 0, arr[i], 0, arr[0].length);
        }
        return arr;
    }
}
