import java.util.*;

public class q3_3 extends Stack<Integer> {
	private static final long serialVersionUID = 7526471295622776147L;
    int threshold;
    int length;
    int stack_number;
    Stack<Integer> s;
    ArrayList<Stack<Integer>> stack_rec;
    
    public q3_3(int threshold) {
        this.threshold = threshold;
        length = 0;
        s = new Stack<Integer>();
        stack_rec = new ArrayList<Stack<Integer>>();
        stack_rec.add(s);
        stack_number = 0;
    }
    public void push(int value) {
    	s = stack_rec.get(stack_number);
        if (length == threshold) {
            s = new Stack<Integer>();
            s.push(value);
            System.out.println("New stack\n" + s.peek());
            length = 1;
            stack_number++;
            stack_rec.add(s);
            return;
        } else {
            s.push(value);
            System.out.println(s.peek());
            length++;
        }
        stack_rec.set(stack_number, s);
    }
    public Integer pop() {
        if (length == 0) {
            s = stack_rec.get(stack_number);
            length = threshold - 1;
            stack_number--;
            return s.pop();
        } else {
            length--;
            return s.pop();
        }
    }
    public Integer popAt(int index) {
        if (stack_rec.get(index) == null) return -1;
        else {
        	Stack<Integer> s_temp = stack_rec.get(index);
        	Integer pop_value = s_temp.pop();
        	if (pop_value == null) {
        		return -1;
        	} else {
        		return pop_value;
        	}
        }
    }

    public static void main(String[] args) {
        q3_3 s1 = new q3_3(2);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        int x = s1.popAt(3);
        System.out.println(x);
    }
}
        
        
        
            
            

