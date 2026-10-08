/*
Заменить элементы матрицы, которые больше или равны
среднего арифметического матрицы на 255, остальные на 0.
*/

public class T1 {
    public static double average(int[][] matrix) {
        int s = 0;
        for (int[] row : matrix) {
            for (int i : row) {
                s += i;
            }
        }
        return (double)s / (matrix.length * matrix[0].length);
    }

    public static void colourIt(int[][] matrix) {
        double average = average(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] >= average) matrix[i][j] = 255;
                else matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Matrix mtr = new Matrix(true);
        mtr.fillMatrix();
        int[][] mtr0 = mtr.toTwoDimArray();
        System.out.println(mtr);

        System.out.println(average(mtr0));
        colourIt(mtr0);

        mtr = new Matrix(mtr0);
        System.out.println(mtr);
    }
}
