package weeklyChallenge;

public class MagicIndex {
	

		// perform modified binary search
		public int search(int[] A, int start, int end) {
			if (start <= end) {
				int num = (start + end) / 2;
				if (num == A[num]) // check for magic index.
					return num;
				if (num > A[num]) { 
					return search(A, num + 1, end);
				} else {
					return search(A, start, num - 1);
				}
			}
			return -1;
		}

		public static void main(String[] args) {
			//a = array and m is the magic index
			int[] A = { 0, 1, 0, 3, 4, 5 };
			MagicIndex m = new MagicIndex();
			System.out.println("Magic index " + m.search(A, 0, A.length - 1));
		}

	}