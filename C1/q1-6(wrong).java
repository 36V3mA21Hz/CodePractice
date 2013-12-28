class q1_6 {
    public static int [] [] rotate(int [] [] image, int size) {
        int [] [] result;
        result = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j =0; j < size; j++) {
                result[j][size-i-1] = image[i][j];
            }
        }
        return result;
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
        int [] [] output = rotate( input, size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                input[i][j] = 4*i +j;
                System.out.print(output[i][j] + ",");
            }
            System.out.print('\n');
        }
    }
}
        
            
