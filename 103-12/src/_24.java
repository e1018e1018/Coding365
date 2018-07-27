import java.util.*;

public class _24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String rotate = input.nextLine();
		String[] rotateSplit = rotate.split(" ");
		int[][] matrix = new int[n][n]; 
		
		if(n >= 10 || rotateSplit.length > 80) {
			System.exit(1);
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = n*i + j + 1;
			}
		}
		
		for(int i = 0; i < rotateSplit.length; i++) {
			int temp;
			if(rotateSplit[i].equals("R")) {
		        for (int j = 0; j < n; j++) {
		            for (int k = 0; k < j; k++) {
		                temp = matrix[j][k];
		                matrix[j][k] = matrix[k][j];
		                matrix[k][j] = temp;
		            }
				}
		        for (int j = 0; j < n; j++) {
		            for (int k = 0; k < n / 2; k++) {
		                temp = matrix[j][k];
		                matrix[j][k] = matrix[j][n - 1 - k];
		                matrix[j][n - 1 - k] = temp;
		            }
		        }
			}
			if(rotateSplit[i].equals("L")) {
		        for (int j = 0; j < n; j++) {
		            for (int k = 0; k < n / 2; k++) {
		                temp = matrix[j][k];
		                matrix[j][k] = matrix[j][n - 1 - k];
		                matrix[j][n - 1 - k] = temp;
		            }
		        }
		        for (int j = 0; j < n; j++) {
		            for (int k = 0; k < j; k++) {
		                temp = matrix[j][k];
		                matrix[j][k] = matrix[k][j];
		                matrix[k][j] = temp;
		            }
				}
			}
			if(rotateSplit[i].equals("N")) {
				for (int j = 0; j < n / 2; j++) {
		            for (int k = 0; k < n; k++) {
		                temp = matrix[j][k];
		                matrix[j][k] = matrix[n - 1 - j][k];
		                matrix[n - 1 - j][k] = temp;
		            }
				}				
			}
			if(rotateSplit[i].equals("F")) {
				break;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}