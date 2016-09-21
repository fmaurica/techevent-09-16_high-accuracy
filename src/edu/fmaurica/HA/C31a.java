package edu.fmaurica.HA;

public class C31a {

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
			float d = 1/10f; // In binary: 0.1111... Cannot be exactly represented!
			for (int i = 0; i < 20; i++) {
				System.out.println(t);
				Thread.sleep(100);
				t = t + d; // There are rounding errors!
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
