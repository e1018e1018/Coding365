import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _14 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] type = input.nextLine().split(" ");

		int straight = 0;
		int count_0 = 0;
		int count_1 = 0;
		int count_2 = 0;
		int result = 0;
		int num[] = new int[5];
		int color[] = new int[5];
		int data[] = new int[5];

		for(int i = 0; i < 5; i++) {
			data[i] = Integer.parseInt(type[i]);
			num[i] = data[i] / 10;
			color[i] = data[i] % 10;
		}
		
		HashMap<Integer, Integer> repetitions = new HashMap<Integer, Integer>();

		for(int j = 0; j < color.length-1; j++) {
			for(int k = j+1; k < color.length; k++) {
				if(num[j] == num[k]) {
					count_0++;
				}
			}
		}
		if(count_0==1) {
			result=1;
		}
		if(count_0==2) {
			result=2;
		}
		if(count_0==3) {
			result=3;
		}
		if(count_0>=4) {
				for(int l = 1; l < color.length; l++) {
					if(num[0] == num[l]) {
						count_1++;
					}
				}
			
			if(count_1<3) {
				result=4;
			}else{
				result=5;
			}
		}
		Arrays.sort(num);
		if(num[4]-num[0]==4) {
			straight=1;
		}
		if(num[0]==1 && num[1]==10 && num[2]==11 && num[3]==12 && num[3]==13) {
			straight=1;
		}
		if(num[0]==1 && num[1]==2 && num[2]==11 && num[3]==12 && num[3]==13) {
			straight=1;
		}
		if(num[0]==1 && num[1]==2 && num[2]==3 && num[3]==12 && num[3]==13) {
			straight=1;
		}
		if(num[0]==1 && num[1]==2 && num[2]==3 && num[3]==4 && num[3]==13) {
			straight=1;
		}
		if(straight==1) {
			for(int m = 1; m < color.length; m++) {
				if(color[0] == color[m]) {
					count_2++;
				}
			}
			if(count_2==4) {
				result=7;
			}else {
				result=6;
			}
		}

		System.out.println(result);
	}
}