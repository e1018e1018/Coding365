import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			
			int a=0, b=0, c=0, d=0, e=0;
			int total = 0;
			
			a = input.nextInt();
			c = input.nextInt();
			
			if(a != 10) {
				b = input.nextInt();
			}
			
			if(c != 10) {
				d = input.nextInt();
			}else {
				e = input.nextInt();
			}
			
			int score[] = {a, b, c, d, e};
			
			for(int i=0; i<score.length; i++) {
				total += score[i];
			}
			
			System.out.println(total);
		}
	
}