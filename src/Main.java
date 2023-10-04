public class Main {
    public static void main(String[] args) {
        int studNum = 9;
        int C5 = studNum % 5;
        int C7 = studNum % 7;
        int C11 = studNum % 11;

        System.out.println("Student number: " + studNum);
        System.out.println("C5 = " + C5 + " : C = A x B");
        System.out.printf("C7 = " + C7 + " : short");
        System.out.println("C11 = " + C11 + " : avg on each column");

        short[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };
        short[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int rows1 = A.length;
        int cols1 = A[0].length;
        int rows2 = B.length;
        int cols2 = B[0].length;
        short[][] C = new short[rows1][cols2];

        if (cols1 != rows2 & rows1 != cols2) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print C
        System.out.println("C :");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        short[] averages = new short[rows1];
        for (int column=0; column < rows1; column++){
            for (int row=0; row < rows1; row++){
                averages[column] += C[row][column];
            }
            averages[column] /= rows1;
        }

        System.out.println("Averages:");
        for (short i :
                averages) {
            System.out.print(i + " ");
        }
    }
}