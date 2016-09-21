package edu.fmaurica.HA;

public class C10 {

	/*
	 * Nearly All Binary Searches and Mergesorts are Broken 
	 * https://research.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html
	 */
	public static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2; // Can overflows!
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid;	// Key found
		}

		return -(low + 1); // Key not found
	}

	public static void main(String[] args) {
		int[] t = new int[1200000000]; // 4.48GB of memory needed: add -Xmx7g arg
		for(int i = 0; i < t.length; i++) {
			t[i] = i;
		}
		System.out.println(binarySearch(t, 0)); // Key found 
		System.out.println(binarySearch(t, 10000)); // Key found
		System.out.println(binarySearch(t, 1100000000)); // ArrayIndexOutOfBoundsException!
	}

}
