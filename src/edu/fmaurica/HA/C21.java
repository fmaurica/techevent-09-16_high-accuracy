package edu.fmaurica.HA;

// SOLUTION: use arbitrary-precision integers
import java.math.BigInteger;
import org.apfloat.Apint;

public class C21 {
	private static int fact0(int n) {
		// SOLUTION: determine the ranges of your variables for which your program is correct
		if(n < 0 || n > 12) throw new Error();
		int res = 1;
		for (int i = 1; i <= n; i ++) {
			res = res*i;
		}
		return res;
	}
	
	private static Apint fact1(int n) {
		if(n < 0) throw new Error();
		Apint res = new Apint(1);
		for (int i = 1; i <= n; i ++) {
			res = res.multiply(new Apint(i));
		}
		return res;
	}
	
	private static BigInteger fact2(int n) {
		if(n < 0) throw new Error();
		BigInteger res = new BigInteger("1");
		for (int i = 1; i <= n; i ++) {
			res = res.multiply(new BigInteger(i + ""));
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("12! = " + fact0(12)); // 6, ok	
		
		System.out.println("\nUsing org.apfloat.Apint");
		System.out.println("13! = " + fact1(13) +  // 6227020800, ok
						   " > MAXINT = " + Integer.MAX_VALUE);
		System.out.println("100! = " + fact1(100)); // 9.332622e+157, ok
		System.out.println("1000! = " + fact1(1000)); // 9.332622e+157, ok
		
		System.out.println("\nUsing java.math.BigDecimal");
		System.out.println("100! = " + fact2(100)); // 9.332622e+157, ok
		System.out.println("1000! = " + fact1(1000)); // 9.332622e+157, ok

	}
	
}