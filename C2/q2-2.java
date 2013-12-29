class q2_2 {
    public static Node finds(Node head, int k) {
        int i = 1;
        Node n = head;
        while (n != null) {
            if ( i == k) break;
            i++;
            n = n.next;
        }
        return n;
    }    
    public static void main(String [] args) {
        Node head = new Node(10);
        head.appendToTail(2);
        head.appendToTail(4);
        head.appendToTail(4);
        head.appendToTail(3);
        head.appendToTail(9);
        head.print_ll(head);
        Node head2 = finds(head, 3);
        head2.print_ll(head2);
    }
}
        
