import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] type = input.nextLine().split(" ");
		int N = Integer.parseInt(type[0]);
		int M = Integer.parseInt(type[1]);
		int K = Integer.parseInt(type[2]);
		ArrayList<Integer> New = new ArrayList<Integer>();		
		ArrayList<Integer> Num = new ArrayList<Integer>();		

		for(int i = 1; i <= N; i++) {							//依序加入N個人，指派到相對應陣列位置
			Num.add(i);
		}
		for(int i = 0; i < K; i++) {							//設定爆炸次數
			while(M > Num.size()) {								//如果間格大於人數，則間格減去人數(減少一圈)
				M -= Num.size();
			}
			System.out.print(Num.get(M - 1) + " ");				//顯示爆掉的人的位置
			Num.remove(M - 1);									//移除爆掉的人
			
			if(M - 1 >= Num.size()) {							//如果爆掉的人式最後一個人
				for(int k = 0; k < M - 1; k++) {				//將爆掉的人的前面的人放在新陣列
					New.add(Num.get(k));
				}
			}else {
				for(int j = M - 1; j < Num.size(); j++) {		//將爆掉的人的後面的人加入新陣列的最前面
					New.add(Num.get(j));
				}
				for(int k = 0; k < M - 1; k++) {				//將爆掉的人的前面的人放在新陣列的後面，以達到圓圈的效果
					New.add(Num.get(k));
				}
			}
			Num = (ArrayList<Integer>) New.clone();				//複製新陣列指派到舊陣列來覆蓋
			New.clear();//新陣列清空
		}
		for(int i = 0; i < Num.size(); i++) {					//爆完還在陣列的即存活的人，順位的第一人即幸運兒
			System.out.print(Num.get(i));
			break;
		}	
	}
}