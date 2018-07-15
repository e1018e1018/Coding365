import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		float one= (float) (((-b)+Math.sqrt(b*b-4*a*c))/(2*a));
		float two= (float) (((-b)-Math.sqrt(b*b-4*a*c))/(2*a));
		System.out.printf("%.1f\n",one);
		System.out.printf("%.1f",two);
	}
	
}
