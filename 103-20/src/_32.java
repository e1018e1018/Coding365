import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class _32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] data = input.nextLine().split(" ");			//將輸入字串切成三分
		String word = data[0];									//第一份是單字
		int num = Integer.parseInt(data[1]);					//第二份是P
		String side = data[2];									//第三份是L/R
		String[] article = input.nextLine().split(" ");			//將文章依單字切開
		ArrayList<String> sentence = new ArrayList<String>();	//定義句子陣列
		for(int i = 0; i < article.length; i++) {				//在文章中尋找
			ArrayList<String> split = new ArrayList<String>();	//定義斷句陣列
			if(article[i].equalsIgnoreCase(word)) {							//如果有某單字符合輸入單字
				article[i] = article[i].toUpperCase();
				if(i - num >= 0) {								//如果往左邊的數比P大
					for(int j = i - num; j < i; j++) {			//則將左邊i - P個數加進斷句陣列
						split.add(article[j].toLowerCase());
					}
				}else {											//如果往左邊的數比P小(到頂)
					for(int j = 0; j < i; j++) {				//則加入最前面到輸入單字位置的單字
						split.add(article[j].toLowerCase());
					}
				}
				split.add(article[i]);
				if(i + num <= article.length) {					//如果往右邊的數比P大
					for(int k = i + 1; k <= i + num; k++) {			//則將左邊i + P個數加進斷句陣列
						split.add(article[k].toLowerCase());
					}
				}else {											//如果往右邊的數比P小(到底)
					for(int k = i + 1; k < article.length; k++) {	//則加入輸入單字到最尾端的單字
						split.add(article[k].toLowerCase());
					}
				}
				sentence.add(String.join(" ", split));	
			}
		}
		
		String[] temp;
		List[][] total = new List[10][11];
		for(int x = 0; x < sentence.size(); x++) {
			temp = sentence.get(x).split(" ");
			for(int y = 0; y < temp.length; y++) {
				total[x][y].add(temp[y]);
			}
		}
		System.out.println(total[1].length);

		if(side.equals("L")) {
			for(int i = 0; i < total[1].length; i++) {
				if(total[1].equals(data[0].toUpperCase())) {
					
				}
			}
		}
		if(side.equals("R")) {
			
		}
	}

}
