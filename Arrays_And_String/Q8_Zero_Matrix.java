//QUESTION-->
//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
// column are set to 0. 

//ANSWER-->
public class Q8_Zero_Matrix {
    void ansmethod(int[][] mainmatrix) {
        boolean[] col = new boolean[mainmatrix[0].length]; // Corrected to mainmatrix[0].length
        boolean[] row = new boolean[mainmatrix.length];

        for (int i = 0; i < mainmatrix.length; i++) {
            for (int j = 0; j < mainmatrix[0].length; j++) {
                if (mainmatrix[i][j] == 0) {
                    col[j] = true;
                    row[i] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                removingrow(mainmatrix, i);
            }
        }

        for (int j = 0; j < col.length; j++) {
            if (col[j]) {
                removingcol(mainmatrix, j);
            }
        }
    }

    void removingrow(int[][] mainmatrix, int row) {
        for (int j = 0; j < mainmatrix[0].length; j++) {
            mainmatrix[row][j] = 0;
        }
    }

    void removingcol(int[][] mainmatrix, int col) {
        for (int i = 0; i < mainmatrix.length; i++) { // Corrected to mainmatrix.length
            mainmatrix[i][col] = 0;
        }
    }

    public static void main(String[] args) {
        Q8_Zero_Matrix zm = new Q8_Zero_Matrix();
        int[][] matrix = {
            {5, 9, 8},{1, 0, 11},{14, 20, 12}
        };
        zm.ansmethod(matrix);

        // Print the modified matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
