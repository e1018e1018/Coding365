import java.util.Scanner;

public class _08 {
	static String getCost(float a, float b, float c) {
		if(a<=183) {
			return "183\n183";
		}
		if(b>183 && b<383) {
			return "183\n" + (int)a;
		}
		if(c>383 && c<983) {
			return "383\n" + (int)b;
		}
		if(c>=983) {
			return "983\n" + (int)c;
		}
		return "183";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			int d=input.nextInt();
			int e=input.nextInt();
			
			float A=(float)(a*0.08 + b*0.139 + c*0.135 + d*1.128 + e*1.483);
			float B=(float)(a*0.07 + b*0.13 + c*0.121 + d*1.128 + e*1.483);
			float C=(float)(a*0.06 + b*0.108 + c*0.101 + d*1.128 + e*1.483);
			
			System.out.println(getCost(A,B,C));			
		}	
}