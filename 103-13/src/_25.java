import java.util.*;

public class _25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[][] num = new int[9][9];
		String[] row = new String[9];
		for(int i = 0; i < 9; i++) {
			row[i] = input.nextLine();
			for(int j = 0; j < 9; j++) {
				String[] temp = row[i].split("");
				num[i][j] = Integer.parseInt(temp[j]);
			}
		}
		String a = num[1].toString();
		int total_row = 0;
		for(int i = 0; i < 9; i++) {
			String temp = "";
			for(int j = 0; j < 9; j++) {
				total_row += num[i][j];
				temp += String.format("%d", num[i][j]);
				while(j == 8) {
					if(total_row < 45) {
						System.out.println(i + " " + temp.indexOf("0") + " " + (45 - total_row));
						total_row = 0;
						break;
					}else {
						total_row = 0;
						break;
					}
				}
			}
		}
		
	}
	
}
