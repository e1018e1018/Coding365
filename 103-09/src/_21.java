import java.util.*;

public class _21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String type = input.nextLine();
		String[] Split = type.split("");
		int left = 0;
		int leftPoint = 0, rightPoint = 0;
		int right = 0;
		
		for(int i = 0; i < Split.length; i++){
			if(Split[i].equals("(")){
				left++;
				leftPoint = i;
			}
			if(Split[i].equals(")")){
				right++;
			}
		}
		if(left != right){
			System.out.print("ERROR INPUT");
			System.exit(1);
		}
		
		if(left == right){
			for(int i = Split.length - 1; i >= 0; i--){
				if(Split[i].equals(")")){
					rightPoint = i;
				}
			}		
			String target = type.substring(leftPoint + 1, type.length() - rightPoint - 1);
			System.out.println(target);
			
			if(target.contains("+")){
				String[] plus = target.split("\\+");
				System.out.print(Integer.parseInt(plus[0]) + Integer.parseInt(plus[1]));
			}
			if(target.contains("-")){
				String[] plus = target.split("\\-");
				System.out.print(Integer.parseInt(plus[0]) - Integer.parseInt(plus[1]));
			}
			if(target.contains("*")){
				String[] plus = target.split("\\*");
				System.out.print(Integer.parseInt(plus[0]) * Integer.parseInt(plus[1]));
			}
		}
	}

}
