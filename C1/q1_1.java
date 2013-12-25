public class q1_1 {
    public static int[] NonZeros(int[] A) {
        int nonz = 0;
        for (int i=0; i < A.length; i++) 
            if ( A[i]!=0) nonz++;
        int [] B = new int [nonz];
        int j = 0;
        for (int i=0; i < A.length; i++) {
            if ( A[i] != 0) {
                B[j] = A[i];
                j++;
            }        
        }
    return B;
    }     
    public static void main(String[] args) {
        int [] A = {1, 22, 0};
        int [] B = NonZeros(A);
        for (int i = 0; i < B.length; i++) System.out.print(B[i] + ", ");
    }
}
