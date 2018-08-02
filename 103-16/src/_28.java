import java.util.*;
public class _28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			String player1 = input.nextLine();
			String player2 = input.nextLine();
			String com = input.nextLine();
			int check = input.nextInt();
			int[][] one = new int[3][3];
			int[][] two = new int[3][3];
			String[] split1 = player1.split(" ");
			String[] split2 = player2.split(" ");
			String[] split3 = com.split(" ");
			int total = 0;
			int countA = 0;
			int countB = 0;
			for(int i = 0; i < split3.length; i++) {
				total += Integer.parseInt(split3[i]);
			}
			
			for(int i = 0; i < 3; i++) {
				int count = 0;
				for(int j = 0; j < 3; j++) {
					one[i][j] = Integer.parseInt(split1[3*i+j]);
					count += one[i][j];
				}
				if(count == total) {
					countA++;
				}
			}			
			for(int i = 0; i < 3; i++) {
				int count = 0;
				for(int j = 0; j < 3; j++) {
					two[i][j] = Integer.parseInt(split2[3*i+j]);
					count += two[i][j];
				}
				if(count == total) {
					countB++;
				}
			}
			
			for(int i = 0; i < 3; i++) {
				int count = 0;
				for(int j = 0; j < 3; j++) {
					one[j][i] = Integer.parseInt(split1[3*i+j]);
					count += one[j][i];
				}
				if(count == total) {
					countA++;
				}
			}			
			for(int i = 0; i < 3; i++) {
				int count = 0;
				for(int j = 0; j < 3; j++) {
					two[j][i] = Integer.parseInt(split2[3*i+j]);
					count += two[j][i];
				}
				if(count == total) {
					countB++;
				}
			}
			
			for(int i = 0; i < 3; i++) {
				int count = 0;
				for(int j = 0; j < 3; j++) {
					one[i][j] = Integer.parseInt(split1[3*i+j]);
					if(j == 2) {
						count += one[i][i];
					}
				}
				if(count == total) {
					countA++;
				}
			}			
			for(int i = 0; i < 3; i++) {
				int count = 0;
				for(int j = 0; j < 3; j++) {
					two[i][j] = Integer.parseInt(split2[3*i+j]);
					if(j == 2) {
						count += two[i][i];
					}
				}
				if(count == total) {
					countB++;
				}
			}
			
			if(countA == countB) {
				System.out.println("Draw");
			}
			if(countA > countB) {
				System.out.println("Player1 wins");
			}
			if(countA < countB) {
				System.out.println("Player2 wins");
			}
			input.nextLine();
			if(check == -1) {
				break;
			}
		}

	}
}
