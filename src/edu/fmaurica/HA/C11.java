package edu.fmaurica.HA;

public class C11 {

	public static void main(String[] args) {
		System.out.println("int in [" +
							Integer.MIN_VALUE + "," + // -2^31
							Integer.MAX_VALUE + "]"); // 2^31 - 1
		
		/* Machine integer arithmetic is a modulo arithmetic */
		System.out.println("MAXINT + 1 = " + (Integer.MAX_VALUE + 1) + " = MININT");
		System.out.println("MININT - 1 = " + (Integer.MIN_VALUE - 1) + " = MAXINT");
	}

}
