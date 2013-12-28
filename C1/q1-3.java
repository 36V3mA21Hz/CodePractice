class q1_3 {
    public static void trim(char [] str) {
        if (str == null) return;
        if (str.length < 2) return;
        int tail = 1;
        for (int i = 1; i < str.length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == tail) {
                str[tail++] = str[i];
            }
        }
        str[tail] = '\0';
    } 
    public static void main(String [] args) {
        char [] str = args[0].toCharArray();
        trim(str);
        System.out.println(str);
    }
} 
