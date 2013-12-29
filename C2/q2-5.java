class q2_5 {
    public static Node find_circular(Node head) {
        Node n = head;
        Node p;
        if (n == null) return null;
        int i = 0, j = 0;
        while (n != null) {
            if (j > 10) break;
            p = n.next;    
            System.out.println("n.data:" + n.data);
            while (p != null) {
                System.out.println("p.data:" + p.data);
                if (i > 10) {
                    i = 0;
                    break;
                }
                if (p.data == n.data) return p;
                p = p.next;
                i++;
            }
            n = n.next;
            j++;
        }
        return null;
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        Node n = head;
        Node n_cir = null;
        int i = 1;
        while (n.next != null) {
            if (i++ == 3) n_cir = n;
            n = n.next;    
        }
        n.next = n_cir;
        Node n_enter = find_circular(head);
        System.out.println(n_enter.data);
    }
}
