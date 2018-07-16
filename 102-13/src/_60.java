import java.util.Scanner;

public class _60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		int slashA = a.indexOf("/");
		int slashB = b.indexOf("/");
		int a1 = Integer.parseInt(a.substring(0, slashA));
		int a2 = Integer.parseInt(a.substring(slashA + 1, a.length()));
		int b1 = Integer.parseInt(b.substring(0, slashB));
		int b2 = Integer.parseInt(b.substring(slashB + 1, b.length()));
		
		if(a2 < 0) {
			if(a1 < 0) {
				a1 = Math.abs(a1);
				a2 = Math.abs(a2);
			}
			a1 *= -1;
			a2 = Math.abs(a2);
		}
		if(b2 < 0) {
			if(b1 < 0) {
				b1 = Math.abs(b1);
				b2 = Math.abs(b2);
			}
			b1 *= -1;
			b2 = Math.abs(b2);
		}
		input.close();
		
		System.out.println(plus(a1, a2, b1, b2));
		System.out.println(multiply(a1, a2, b1, b2));
		
	}
	
	static String plus(int a1, int a2, int b1, int b2) {
		if(a1 == 0 || a2 == 0 || b1 == 0 || b2 == 0) {
			return "ERROR";
		}
		int temp_a2 = a2;
		int integer = 0;
		int numerator;
		if(a2 != b2) {
			a1 *= b2;
			a2 *= b2;
			b1 *= temp_a2;
			b2 *= temp_a2;
		}
		numerator = a1 + b1;
		while(Math.abs(numerator) >= b2) {
			if(numerator > 0) {
				numerator -= b2;
				integer++;
			}else {
				numerator = Math.abs(numerator + b2);
				integer--;
			}		
		}
		if(numerator != 0) {
			if(integer == 0) {
				for(int i = 2; i < b2; i++) {
					while(numerator % i == 0 && b2 % i == 0) {
						numerator /= i;
						b2 /= i;
					}
				}
				return String.format("%d/%d", numerator, b2);
			}else {
				for(int i = 2; i < b2; i++) {
					while(numerator % i == 0 && b2 % i == 0) {
						numerator /= i;
						b2 /= i;
					}
				}
				return String.format("%d(%d/%d)", integer, numerator, b2);
			}
		}else {	
			return String.format("%d", integer);
		}
	}
	
	static String multiply(int a1, int a2, int b1, int b2) {
		if(a1 == 0 || a2 == 0 || b1 == 0 || b2 == 0) {
			return "ERROR";
		}
		int numerator = a1 * b1;
		int denominator = a2 * b2;

		for(int i = 2; i < denominator; i++) {
			while(numerator % i == 0 && denominator % i == 0) {
				numerator /= i;
				denominator /= i;
			}
		}
		return String.format("%d/%d", numerator, denominator);
	}

}
