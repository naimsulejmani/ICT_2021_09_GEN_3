package ict.kosovo.growth.basic.ora_6;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //array2d - matrix
        int[][] matrix = new int[3][4];
        //matrix 3x3
        int[][] matrix1 = {
                {1, 2, 3}, {2, 3, 4}, {0, 0, 0}
        };
        //jagged array
        int[][] jaggedArray1 = {
                {1, 2, 3}, {2, 3}, {3}
        };
        //nese vargu eshte 2 dimensional - per me iteru te gjitha elementet vyne se paku 2 loops
        //nese eshte 3 dimension - nevoiten 3 iterime
        for (int rowIndex = 0; rowIndex < jaggedArray1.length; rowIndex++) {
            for (int colIndex = 0; colIndex < jaggedArray1[rowIndex].length; colIndex++) {
                System.out.printf("%5d", jaggedArray1[rowIndex][colIndex]);
            }
            System.out.println();
        }
        //shembulli i bredhje se matrixes me foreach
        System.out.println("Shtypja me for_each");
        System.out.println("-----------------------");
        for (int[] row : matrix1) {
            for (int col : row) {
                System.out.printf("%5d",col);
            }
            System.out.println();
        }
    }
}
