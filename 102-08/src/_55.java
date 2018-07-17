import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class _55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		while(input.hasNext()) {
			String temp = input.nextLine();;
			if(temp.equals("-1")) {
				break;
			}
		
		long temp_1 = 0;
		long temp_2 = 1;
		long temp_3 = 0;
		int integer = 0;
		if(temp.contains(".") || Integer.parseInt(temp) <= 0) {
			System.out.println("Error");
			continue;
		}
		try{
			integer = Integer.parseInt(temp);
		}catch(NumberFormatException e) {
			System.out.println("Error");
			continue;
		}

			for(int j = 1; j < integer; j++) {
				temp_3 = temp_1 + temp_2;
				temp_1 = temp_2;
				temp_2 = temp_3;
			}
			if(integer == 1 || integer == 2) {
				temp_3 = 1;
			}
			System.out.println(temp_3);	
		}
	}
}