package bst;

public class BInarySearchTree {
	private BSTNode root = null;
	private int[] A;
	private int i;
	// A and i exist for evrything that exist in the binarySearch Tree

	public boolean IsEmpty() {

		return root == null;
	}

	public int count() {

		if (IsEmpty())

			return 0;

		else
			return root.count();
	}

	public int height() {

		if (IsEmpty())
			return 0;

		else
			return root.height();
	}

	public void inOrder() {

		if (!IsEmpty()) {

			A = new int[count()]; // initialise array in a particular size
			i = 0;
			root.inOrder();

		}

	}

	public void balance() {
		inOrder();
		root = null;
		bisectionInsert(0, A.length - 1);

	}
	/*
	 * inORder() root = null; bisectionInsert(0 ; A.lenght()-1);
	 * 
	 * int middle = (first last)
	 * 
	 * insert(A[middle]);
	 * 
	 * bisectionInsert(first,middle) bisectionInsert(middle+1, last)
	 * 
	 */

	public void bisectionInsert(int first, int last) {
		// meaning of the base case !

		if (first <= last) {
			int middle = (first + last) / 2;
			insert(A[middle]);

			bisectionInsert(first, middle - 1);
			bisectionInsert(middle + 1, last);
		}

		// always find the middle and insert.

	}

	public void insert(int value) {

		if (IsEmpty()) {
			root = new BSTNode(value);

		} else
			root.insert(value);
	}

	public int Min() {

		return root.Min();

	}

	public int Max() {

		return root.Max();

	}

	public class BSTNode {
		int x;
		BSTNode left = null;
		BSTNode right = null;

		public BSTNode(int x) {

			this.x = x;
		}

		public int count() {
			int c = 1;
			if (left != null)
				c += left.count();
			if (right != null)
				c += right.count();

			return c;

		}

		public int height() {

			int HL = 0;
			int HR = 0;

			if (left != null)
				HL = left.height();

			if (right != null)
				HL = right.height();

			return 1 + maxim(HL, HR);

		}

		public int maxim(int a, int b) {

			if (a >= b)
				return a;

			else
				return b;

			// with recursion else return max(b,a);
		}

		public void inOrder() {

			if (left != null)
				left.inOrder();

			A[i++] = x;

			if (right != null)
				right.inOrder();

		}

		public void insert(int value) {
			if (value < x) {

				if (left != null)
					left.insert(value);

				else
					left = new BSTNode(value);

			}
			if (value > x) {

				if (right != null)
					right.insert(value);

				else
					right = new BSTNode(value);

			}

		}

		public int Min() {

			if (left != null)
				return left.Min();
			else
				return x;
		}

		public int Max() {

			if (right != null)
				return right.Max();

			else
				return x;
		}

	}
}