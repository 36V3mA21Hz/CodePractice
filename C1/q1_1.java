public class q1_1 {
    public boolean determine_Unique ( string [] A ) {
        int B [];
        B = new int [256];
        for (char c : A) {
            if (B[(int)c] == 1)
                return false;
            else
                B[(int)c] = 1;
        }
        return true;
    }
    
    public static void main(String [] args) {
        System.out.println( dertermine_Unique(args[1]));
    }
}


        
 



    

