class q1_7 {
    public static void setz(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || column[j])
                    matrix[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] input = new int [5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                input[i][j] = 12 - i * j;
                System.out.print(input[i][j] + ",");
            }
            System.out.print('\n');
        }
        setz(input);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(input[i][j] + ",");
            }
            System.out.print('\n');
        }
    }
}
