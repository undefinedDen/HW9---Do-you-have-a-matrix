package app;

public class Main {
    //multyplayPair имеет значение 1 потому что если оно будет 0 то  при умножении ответ всегда ноль

    static int multiplyPair = 1;
    static int multiplyNotPair = 1;
    static int sumPair;
    static int sumNotPair;
    final static int ROWANDCOLUMN = 4;

    public static void main(String[] args) {

        int[][] arrays = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("MATRIX 4x4:");

        for (int[] arr : arrays) {
            for (int matrix : arr) {
                System.out.print(matrix + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i % 2 == 0) {
                    sumPair += arrays[i][j];
                }
                if (i % 2 != 0) {
                    sumNotPair += arrays[i][j];
                }
                if (j % 2 == 0) {
                    multiplyPair *= arrays[i][j];
                }
                if (j % 2 != 0) {
                    multiplyNotPair *= arrays[i][j];
                }

            }
        }

        boolean isMagicSquare = true;
        int sumOfRightDiagonal = 0;
        int sumOfLeftDiagonal = 0;
        int rowSum = 0;
        int columnSum = 0;

        for (int i = 0; i < ROWANDCOLUMN; i++) {

            sumOfLeftDiagonal += arrays[i][i];
            sumOfRightDiagonal += arrays[i][ROWANDCOLUMN - 1 - i];

        }

        if (sumOfLeftDiagonal != sumOfRightDiagonal) {
            isMagicSquare = false;
        }

        for (int i = 0; i < ROWANDCOLUMN; i++) {
            for (int j = 0; j < ROWANDCOLUMN; j++) {
                rowSum = arrays[i][i];
                columnSum = arrays[j][i];

            }
        }

        if (rowSum != columnSum || columnSum != sumOfLeftDiagonal) {
            isMagicSquare = false;
        }

        System.out.println("\n");
        System.out.println("Sum of element into paired row(0, 2): " + sumPair +
                "\n Sum of element into not paired row(1, 3): " + sumNotPair +
                "\n Product of element into paired column(0, 2): " + multiplyPair +
                "\n Product of element into paired column(1, 3):" + multiplyNotPair +
                "\n -----------------------------------------------------");
        if (isMagicSquare) {
            System.out.println("The matrix is magic square!");
        } else {
            System.out.println("The matrix is not magic square!");
        }


    }
}
