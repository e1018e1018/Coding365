import java.util.*;
public class _28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			String player1 = input.nextLine();
			String player2 = input.nextLine();
			String com = input.nextLine();
			int check = input.nextInt();
			
			String[] split1 = new String[3];
			String[] split2 = new String[3];
			String[] splitCom = com.split(" ");
			
			split1[0] = player1.substring(0, 5);
			split1[1] = player1.substring(6, 11);
			split1[2] = player1.substring(12, 17);
			split2[0] = player2.substring(0, 5);
			split2[1] = player2.substring(6, 11);
			split2[2] = player2.substring(12, 17);
			
			int count1 = 0;
			int count2 = 0;
			for(int i = 0; i < 3; i++) {
				int countA = 0;
				for(int j = 0; j < splitCom.length; j++) {
					if(split1[i].contains(splitCom[j])) {
						countA++;
					}
					if(countA == 3) {
						count1++;
					}
				}
			}
			for(int i = 0; i < 3; i++) {
				int countB = 0;
				for(int j = 0; j < splitCom.length; j++) {
					if(split2[i].contains(splitCom[j])) {
						countB++;
					}
					if(countB == 3) {
						count2++;
					}
				}
			}
			
			if(count1 > count2) {
				System.out.println("Player1 wins");
			}else if(count1 < count2) {
				System.out.println("Player2 wins");
			}else {
				System.out.println("Draw");
			}
			
			if(check == 0) {
				input.nextLine();
				continue;
			}else {
				break;
			}
		}
		

	}

}
