import java.util.*;
public class _61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int temp = 0;
		String name = null;
		while(input.hasNext()) {
			String type = input.next();
			switch(type) {
			case "a":
				temp = A;
				name = "A:";
				System.out.println("Select A");
				break;
			case "b":
				temp = B;
				name = "B:";
				System.out.println("Select B");
				break;
			case "v":
				System.out.println(name + temp);
				break;
			case "w":
				int withdraw = input.nextInt();
				if(name.equals("A:")) {
					A -= withdraw;
					System.out.println(name + "Withdraw," + A);
				}else {
					B -= withdraw;
					System.out.println(name + "Withdraw," + B);
				}
				break;
			case "s":
				int deposit = input.nextInt();
				if(name.equals("A:")) {
					A += deposit;
					System.out.println(name + "Deposit," + A);
				}else {
					B += deposit;
					System.out.println(name + "Deposit," + B);
				}
				break;
			case "p":
				float a = (float)A;
				float b = (float)B;
				int percent = (int)(a/(a+b)*100); 
				if(A == 0 && B == 0) {
					System.out.println("A:50%,B:50%");
				}else 
				if(A <= 0 && B > 0) {
					System.out.println("A:0%,B:100%");
				}else
				if(B <= 0 && A > 0) {
					System.out.println("A:100%,B:0%");
				}else{
					System.out.println("A:" + percent + "%" + ",B:" + (100-percent) + "%");
				}
				break;
			case "e":
				System.exit(1);
			}
		}
	}
}