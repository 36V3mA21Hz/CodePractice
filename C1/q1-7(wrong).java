class q1_7 {
    public static void setz(int [][] matrix, int row, int column) {
        int [] judge;
        if (row > column) {
            judge = new int [row];
            for ( int k = 0; k < judge.length; k ++)
                judge[k] = -1;
            int k = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (matrix[i][j] == 0) {
                        judge[k] = i;
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        else {
            judge = new int [column];
            for ( int k = 0; k < judge.length; k ++)
                judge[k] = -1;
            int k = 0;
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    if (matrix[i][j] == 0) {
                        judge[k] = i;
                        break;
                    }
                }
            }
        }
        for (int k = 0; k < judge.length; k ++) {
            if (judge[k] >= 0) {
                int i = judge[k];
                if ( row > column) {
                    for ( int j = 0; j < column; j++) 
                        matrix[i][j] = 0; 
                }
                else {
                    for ( int j = 0; j < row; j++) 
                            matrix[j][i] = 0; 
                }
            }
        }
    }
    public static void main( String [] args) {
        int row = 5;
        int column = 3;
        int [] [] input;
        input = new int [row][column];
        for ( int i = 0; i < row; i++) {
            for ( int j =0; j < column; j++) {
                input [i][j] = (3-i)*(j+1);
                System.out.print(input[i][j] + ",");
            }
            System.out.print('\n');
        }
        setz(input, row, column);
        for ( int i = 0; i < row; i++) {
            for ( int j =0; j < column; j++) {
                System.out.print(input[i][j] + ",");
            }
            System.out.print('\n');
        }
    }
}
                    
