import java.util.Scanner;

public class _49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int score[] = new int[21];
		int total = 0;
		
		for(int i = 0; i < score.length; i++) { 
			score[i] = input.nextInt();
		}
		
		for(int j = 0; j < score.length; j++) { 
			if(j > 0 && j < 18) {
				if(score[j] + score[j-1] == 10) {
					score[j] += score[j+1];
					total += score[j];
					continue;
				}
			}
			if(j < 18) {
				if(score[j] == 10) {
					if(score[j+2] == 10) { 
						if(j + 2 == 18) {
							score[j] += score[j+2] + score[j+3];
						}else {
							score[j] += score[j+2] + score[j+4];
						}
					}else {
						score[j] += score[j+2] + score[j+3];
					}
				}
				total += score[j];
			}else {
				total += score[j];

			}
		}
		if(score[18] == 10 && score[19] == 10 && score[20] == 10) {
			total -= 10;
		}
		System.out.println(total);
	}
}