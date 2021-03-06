import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _102_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		List<String> point = new ArrayList<String>();
		
		int count = input.nextInt();
		int done[] = new int[count*2];
		
		for(int i=0; i<count; i++) {
			int x1 = input.nextInt();
			int x2 = input.nextInt();
			point.add(x1 + "," + x2);
		}
		
		int temp[] = new int[count];
		
		for(int j=0; j<point.size(); j++) {
			String temp_1[] = point.get(j).split(",");
			int num_1 = Integer.parseInt(temp_1[0]);
			int num_2 = Integer.parseInt(temp_1[1]);
			done[j*2] = num_1;
			done[j*2+1] = num_2;
			if(j+1 < point.size()) {
				String temp_2[] = point.get(j+1).split(",");
				int num_3 = Integer.parseInt(temp_2[0]);
				int num_4 = Integer.parseInt(temp_2[1]);
				
				temp[j] = num_2 - num_1;
				
				if(num_3 > num_1 && num_3 < num_2) {
					if(num_4 <= num_2){
						temp[j] = 0;
					}else {
						temp[j] = num_4 - num_1;
					}
				}else {
					temp[j+1] = num_4 - num_3;
				}
			}else {
				break;
			}
		}
		int temp_total = 0;
		for(int x=0; x<count; x++) {
			temp_total += Math.abs(temp[x]);
		}
		Arrays.sort(done);
		if(temp_total > Math.abs(done[done.length-1] - done[0])) {
			System.out.println(Math.abs(done[done.length-1] - done[0]));
		}else {
			System.out.println(temp_total);
		}
	}
}