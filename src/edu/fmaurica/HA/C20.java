package edu.fmaurica.HA;

public class C20 {

	/* 
	 * The factorial function, too often miswritten
	 * https://www.tutorialspoint.com/javaexamples/method_factorial.htm
	 * http://www.javatpoint.com/factorial-program-in-java
	 * http://stackoverflow.com/questions/8183426/factorial-using-recursion-in-java
	 *  */
	private static int fact(int n) {
		if(n < 0) throw new Error();
		int res = 1;
		for (int i = 1; i <= n; i ++) {
			res = res*i;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("3! = " + fact(3)); // 6, ok
		System.out.println("5! = " + fact(5)); // 120, ok
		System.out.println("10! = " + fact(10)); // 3628800, ok
		System.out.println("100! = " + fact(100)); // 0, should be 9.332622e+157, not ok!
		// 32 bits int is too small for containing fact(int)
	}
	
}