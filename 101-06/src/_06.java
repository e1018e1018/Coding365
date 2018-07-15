import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			float T = 0;
			
			if((b*b-4*a*c)>0) {
				T = (float) Math.sqrt(b*b-4*a*c);
			}
			float x1 = (-b+T)/(2*a);
			float x2 = (-b-T)/(2*a);

			
		
			if((b*b-4*a*c)>=0) {
				System.out.printf("%.1f\n", x1);
				System.out.printf("%.1f\n", x2);
			}
			else{
				System.out.printf("%.1f+%.1fi\n", x1, 1.0);
				System.out.printf("%.1f-%.1fi\n", x2, 1.0);
			}
		}
	
}
