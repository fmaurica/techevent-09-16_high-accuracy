package edu.fmaurica.HA;

import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

public class C42 {

	public static void main(String[] args) {
		// SOLUTION: use customized floating-point numbers
		Apfloat xx = new Apfloat("2", 4);
		Apfloat yy = ApfloatMath.sqrt(xx);
		System.out.println(yy);
		
		xx = new Apfloat("2", 1000);
		yy = ApfloatMath.sqrt(xx);
		System.out.println(yy);
	}

}
