import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String article = input.nextLine();
		String word_1 = input.next();
		String word_2 = input.next();		
		String replace = "";		
		String[] split = article.split(" ");
		ArrayList<String> array_1 = new ArrayList<String>();
		ArrayList<String> array_2 = new ArrayList<String>();
		Map<Object,Object> map = new HashMap<Object,Object>();
		ArrayList <String> list  = new ArrayList<String>();
		String add = "";
		String remove = "";
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals(word_1)) {
				replace += word_2 + " ";
			}else {
				replace += split[i] + " ";
			}
		}
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals(word_1)) {
				array_1.add(word_2 + " ");
			}
			array_1.add(split[i] + " ");
		}
		for(int j = 0; j < array_1.size(); j++) {
			add += array_1.get(j);
		}
	
		for(int m = 0; m < split.length; m++) {
			array_2.add(split[m] + " ");
		}
		int size = array_2.size();
		for(int n = 0; n < size; n++) {
			while(array_2.get(n).equals(word_1 + " ")) {
				array_2.remove(n);
				size--;
				if(size == n) {
					break;
				}
			}
			if(size != n) {
				remove += array_2.get(n);
			}
		}

		for(int x = 0; x < split.length; x++) {
	           if(map.containsKey(split[x])) {  
	                 
	               Integer count = (Integer) map.get(split[x]);  
	                 
	               count++;  
	                 
	               map.put(split[x], count);  
	                 
	           } else {  
	               map.put(split[x], 1);  
	           } 
		}
		for (Object key : map.keySet()) {
			list.add(map.get(key) + " " + key);
		}
		Collections.sort(list);

		for(int i = 0; i < list.size(); i++) {
			String[] split_0 = list.get(i).split(" ");
			if(Integer.parseInt(list.get(list.size() - 1).substring(0, 1)) > Integer.parseInt(list.get(i).substring(0, 1))) {
				String temp = list.get(list.size() - 1);
				for(int j = list.size() - 1; j > 0 ; j--) {
					list.set(j, list.get(j - 1));
				}
				list.set(0, temp);
			}
		}
		
		System.out.println(replace);
		System.out.println(add);
		System.out.println(remove);
		for(int k = 0; k < list.size(); k++) {
			String[] split_1 = list.get(k).split(" ");
			list.set(k, split_1[1] + " " + split_1[0]);
			System.out.println(list.get(k));
		}
	}
}