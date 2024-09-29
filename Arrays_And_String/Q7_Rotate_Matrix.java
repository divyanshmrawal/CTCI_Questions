public class RotateMatrix {

    // Method to rotate the matrix by 90 degrees clockwise
    public static boolean rotate(int[][] matrix) {
        // Check if the matrix is valid (non-empty and square)
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length; // Size of the matrix

        // Loop through each layer (outermost to innermost)
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;          // First index of the layer
            int last = n - 1 - layer;   // Last index of the layer

            // Rotate the elements in the current layer
            for (int i = first; i < last; i++) {
                int offset = i - first;  // Offset to adjust positions

                // Save the top element
                int top = matrix[first][i];

                // Move left element to the top
                matrix[first][i] = matrix[last - offset][first];

                // Move bottom element to the left
                matrix[last - offset][first] = matrix[last][last - offset];

                // Move right element to the bottom
                matrix[last][last - offset] = matrix[i][last];

                // Move saved top element to the right
                matrix[i][last] = top;
            }
        }

        return true; // Rotation successful
    }

    // Helper method to print the matrix (for testing)
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(); // For spacing between outputs
    }

    public static void main(String[] args) {
        // Example 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix
        rotate(matrix);

        // Print the rotated matrix
        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}