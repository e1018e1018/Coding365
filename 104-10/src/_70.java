import java.util.*;
public class _70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		
		while(input.hasNext()) {
			if(type.equals("p")) {
				Class.print();
			}
			if(type.equals("i")) {
				String add = input.nextLine();
				String[] split = add.split(",");
				Student.id = Integer.parseInt(split[0]);
				Student.score = Integer.parseInt(split[1]);
			}
		}
	}

}

class Student{
	static int id;
	static int score;	
}

class Class{
	Student student = new Student();
	static ArrayList<String> list = new ArrayList<>();
	static void print() {
		System.out.println(list);
	}
	int insertInOrder() {
		list.add(Student.id + ":" + Student.score);
		System.out.printf("Insert data %d:%d, compare:%d.", Student.id, Student.score);
		return 0;
	}
	int deleteStudent() {
		return 0;
	}
}

