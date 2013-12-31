public class Node {
    Node next = null;
    Object item;
    public Node(Object item) { this.item = item; }
    void appendToTail(Object item) {
        Node end = new Node(item);
        Node n = this;
        while (n.next != null) { n = n.next; }
        n.next = end;
    }
    void print_ll(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.item + "->"); 
            n = n.next;
        }
        System.out.print("Null\n");
    }
}
    
 
