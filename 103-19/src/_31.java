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
		String replace = article.replace(" " + word_1 + " ", " " + word_2 + " ");		
		String[] split = article.split(" ");
		ArrayList<String> array_1 = new ArrayList<String>();
		ArrayList<String> array_2 = new ArrayList<String>();
		Map<Object,Object> map = new HashMap<Object,Object>();
		ArrayList <String> list  = new ArrayList<String>();
		String add = "";
		String remove = "";
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
		for(int n = 0; n < array_2.size(); n++) {
			array_2.remove(word_1 + " ");
			remove += array_2.get(n);
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

		System.out.println(replace);
		System.out.println(add);
		System.out.println(remove);
		
		for (Object key : map.keySet()) {
			list.add(key + " " + map.get(key));
		}
		
		Collections.sort(list);
		System.out.println(list);


	}

}
