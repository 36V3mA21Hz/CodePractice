import java.util.*;
class q3_5 {
    Stack<Integer> front, back;

    public q3_5() {
        front = new Stack<Integer>();
        back = new Stack<Integer>();
    }
    
    public void enqueue(int value) {
        front.push(value);
    }

    public Integer dequeue() {
        if (back.empty() && front.empty()) return -1;
        if (back.empty()) {
            while (!front.empty()) back.push(front.pop());
        }
        int x = back.pop();
        System.out.println("The dequeue: " + x);
        return x;
    }   
    public void print_ax(Stack<Integer> stack) {
        int i, x;
        if (stack.empty()) {
            System.out.println("Empty");
            return;
        }
        for (i = stack.size() - 1; i >= 0; i--) {
        	x = stack.get(i);
        	System.out.println(x);
        }
    }
    public void print() {
        System.out.println("front:");
        print_ax(front);
        System.out.println("back:");
        print_ax(back);
    }
    public static void main(String[] args) {
        q3_5 q = new q3_5();
        int x;
        q.enqueue(1);    
        q.enqueue(2);    
        q.enqueue(3);    
        q.enqueue(4);    
        q.enqueue(5);    
        q.print();
        x = q.dequeue();
        x = q.dequeue();
        x = q.dequeue();
        q.enqueue(6);    
        q.enqueue(7);    
        q.print();
        x = q.dequeue();
        x = q.dequeue();
        x = q.dequeue();
        x = q.dequeue();
        x = q.dequeue();
        x = q.dequeue();
        q.print();
    }
}
    
                
        
        
        
