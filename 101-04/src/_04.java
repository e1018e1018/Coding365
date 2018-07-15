import java.util.Scanner;

public class _04 {
	static int getTriangle(int a, int b, int c) {
		if(a+b<=c || a+c<=b || b+c<=a || a<1 || b<1 || c<1) {
			return 1;
		}else 
		if(a==b && b==c) {
			return 2;
		}else
		if(a==b || b==c || a==c) {
			return 3;
		}else
		if(a!=b && b!=c && c!=a) {
			return 4;
		}else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a, b, c;

			String[] INPUT=input.nextLine().split(" ");
			a=Integer.parseInt(INPUT[0]);
			b=Integer.parseInt(INPUT[1]);
			c=Integer.parseInt(INPUT[2]);
			
			System.out.println(getTriangle(a,b,c));
			
		}
	
	
}
