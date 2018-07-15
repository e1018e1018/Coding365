import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String name=input.nextLine();
		int id=input.nextInt();
		int score_1=input.nextInt();
		int score_2=input.nextInt();
		int score_3=input.nextInt();
		int total=score_1+score_2+score_3;
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Total:"+total);
		System.out.println("Average:"+total/3);
	}
	
}
