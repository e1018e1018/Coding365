import java.util.Scanner;

public class _52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int digit = input.nextInt();
		int num = input.nextInt();
		int quotient = 0;
		String output = "";
		
		if(digit > 9 || digit < 2 || num < 0 || num > 10000000) {
			System.out.println(-1);
			System.exit(1);
		}
		
		   while(num != 0)
		   {
		     int remainder = num % digit;
		     quotient = num / digit ;
		     num = quotient;
		     output += remainder;
		   }
		   String sort[] = output.split("");		   
		   for(int i = sort.length - 1; i >= 0; i--) {
			   System.out.print(sort[i]);
		   }
	}
}