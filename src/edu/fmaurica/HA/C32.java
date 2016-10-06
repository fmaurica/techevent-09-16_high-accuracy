package edu.fmaurica.HA;

//SOLUTION: use rational numbers
import org.apfloat.Aprational;

public class C32 {

	public static void main(String[] args) {
		try {

			Aprational t = new Aprational("0");
			Aprational d = new Aprational("1/3");
			
			for (int i = 0; i < 13; i++) {
				System.out.println(t);
				Thread.sleep(100);
				t = t.add(d);
			}
					
			
			t = new Aprational("20971506540204");
			d = new Aprational("1/987054275914");
			System.out.println();
			for (int i = 0; i < 20; i++) {
				System.out.println(t);
				Thread.sleep(0);
				t = t.add(d);
			}			

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
