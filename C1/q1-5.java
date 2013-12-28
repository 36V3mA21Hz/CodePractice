class q1_5 {
    public static char[] remove_spaces(char [] str) {
        int length = 0;
        for (char c : str) {
            if (c == ' ') {
                length += 3;
            }
            else length++;
        } 
        char [] str1;
        str1 = new char [length];
        int i = 0;
        for (char c : str) {
            if (c == ' ') {
                str1[i++] = '%';
                str1[i++] = '2';
                str1[i++] = '0';
            }
            else  str1[i++] = c; 
        }
        return str1;
}
    public static void main(String[] args) {
        String input = "alsl alksj aoinw";
        char[] str = input.toCharArray();
        char[] result = remove_spaces(str);
        System.out.println(result);
    }
}
