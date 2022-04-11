public class RotateMatrixMain {
    public static void main(String[] args) {
        int [][] matrix = new int[5][5];
        int valueOfCell = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = valueOfCell++;
            }
        }
        printMatrix(rotateMatrixRight(matrix));
    }

    public static int[][] rotateMatrixRight(int [][] matrix){
        if (!(matrix.length == 0 || matrix.length != matrix[0].length)) {
            int n = matrix.length;

            for (int layer = 0; layer < n/2; layer++) {
                int first = layer;
                int last = n - 1 - layer;
                System.out.println("Initial Matrix at Layer: " + layer);
                printMatrix(matrix);
                for (int i = first; i < last; i++) {
                    int offset = i - first;
                    int temp = matrix[first][i]; //save top to temp
                    //printMatrix(matrix);
                    //left -> top
                    matrix[first][i] = matrix[last - offset][first];
                    //printMatrix(matrix);
                    //bottom -> left
                    matrix[last - offset][first] = matrix[last][last - offset];
                    //printMatrix(matrix);
                    //right -> bottom
                    matrix[last][last - offset] = matrix[i][last];
                    //printMatrix(matrix);
                    //top -> right
                    matrix[i][last] = temp; //right <- saved temp value
                    printMatrix(matrix);
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] Arr){
        System.out.println();
        System.out.println("------------");
        for (int[] arr:Arr) {
            System.out.println("    ");
            for (int number:arr) {
                System.out.print(number + ",");
            }
//            System.out.println("");
        }
    }
}
