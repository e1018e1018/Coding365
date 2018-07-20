import java.util.*;

public class _18 {
	
	static Scanner input= new Scanner(System.in);
	static ArrayList<String> student = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(input.hasNext()) {
			String data = input.nextLine();
			if(data.equals("-1")) {
				break;
			}
			student.add(data);
		}
					
		int function = input.nextInt();
		int option = input.nextInt();
		switch(function) {
		case 1:
			System.out.println(Search(option));
			break;
		case 2:
			System.out.println(Highest(option));
			break;
		case 3:
			System.out.println(Lowest(option));
			break;
		case 4:
			Failed(option);
			break;
		case 5:
			Passed(option);
			break;
		case 6:
			System.out.println(TopThree(option));
			break;
		case 7:
			System.out.println(Statistics(option));
			break;
		}
	}
	
	static int Search(int option) {
		String ID = input.next();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).contains(ID)) {
				String[] split = student.get(i).split(" ");
				switch(option) {
				case 1:
					return (Integer.parseInt(split[1]) + Integer.parseInt(split[2])) / 2;		
				case 2:
					return Integer.parseInt(split[1]);
				case 3:
					return Integer.parseInt(split[2]);		
				}
			}
		}
		return 70773;
	}

	static int Highest(int option){
		ArrayList<Integer> CS = new ArrayList<Integer>();
		ArrayList<Integer> PG = new ArrayList<Integer>();
		for(int i = 0; i < student.size(); i++) {
			String[] split = student.get(i).split(" ");
			CS.add(Integer.parseInt(split[1]));
			PG.add(Integer.parseInt(split[2]));
		}
		int maxCS = Collections.max(CS);
		int maxPG = Collections.max(PG);
		switch(option) {
		case 1:
			return (maxCS + maxPG) / 2;
		case 2:
			return maxCS;
		case 3:
			return maxPG;
		}
		return 70773;
	}

	static int Lowest(int option){
		ArrayList<Integer> CS = new ArrayList<Integer>();
		ArrayList<Integer> PG = new ArrayList<Integer>();
		for(int i = 0; i < student.size(); i++) {
			String[] split = student.get(i).split(" ");
			CS.add(Integer.parseInt(split[1]));
			PG.add(Integer.parseInt(split[2]));
		}
		int minCS = Collections.min(CS);
		int minPG = Collections.min(PG);
		switch(option) {
		case 1:
			return (minCS + minPG) / 2;
		case 2:
			return minCS;
		case 3:
			return minPG;
		}
		return 70773;
	}

	static String Failed(int option){
		ArrayList<String> failed = new ArrayList<String>();
		for(int i = 0; i < student.size(); i++) {
			String[] split = student.get(i).split(" ");
			int CS = Integer.parseInt(split[1]);
			int PG = Integer.parseInt(split[2]);
			
			switch(option) {
			case 1:
				if((CS + PG) / 2 < 60) {
					failed.add(split[0] + ":" + (CS + PG) / 2);
				}
				break;
			case 2:
				if(CS < 60) {
					failed.add(split[0] + ":" + CS);
				}
				break;
			case 3:
				if(PG < 60) {
					failed.add(split[0] + ":" + PG);
				}
				break;
			}
			Collections.sort(failed);
		}
		for(int j = 0; j < failed.size(); j++) {
			System.out.println(failed.get(j));
		}
		return "Error";
	}

	static String Passed(int option){
		ArrayList<String> passed = new ArrayList<String>();
		for(int i = 0; i < student.size(); i++) {
			String[] split = student.get(i).split(" ");
			int CS = Integer.parseInt(split[1]);
			int PG = Integer.parseInt(split[2]);
			
			switch(option) {
			case 1:
				if((CS + PG) / 2 >= 60) {
					passed.add(split[0] + ":" + (CS + PG) / 2);
				}
				break;
			case 2:
				if(CS >= 60) {
					passed.add(split[0] + ":" + CS);
				}
				break;
			case 3:
				if(PG >= 60) {
					passed.add(split[0] + ":" + PG);
				}
				break;
			}
			Collections.sort(passed);
		}
		for(int j = 0; j < passed.size(); j++) {
			System.out.println(passed.get(j));
		}
		return "Error";
	}

	static String TopThree(int option){
		ArrayList<String> topThree = new ArrayList<String>();
		for(int i = 0; i < student.size(); i++) {
			String[] split_1 = student.get(i).split(" ");
			int CS = Integer.parseInt(split_1[1]);
			int PG = Integer.parseInt(split_1[2]);
			
			switch(option) {
			case 1:
				topThree.add((CS + PG) / 2 + ":" + split_1[0]);
				break;
			case 2:
				topThree.add(CS + ":" + split_1[0]);
				break;
			case 3:
				topThree.add(PG + ":" + split_1[0]);
				break;
			}
		}
		Collections.sort(topThree);
		for(int j = 0; j < topThree.size(); j++) {
			String[] change = topThree.get(j).split(":");
			topThree.set(j, change[1] + " " + change[0]);
		}
		return String.format("1st:%s\n2nd:%s\n3rd:%s", topThree.get(topThree.size()-1), topThree.get(topThree.size()-2), topThree.get(topThree.size()-3));
	}

	static String Statistics(int option){
		ArrayList<Integer> grade = new ArrayList<Integer>();
		for(int i = 0; i < student.size(); i++) {
			String[] split = student.get(i).split(" ");
			int CS = Integer.parseInt(split[1]);
			int PG = Integer.parseInt(split[2]);
			grade.add((CS + PG) / 2);
		}
		Collections.sort(grade);
		switch(option) {
		case 1:
			if(student.size() % 2 != 0) {
				return String.format("%d", grade.get(student.size() / 2));
			}else {
				return String.format("%d", ((grade.get(student.size() / 2) + grade.get(student.size() / 2 - 1)) / 2));
			}
		case 2:
			String[] star = {"", "", "", "", "", "", "", "", "", ""};
			for(int j = 0; j < grade.size(); j++) {
				if(grade.get(j) >= 0 && grade.get(j) <= 10) {
					star[0] += "*";
				}
				if(grade.get(j) >= 11 && grade.get(j) <= 20) {
					star[1] += "*";
				}
				if(grade.get(j) >= 21 && grade.get(j) <= 30) {
					star[2] += "*";
				}
				if(grade.get(j) >= 31 && grade.get(j) <= 40) {
					star[3] += "*";
				}
				if(grade.get(j) >= 41 && grade.get(j) <= 50) {
					star[4] += "*";
				}
				if(grade.get(j) >= 51 && grade.get(j) <= 60) {
					star[5] += "*";
				}
				if(grade.get(j) >= 61 && grade.get(j) <= 70) {
					star[6] += "*";
				}
				if(grade.get(j) >= 71 && grade.get(j) <= 80) {
					star[7] += "*";
				}
				if(grade.get(j) >= 81 && grade.get(j) <= 90) {
					star[8] += "*";
				}
				if(grade.get(j) >= 91 && grade.get(j) <= 100) {
					star[9] += "*";
				}
			}
			return String.format("0-10:%s\n11-20:%s\n21-30:%s\n31-40:%s\n41-50:%s\n51-60:%s\n61-70:%s\n71-80:%s\n81-90:%s\n91-100:%s", star[0], star[1], star[2], star[3], star[4], star[5], star[6], star[7], star[8], star[9]);
		}
		return "Error";
	}
}