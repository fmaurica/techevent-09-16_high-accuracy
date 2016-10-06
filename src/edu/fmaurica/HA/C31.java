package edu.fmaurica.HA;

public class C31 {

	/*
	 * This code killed people!
	 * 
	 * Patriot Missile Defense: Software Problem Led to System Failure at Dhahran, Saudi Arabia
	 * http://www.gao.gov/products/IMTEC-92-26
	 * 
	 * The Patriot Missile Failure
	 * https://www.ima.umn.edu/~arnold/disasters/patriot.html
	 */
	public static void main(String[] args) {
		try {

			float t = 0;
			float d = 1/3f; // 0.333... in decimal, 0.0101... in binary
			for (int i = 0; i < 13; i++) {
				System.out.println(t);
				Thread.sleep(333);
				t = t + d; // There are rounding errors!
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
