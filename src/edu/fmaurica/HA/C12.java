package edu.fmaurica.HA;

public class C12 {

	public static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2; // SOLUTION: rewrite
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid;
		}

		return -(low + 1);
	}

	public static void main(String[] args) {
		int[] t = new int[1200000000];
		for(int i = 0; i < t.length; i++) {
			t[i] = i;
		}
		System.out.println(binarySearch(t, 0)); // Key found 
		System.out.println(binarySearch(t, 10000)); // Key found
		System.out.println(binarySearch(t, 1100000000)); // Key found
	}

}
