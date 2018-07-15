import java.util.Scanner;

public class _50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int side = input.nextInt();
		int row = input.nextInt();

		if(side == 1) {
			for(int above_down = 1; above_down <= (row/2) + 1; above_down++) {
				for(int above_right = 1; above_right <= above_down; above_right++) {
					System.out.print(above_right);
				}
				System.out.println();
			}
			for(int below_down = row/2; below_down > 0; below_down--) {
				for(int below_right = 1; below_right <= below_down; below_right++) {
					System.out.print(below_right);
				}
				System.out.println();
			}
		}
		
		if(side == 2) {
			for(int above_dot = row/2; above_dot > 0; above_dot--) {
				for(int right_dot = 1; right_dot <= above_dot; right_dot++) {
					System.out.print(".");
					if(right_dot == above_dot) {
						for(int num = right_dot; num <= row/2 ; num++) {
							System.out.print(Math.abs(num - (row/2) - 1));
						}
					}
				}
				System.out.println();
			}
			for(int num = 0; num <= row/2; num++) {
				System.out.print(Math.abs(num - row/2 -1));
			}
			for(int below_dot = 0; below_dot <= row/2; below_dot++) {
				for(int right_dot = 1; right_dot <= below_dot; right_dot++) {
					System.out.print(".");
					if(right_dot == below_dot) {
						for(int num = right_dot - (1 + row/2); num < 0; num++) {
							System.out.print(Math.abs(num));
						}
					}
				}
				System.out.println();
			}
		}
	}
}