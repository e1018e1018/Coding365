import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _59 {
	
	static Scanner input = new Scanner(System.in);
	static List<String> set = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculate());	
	}
	
	static String Calculate() {
		List<Integer> area = new ArrayList<Integer>();
		List<Integer> perimeter = new ArrayList<Integer>();
		while(input.hasNext()) {
			String coordinate = input.nextLine();
			if(coordinate.equals("-1")) {
				break;
			}
			set.add(coordinate);
		}
		for(int i = 0; i < set.size(); i++) {			
			String[] xyString = set.get(i).split(" ");
			int[] xyInt = new int[xyString.length];
			for(int j = 0; j < xyString.length; j++) {
				xyInt[j] = Integer.parseInt(xyString[j]);
			}
			area.add(Math.abs(xyInt[0] - xyInt[2]) * Math.abs(xyInt[1] - xyInt[3]));
			perimeter.add(Math.abs(xyInt[0] - xyInt[2]) * 2 + Math.abs(xyInt[1] - xyInt[3]) * 2);
		}
		return String.format("%d\n%d", Collections.max(area), Collections.max(perimeter));
	}

}