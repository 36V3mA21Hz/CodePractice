class q2_1 {
    public static void remove_duplicate(Node head) {
        Node n1 = head;
        while (n1.next != null) {
            int d1 = n1.data;
            Node n2 = n1.next;
            Node n2_prev = n1;
            while (n2 != null) {
                if (d1 == n2.data) n2_prev.next = n2.next;
                else  n2_prev = n2;
                n2 = n2.next;
            }
            n1 = n1.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(10);
        head.print_ll(head);
        remove_duplicate(head);
        head.print_ll(head);
    }
}
