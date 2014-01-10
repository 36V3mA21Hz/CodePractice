package test3;
class Test3 {
	int[] A;
	public Test3(int[] A) {
		this.A = A;
	}
    void insert_aux(mTreeNode n, int[] A, int[] B, int h, int k) {
        if (k == h) return;
        else if (n.left == null  && B[0] < A.length) {
            mTreeNode n2 = new mTreeNode(A[B[0]++]);
            n.left = n2;
        } else return;
        insert_aux(n.left, A, B, h, k+1);
        if (k == h) return;
        else if (n.right == null && B[0] < A.length){
            mTreeNode n2 = new mTreeNode(A[B[0]++]);
            n.right = n2;
        } else return;
        insert_aux(n.right, A, B, h, k+1);
     }
    void print_aux(mTreeNode root) {
        if (root == null) return;
        print_aux(root.left);
        System.out.println(root.key);
        print_aux(root.right);
    }
    public void insert(int[] A) {
    	int[] B = new int[1];
    	B[0] = 1;
    	int h = 3;
        int x = A[0];
    	mTreeNode root = new mTreeNode(x);
    	insert_aux(root, A, B, h, 1);
        print_aux(root);
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
    	Test3 t3 = new Test3(A);
    	t3.insert(A);
    }  
}
