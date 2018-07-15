import java.util.Scanner;


public class _03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		double a=input.nextDouble();
		double b=input.nextDouble();
		int temp_1 = (int)(a/b*100);
		float temp_2 = (float)temp_1/100;
		System.out.printf("Sum:"+"%.2f\n",a+b);
		System.out.printf("Difference:"+"%.2f\n",Math.abs(a-b));
		System.out.printf("Product:"+"%.2f\n",a*b);
		if(a==0 || b==0) {
			System.out.printf("Quotient:"+"%.2f\n",0.00);
		}else {
			System.out.printf("Quotient:"+"%.2f\n",temp_2);			
		}
	}

}
