class q2_4 {
    public static Node add_ll(Node head1, Node head2) {
        Node n1 = head1;
        Node n2 = head2;
        int d, carry = 0;
        Node new_head;
        d = n1.data + n2.data + carry;
        if (d > 9) {
            d = d - 10;
            carry++ ;
        }
        else carry = 0;
        new_head = new Node(d);
        Node n_prev = new_head;
        n1 = n1.next;
        n2 = n2.next;
        while (n1 != null && n2 != null) {
            d = n1.data + n2.data + carry;
            if (d > 9) {
                d = d - 10;
                carry++ ;
            }
            else carry = 0;
            Node n = new Node(d);
            n_prev.next = n;
            n_prev = n;
            n1 = n1.next;
            n2 = n2.next;
        }
        Node n_tail;
        if (n1 == null) n_tail = n2;
        else n_tail = n1;
        while (n_tail != null) {
            d = n_tail.data + carry;
            if (d > 9) {
                d = d - 10;
                carry++ ;
            }
            else carry = 0;
            Node n = new Node(d);
            n_prev.next = n;
            n_prev = n;
            n_tail = n_tail.next;
        }
        return new_head;
    }
    public static void main(String[] args) {
        Node head1 = new Node(9);
        head1.appendToTail(0);
        head1.appendToTail(2);
        head1.appendToTail(8);
        head1.appendToTail(1);
        Node head2 = new Node(7);
        head2.appendToTail(5);
        head2.appendToTail(3);
        Node new_head = add_ll(head1, head2);
        head1.print_ll(head1);
        head2.print_ll(head2);
        new_head.print_ll(new_head);
    }
}


