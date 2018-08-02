import java.util.*;
public class _68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.nextLine();
		int total = 0;
		for(int i = 0; i < num; i++) {
			String type = input.nextLine();
			String[] split = type.split(" ");
			if(split[0].equals("C")) {
				Shape.radius = Integer.parseInt(split[1]);
				System.out.println(Shape.Circle());
				total += Shape.Circle();
			}
			if(split[0].equals("R")) {
				Shape.height = Integer.parseInt(split[1]) + Integer.parseInt(split[2]);
				System.out.println(Shape.Rectangle());
				total += Shape.Rectangle();
			}			
			if(split[0].equals("S")) {
				Shape.squareSide = Integer.parseInt(split[1]);
				System.out.println(Shape.Square());
				total += Shape.Square();
			}			
			if(split[0].equals("T")) {
				for(int j = 0; j < split.length - 1; j++) {
					Shape.triangleSide[j] = Integer.parseInt(split[j+1]);
				}
				System.out.println(Shape.Triangle());
				total += Shape.Triangle();
			}
		}
		System.out.print(total);
	}

}

class Shape{
	static int radius;
	static int height;
	static int width;
	static int squareSide;
	static int[] triangleSide = new int[3];
	static int Circle() {
		return radius * 2 * 4;
	}
	static int Rectangle() {
		return (height + width) * 2;
	}
	static int Square() {
		return squareSide * 4;
	}
	static int Triangle() {
		return triangleSide[0] + triangleSide[1] + triangleSide[2];
	}
}