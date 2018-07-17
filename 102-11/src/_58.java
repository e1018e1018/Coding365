import java.util.Scanner;

public class _58 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] coordinate = input.nextLine().split(" "); 
		float x1 = Float.parseFloat(coordinate[0]);
		float y1 = Float.parseFloat(coordinate[1]);
		float x2 = Float.parseFloat(coordinate[2]);
		float y2 = Float.parseFloat(coordinate[3]);
		float m = (float)(Math.round((y1 - y2)/(x1 - x2)*100))/100;
		float b = (float)(Math.round((x2*y1 - x1*y2)/(x2 - x1)*100))/100;
		int intM = 0;
		int intB = 0;
		int numerator = (int)Math.floor(y1-y2);
		int denominator = (int)Math.floor(x1-x2);
		
		for(int i = 2; i < denominator; i++) {
			while(numerator % i == 0 && denominator % i == 0) {
				numerator /= i;
				denominator /= i;
			}
		}
		
		if(m % 1 == 0.0) {
			intM = (int) Math.floor(m);
		}
		if(b % 1 == 0.0) {
			intB = (int) Math.floor(b);
		}
		
		String strM = Float.toString(m);
		String strB;
		if(b > 0) {
			strB = "+" + Float.toString(b);
		}else {
			strB = Float.toString(b);
		}
		String strIntM = Integer.toString(intM);
		String strIntB;
		if(intB > 0) {
			strIntB = "+" + Integer.toString(intB);
		}else {
			strIntB = Integer.toString(intB);
		}
	
		if(x1 == 0.0 && x2 == 0.0) {
			if(b % 1 == 0.0) {
				System.out.println("y=" + intB);	
			}else {
				System.out.printf("y=%.2f", b);
			}
		}else
		if(y1 == 0.0 && y2 == 0.0) {
			if(-b/m % 1 == 0) {
				System.out.printf("x=%d", -intB/intM);
			}else {
				System.out.printf("x=%.2f", -b/m);	
			}
		}else {
			if(intB != 0) {
				if(intM != 0) {
					System.out.println("y=" + strIntM + "x" + strIntB);
				}else {
					System.out.println("y=" + strM + "x" + strIntB);
				}
				System.out.println("y=" + numerator + "/" + denominator + "x" + strIntB);
			}else {
				if(intM != 0) {
					System.out.println("y=" + strIntM + "x" + strB);
				}else {
					System.out.println("y=" + strM + "x" + strB);
				}
				System.out.printf("y=" + numerator + "/" + denominator + "x" + strB);
			}
		}
	}
	
}