class q1_6 {
    public static void rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n/2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }
    public static void main(String [] args) {
        int [] [] input;
        input = new int [4][4];
        int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                input[i][j] = 4*i +j;
                System.out.print(input[i][j] + ",");
            }
            System.out.print('\n');
        }
        rotate(input, size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(input[i][j] + ",");
            }
            System.out.print('\n');
        }
    }
}
