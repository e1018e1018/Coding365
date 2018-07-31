import java.util.*;
public class _62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			String type = input.nextLine();
			if(type.substring(0 ,1).equals("A")){
				System.out.println(Admin(type));
			}
			if(type.substring(0 ,1).equals("M")){
				System.out.println(Candidate(type));
			}
			if(type.substring(0 ,1).equals("V")){
				System.out.println(Voting(type));
			}
			if(type.substring(0 ,1).equals("Q")){
				System.out.println(Search(type));
			}
			if(type.substring(0 ,1).equals("E")){
				System.out.println(Exit(type));
				break;
			}
		}
		System.exit(1);
	}
	
	static List<String> user = new ArrayList<>();
	static List<String> candidate = new ArrayList<>();
	static List<String> result = new ArrayList<>();
	
	static String Admin(String type) {
		String[] split = type.split(",");
        int isDigitA = 0;
        int isLetterA = 0;
        int isDigitP = 0;
        int isLetterP = 0;
        int isSymbol = 0;
		for(int i = 0; i < split[1].length(); i++) {
            if(Character.isDigit(split[1].charAt(i))) {
                isDigitA++;  
            }
            if(Character.isLetter(split[1].charAt(i))) {
                isLetterA++;
            }
		}
		for(int j = 0; j < split[2].length(); j++) {
	        if(split[2].charAt(j) == '_' || split[2].charAt(j) == '-' || split[2].charAt(j) == '@' || split[2].charAt(j) == '#' || split[2].charAt(j) == '%') {
	            isSymbol++;
	        }
            if(Character.isDigit(split[2].charAt(j))) {
                isDigitP++;  
            }
            if(Character.isLetter(split[2].charAt(j))) {
                isLetterP++;
            }
		}
		if(split[1].length() != 8 || isDigitA + isLetterA != 8 || user.contains(split[1])) {
			return ("username error\nAdd user error");
		}else if(split[2].length() < 1 || split[2].length() > 8 || isSymbol + isDigitP + isLetterP != split[2].length() || split[1].equals(split[2])) {
			return ("password error\nAdd user error");
		}else {
			user.add(type);
			return ("Add user successful");
		}
	}
	
	static String Candidate(String type) {
		String[] checkAdmin = user.get(0).split(",");
		String[] split = type.split(",");
		if(split[1].equals(checkAdmin[1]) && split[2].equals(checkAdmin[2])) {
			candidate.add(type);
			if(candidate.size() == 1) {
				return "Add candidate successful";
			}
			for(int i = 0; i < candidate.size(); i++) {
				String[] splitCandidate = candidate.get(i).split(",");
				if(split[3].equals(splitCandidate[3]) || split[4].equals(splitCandidate[4])) {
					candidate.remove(i);
					return "Candidate data error";
				}else {
					return "Add candidate successful";
				}
			}
		}else {
			return "Login error";
		}
		return "";
	}
	

	static String Voting(String type) {
		List<String> userVoting = new ArrayList<>(user);
		String[] split = type.split(",");
		int check = 0;
		for(int j = 0; j < candidate.size(); j++) {
			String[] splitCandidate = candidate.get(j).split(",");
			if(splitCandidate[3].equals(split[3])) {
				check++;
			}
		}
		if(check == 0) {
			return "Candidate error";
		}
		String all_1 = "";
		for(int x = 0; x < user.size(); x++) {
			all_1 += user.get(x);
		}
		String all_2 = "";
		for(int y = 0; y < userVoting.size(); y++) {
			all_2 += userVoting.get(y);
		}

		int num = 0;
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).contains(split[1])) {
				num = i;
			}

		}
			//String[] checkUser = user.get(i).split(",");
		if(all_2.contains(split[1]) != true || userVoting.get(0).contains(split[1])) {

			return "Voting error";
		}
		if(all_1.contains(split[1]) != true) {

			return "Login error";
		}else if(all_1.contains(split[2]) != true) {

			return "Login error";
		}else{
			result.add(split[3]);
			userVoting.remove(num);
			return "Voting successful";
		}
	}
	
	static String Search(String type) {
		String[] split = type.split(",");
		String output = "";
		boolean check = false;
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).contains(split[1]) == true && user.get(i).contains(split[2]) == true) {
				check = true;
			}
		}
		if(check == false) {
			return "Login error";
		}
		
		for(int i = 0; i < result.size(); i++) {
			int count = 1;
			for(int j = i+1; j < result.size(); j++) {
				while(result.get(i).equals(result.get(j))) {
					count++;
					result.remove(j);
				}
			}
			Collections.sort(candidate);
			for(int k = 0; k < candidate.size(); k++) {
				String[] splitCandidate = candidate.get(k).split(",");
				if(splitCandidate[3].equals(result.get(i))) {
					if(k == candidate.size()-1) {
						output += "(" + splitCandidate[3] + "," + splitCandidate[4] + "," + count + ")";
					}else {
						output += "(" + splitCandidate[3] + "," + splitCandidate[4] + "," + count + "),";
					}
					
				}
			}
			
		}
		return output;
	}
	
	static String Exit(String type) {
		return "Exit";
	}

}
