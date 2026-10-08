/*
Привести матрицу к верхнетреугольному виду
(обнулить всё, что ниже главной диагонали)
*/

public class T2 {
    public static void toUpperTriangularForm(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Matrix mtr = new Matrix(true);
        mtr.fillMatrix();
        int[][] mtr0 = mtr.toTwoDimArray();
        System.out.println(mtr);

        toUpperTriangularForm(mtr0);

        mtr = new Matrix(mtr0);
        System.out.println(mtr);
    }
}
