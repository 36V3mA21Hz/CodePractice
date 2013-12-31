package test;

import java.util.Stack;
class Test1 {
    Stack<Integer> s1, s2, s3; 
    int tmp;
    int size;
    
    public Test1(int size) {
        this.size = size;
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        s3 = new Stack<Integer>();
        for (int i = 0; i < size; i++) s1.push(size - i);
        print_ax(s1);
    }    
               
    public void rec_move(int temp, Stack<Integer> source, Stack<Integer> dest, Stack<Integer> spare) {
        if (temp == 1) dest.push(source.pop());
        else {
            rec_move(temp - 1, source, spare, dest);
            dest.push(source.pop());
            rec_move(temp - 1, spare, dest, source);
        }
        System.out.println("s1:");
        print_ax(s1);
        System.out.println("s2:");
        print_ax(s2);
        System.out.println("s3:");
        print_ax(s3);
    }
    public void move() {
        rec_move(size, s1, s3, s2);
    }
    public void print_ax(Stack<Integer> stack) {
    	//System.out.println("New Peg:");
        int i, x;
        for (i = stack.size() - 1; i >= 0; i--) {
        	x = stack.get(i);
        	System.out.println(x);
        }
    }
    public void print() {
        print_ax(s3);
    }
    public static void main(String[] args) {
    	Test1 q = new Test1(3);
        q.move();
        q.print();
    }
}
        
        
        

