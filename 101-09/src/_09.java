import java.util.Scanner;

public class _09 {
	static String compute(int a, int b, int c) {
		double x=Math.pow(a, 2);
		double y=Math.pow(b, 2);
		double z=Math.pow(c, 2);
		if(a+b<=c || a+c<=b || b+c<=a || a<1 || b<1 || c<1) {
			return "Not Triangle";
		}
		else if(x+y==z || y+z==x || z+x==y) {
			return "Right Triangle";
		}
		else if(x+y<z || y+z<x || z+x<y) {
			return "Obtuse Triangle";
		}
		else if(x+y>z || y+z>x || z+x>y) {
			return "Acute Triangle";
		}
		return "Not Triangle";	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a, b, c;

			String[] INPUT=input.nextLine().split(" ");
			a=Integer.parseInt(INPUT[0]);
			b=Integer.parseInt(INPUT[1]);
			c=Integer.parseInt(INPUT[2]);
			
			System.out.println(compute(a,b,c));
		}	
}