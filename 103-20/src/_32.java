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
		String[] data = input.nextLine().split(" ");			//�N��J�r������T��
		String word = data[0];									//�Ĥ@���O��r
		int num = Integer.parseInt(data[1]);					//�ĤG���OP
		String side = data[2];									//�ĤT���OL/R
		String[] article = input.nextLine().split(" ");			//�N�峹�̳�r���}
		ArrayList<String> sentence = new ArrayList<String>();	//�w�q�y�l�}�C
		for(int i = 0; i < article.length; i++) {				//�b�峹���M��
			ArrayList<String> split = new ArrayList<String>();	//�w�q�_�y�}�C
			if(article[i].equalsIgnoreCase(word)) {							//�p�G���Y��r�ŦX��J��r
				article[i] = article[i].toUpperCase();
				if(i - num >= 0) {								//�p�G�����䪺�Ƥ�P�j
					for(int j = i - num; j < i; j++) {			//�h�N����i - P�Ӽƥ[�i�_�y�}�C
						split.add(article[j].toLowerCase());
					}
				}else {											//�p�G�����䪺�Ƥ�P�p(�쳻)
					for(int j = 0; j < i; j++) {				//�h�[�J�̫e�����J��r��m����r
						split.add(article[j].toLowerCase());
					}
				}
				split.add(article[i]);
				if(i + num <= article.length) {					//�p�G���k�䪺�Ƥ�P�j
					for(int k = i + 1; k <= i + num; k++) {			//�h�N����i + P�Ӽƥ[�i�_�y�}�C
						split.add(article[k].toLowerCase());
					}
				}else {											//�p�G���k�䪺�Ƥ�P�p(�쩳)
					for(int k = i + 1; k < article.length; k++) {	//�h�[�J��J��r��̧��ݪ���r
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
