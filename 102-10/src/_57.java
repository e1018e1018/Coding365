import java.util.Scanner;

public class _57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		float x = 0;
		try {
			x = Float.parseFloat(type);
		}catch(NumberFormatException e){
			System.out.println("error");
			System.exit(1);
		}

		int k = 0;
		int prime = 0;
		
		if(x % 1 == 0) {
			if(x >= 2 && x <= 1000) {
				k = (int) x;
			}
			if(x == 0 || x == 1) {
				k = 1000;
			}
			if(x < 0) {
				k = (int) (x * -11);
			}
		}else
		if(x > 0) {
			k = (int) x;
		}else 
		if(x < 0){
			String[] last = Float.toString(x).split("\\.");
			k = Integer.parseInt(last[1]);
		}
		else {
			System.out.println("error");
			System.exit(1);
		}
		

		
		for(int i = 2; i <= k; i++) {
			boolean isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				prime = i;
			}
		}
		
		if(prime != 0) {
			System.out.print(prime);
		}	
	}
}