import java.util.*;
public class _65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		while(num > 0) {
			String data = input.nextLine();
			String[] split = data.split(" ");
			University.schoolName = split[0];
			for(int i = 1; i < split.length; i++) {
				University.attribute += split[i] + ",";
			}
			num--;
		}
	}

}

class University{
	HashMap<String, String> school = new HashMap<String, String>();
	static String schoolName;
	static String attribute;
	
	University() {
		school.put(schoolName, attribute);
	}
}
