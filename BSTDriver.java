package bst;

public class BSTDriver {

	public static void main(String[] args) {

		BInarySearchTree bst = new BInarySearchTree();

		int[] x = { 35, 52, 53, 25, 32, 10, 33 };// { 8, 33, 1024, 62, 45, 300,
													// 90, 78, 390, 1337, 3,
													// 420, 14, 800, 69, 742,
													// 10350, 2 };

		for (int i = 0; i < x.length; i++) {
			bst.insert(x[i]);
		}

		/*
		 * System.out.println("this is the height =" + bst.height());
		 * System.out.println("this is the count=" + bst.count());
		 * System.out.println("this is the max=" + bst.Min());
		 * System.out.println("this is the max=" + bst.Max());
		 */
		bst.inOrder();

		System.out.println(bst);

		System.out.println("--------------------------------------------");

		bst.balance();
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");

		System.out.println("new height after the balance =" + bst.height());
		System.out.println("new count after the balance=" + bst.count());
		System.out.println("new min after the balance=" + bst.Min());
		System.out.println("new max after the balance=" + bst.Max());

	}

}
