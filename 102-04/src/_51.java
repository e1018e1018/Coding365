import java.util.Scanner;

public class _51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		
		for(int top_dot = row/2; top_dot > 0; top_dot--) {
			for(int left_dot = 1; left_dot <= top_dot; left_dot++) {
				System.out.print(".");
				if(left_dot == top_dot) {
					for(int star = 0; star < row - left_dot*2; star++) {
						System.out.print("*");
						if(star == row - left_dot*2 -1) {
							for(int right_dot = 1; right_dot <= top_dot; right_dot++) {
								System.out.print(".");
							}							
						}
					}
				}
			}
			System.out.println();
		}
		for(int star = 0; star < row; star++) {
			System.out.print("*");
		}
		for(int bottom_dot = 0; bottom_dot <= row/2; bottom_dot++) {
			for(int left_dot = 1; left_dot <= bottom_dot; left_dot++) {
				System.out.print(".");
				if(bottom_dot == left_dot) {
					for(int star = row; star > left_dot*2; star--) {
						System.out.print("*");
						if(star == left_dot*2+1) {
							for(int right_dot = 1; right_dot <= bottom_dot; right_dot++) {
								System.out.print(".");
							}
						}
					}
				}
			}
			System.out.println();
		}		
	}
}
