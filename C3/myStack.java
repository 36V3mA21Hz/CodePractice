public class Stack {
    Node top;
    Object pop() {
        if (top != null) {
            Object item = top.item;
            top = top.next;
            return item;
        }
        return null;
    }
    void push(Object item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
    }
    void print() {
        Node vir = top;
        while (vir != null) {
            System.out.println(vir.item);
            vir = vir.next;
        }
    }
}
