import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

			int x=input.nextInt();
			int y=input.nextInt();
			int z=input.nextInt();
			int A=380;
			int B=1200;
			int C=180;
			int total=0;
			if(x<=10 && x>=1) {
				total+=A*x;
			}
			if(y<=10 && y>=1) {
				total+=B*y;
			}
			if(z<=10 && z>=1) {
				total+=C*z;
			}
			if(x<=20 && x>=11) {
				total+=0.9*A*x;
			}
			if(y<=20 && y>=11) {
				total+=0.95*B*y;
			}
			if(z<=20 && z>=11) {
				total+=0.85*C*z;
			}
			if(x<=30 && x>=21) {
				total+=0.85*A*x;
			}
			if(y<=30 && y>=21) {
				total+=0.85*B*y;
			}
			if(z<=30 && z>=21) {
				total+=0.8*C*z;
			}
			if(x>30) {
				total+=0.8*A*x;
			}
			if(y>30) {
				total+=0.8*B*y;
			}
			if(z>30) {
				total+=0.7*C*z;
			}
			System.out.printf("%d\n",total);
		}
	

}
