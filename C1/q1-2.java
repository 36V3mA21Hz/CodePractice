class q1_2 {
    public static String reverse(String str) {
        String newstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newstr += str.charAt(i);
        } 
        return newstr;
    }
    
    public static void main(String [] args) {
        String str = args[0];
        System.out.println(str.length());
        String newstr = reverse(str);
        System.out.println(newstr);
    }
}

