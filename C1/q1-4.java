class q1_4 {
    public static boolean determine_Anagram(String str0, String str1) {
        if (str0.length() != str1.length()) return false;
        int length = str0.length();
        boolean [] judge;
        judge = new boolean [length];
        for (int i = 0; i < length; i++) {
            for (int j =0; j < length; j++) {
                if (str0.charAt(i) == str1.charAt(j) && !judge[j]) {
                    judge[j] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (!judge[i]) return false;
        }
        return true;
    }
    public static void main(String [] args) {
        boolean result = determine_Anagram( args[0], args[1]);
        System.out.println(result);
    }
}
