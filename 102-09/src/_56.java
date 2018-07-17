import java.util.InputMismatchException;
import java.util.Scanner;

public class _56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String type = input.nextLine();
		String[] split = type.split(" "); 
		float N = 0;
		float C = 0;
		int W = 0;

		try{
			N = Float.parseFloat(split[0]);
			C = Float.parseFloat(split[1]);
			W = Integer.parseInt(split[2]);
		}catch(InputMismatchException err_1) {
			System.out.println("Error");
			System.exit(1);
		}catch(NumberFormatException err_2) {
			System.out.println("Error");
			System.exit(1);
		}
		if(N <= -100 || N >= 0 || C <=0 || C >= 30000 || W <=0 || W >= 10000) {
			System.out.println("Error");
			System.exit(1);
		}
		String[] temp_1 = Float.toString(N).split("\\.");
		String[] temp_2 = Float.toString(C).split("\\.");
		if(temp_1[1].length() > 1 || temp_2[1].length() > 1) {
			System.out.println("Error");
			System.exit(1);
		}

		int count = 0;
		int levelup = 0;
		while(C + N > 0 && W > 0) {
			count++;
			levelup++;
			W--;
			C += N;
			C += 1.5;
			while(C + N <= 0 && W > 0) {
				if(levelup > 0) {
					levelup--;
					C += 1.5;
				}else {
					W--;
					C += 1.5;
				}
			}
		}		
		System.out.println(count);		
	}
}