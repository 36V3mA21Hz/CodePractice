public class q1_1 {
    public static int[] NonZeros(int[] A) {
        int [] B;
        int j = 0;
        for (int i=0; i < A.length; i++) {
            if ( A[i] != 0) {
                int B[j] = A[i];
                j++;
            }        
        }
    }     
    public static void main() {
        int [] A = {1, 22, 0};
        int [] B = NonZeros(A);
        for (int x in B) System.out.println(x);
    }
}
