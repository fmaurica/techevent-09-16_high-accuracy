package edu.fmaurica.HA;

public class C31b {

	public static void main(String[] args) {
		try {

			float t = 2097150;
			float d = 1/10f;
			for (int i = 0; i < 20; i++) {
				System.out.println(t);
				Thread.sleep(100);
				t = t + d; // eventually, t == t + d
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
