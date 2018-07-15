import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int code[] = new int[3];
		int hr[] = new int[3];
		int time_1[] = new int[3];
		int time_2[] = new int[3];

		int check=0;
		Set<String> results = new HashSet<String>();

		for(int i=0; i<3; i++) {
			code[i] = input.nextInt();
			hr[i] = input.nextInt();
			time_1[i] = input.nextInt();
			if(hr[i] == 2) {
				time_2[i] = input.nextInt();
			}
		}

		for(int j=0; j<3; j++) {
			int w = time_1[j] / 10;
			int x = time_1[j] % 10;
			int y = time_2[j] / 10;
			int z = time_2[j] % 10;
			if(time_2[j] != 0) {
				if( 
						w > 5 || w < 1 ||
						x > 8 || x < 1 ||
						y > 5 || y < 1 ||
						z > 8 || z < 1 ||
						String.valueOf(code[j]).length() != 4) 
				{
				System.out.println("-1");
				check--;
				break;
				}
			}else
				if( 
						w > 5 || w < 1 ||
						x > 8 || x < 1 ||
						String.valueOf(code[j]).length() != 4) 
					{
						System.out.println("-1");
						check--;
						break;
					}
		}

		for(int j=0; j<3; j++) {
			if(check<0) {
				break;
			}
			for(int k=0; k<3; k++) {
				if(time_1[j] == time_1[k]) {
					if(j!=k) {
						if(code[j] < code[k]) {
							results.add(code[j] + "," + code[k] + "," + time_1[j]);	
						}else {
							results.add(code[k] + "," + code[j] + "," + time_1[j]);					
						}
					}
				}
				if(time_1[j] == time_2[k]) {
					if(code[j] < code[k]) {
						results.add(code[j] + "," + code[k] + "," + time_1[j]);	
					}else {
						results.add(code[k] + "," + code[j] + "," + time_1[j]);					
					}					
				}
				if(time_2[j] == time_2[k]) {
					if(j!=k) {
						if(code[j] < code[k]) {
							results.add(code[j] + "," + code[k] + "," + time_2[j]);					
						}else {
							results.add(code[k] + "," + code[j] + "," + time_2[j]);				
						}
					}
				}
				if(time_2[j] != time_2[k] && time_1[j] != time_2[k] && time_1[j] != time_1[k]) {
					check++;
				}
			}
			if(check==6) {
				System.out.println("correct");
			}
		}

		List<String> output = new ArrayList<String>(results);
        Collections.sort(output);  

		if(output != null) {
			for(int z=0; z<output.size(); z++) {
				System.out.println(output.get(z));
			}
		}
	}
}