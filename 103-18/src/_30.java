import java.util.*;
public class _30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		List<String> words = new ArrayList<>();
		int num = 0;
		while(input.hasNext()) {
			String type = input.next();
			if(type.equals("-1")) {
				break;
			}
			words.add(type);
			num++;
		}
		input.nextLine();
		String sentence = input.nextLine();
		String[] split = sentence.split(" ");
		ArrayList<String> sentence_split = new ArrayList<>();
		List<String> sort = new ArrayList<>();
		
		for(int i = 0; i < split.length; i++) {
			sentence_split.add(split[i]);
		}	
		for(int j = 0; j < words.size(); j++) {
			int count = 0;
			for(int k = 0; k < sentence_split.size(); k++) {
				if(sentence_split.get(k).equals(words.get(j))) {
					sentence_split.remove(k);
					count++;
				}
			}
			if(count != 0) {
				sort.add(count + " " + words.get(j));
			}
		}
		
		for(int m = 0; m < sentence_split.size(); m++) {
			System.out.print(sentence_split.get(m) + " ");
		}
		System.out.printf("\n%d\n", sentence_split.size());
		
		Collections.sort(sort);
		for(int n = 0; n < sort.size(); n++) {
			String[] split_2 = sort.get(n).split(" ");
			sort.set(n, split_2[1] + " " + split_2[0]);
		}
		
		for(int x = 0; x < sort.size(); x++) {
			if(Integer.parseInt(sort.get(sort.size() - 1).substring(sort.get(sort.size() - 1).length() - 1, sort.get(sort.size() - 1).length())) > Integer.parseInt(sort.get(x).substring(sort.get(x).length() - 1, sort.get(x).length()))) {
				String temp = sort.get(sort.size() - 1);
				for(int y = sort.size() - 1; y > 0 ; y--) {
					sort.set(y, sort.get(y - 1));
				}
				sort.set(0, temp);
			}
			System.out.println(sort.get(x));
		}
	}
}