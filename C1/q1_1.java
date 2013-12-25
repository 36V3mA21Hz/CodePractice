class q1_1 {
    public static boolean determine(String A) {
        int B [];
        B = new int [256];
        for (int i = 0; i < A.length(); i ++) {
            int c = A.charAt(i);
            if (B[c] == 1)
                return false;
            else
                B[c] = 1;
        }
        return true;
    }
    
    public static void main(String [] args) {
        String A = args[0];
        boolean x = determine(A);
        System.out.println(x);
    }
}


        
 



    

