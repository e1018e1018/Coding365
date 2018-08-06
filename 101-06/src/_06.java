import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			float T = b*b-4*a*c;
			float x3 = 0,x4 = 0;
			
			if(T >= 0) {
				T = (float) Math.sqrt(b*b-4*a*c);
				float x1 = (int) (((-b+Math.sqrt(T))/(2*a)*10)/10.0);
				float x2 = (int) (((-b-Math.sqrt(T))/(2*a)*10)/10.0);
		        System.out.printf("%.1f\n", x1);
		        System.out.printf("%.1f\n", x2);
		        System.exit(1);
			}else if(T < 0){
			    x3 =  (float) (((-b)*10/(2*a))/10.0);
			    x4 = (float) (((Math.sqrt(Math.abs(T)))/(2*a)*10)/10.0);

			}

			if(x4<0) {
				x4 = Math.abs(x4);
				System.out.printf("%.1f-%.1fi\n", x3, x4);
				System.out.printf("%.1f+%.1fi\n", x3, x4);
			}else if(x4 >= 0){
				System.out.printf("%.1f+%.1fi\n", x3, x4);
				System.out.printf("%.1f-%.1fi\n", x3, x4);
			}
		}
	
}
