import java.util.*;

public class _29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String line_1 = input.nextLine();
		while(line_1.contains(".") == false) {
			line_1 += input.nextLine();
		}
		//input.nextLine();
		String line_2 = input.nextLine();
		while(line_2.contains(".") == false) {
			line_2 += input.nextLine();
		}
		
		String[] split = line_1.split(" ");
		int first = 0;
		for(int i = 0; i < split.length; i++) {
			try {
				String temp = String.format("%d", Integer.parseInt(split[i]));
				String[] num = temp.split("");
				temp = "";
				for(int j = num.length - 1; j >= 0; j--) {
					temp += num[j];
				}
				first += Integer.parseInt(temp);
			}catch(NumberFormatException e) {
				continue;
			}
		}
		
		if(first / 10000 > 0) {
			first %= 10000;
			System.out.print(first);
		}else
		if(first / 1000 < 0) {
			String temp = String.format("%d", first);
			String zero = "";
			for(int i = 0; i < 4 - temp.length(); i++) {
				zero += "0";
			}
			System.out.print(zero + temp);
		}else {
			System.out.print(first);
		}
		
		List<String> sort = new ArrayList<>();
		for(int i = 65; i <=90; i++) {
			int count = 0;
			String aChar = new Character((char)i).toString();
			for(int j = 0; j < line_2.length(); j++) {
				if(aChar.equals(line_2.substring(j, j+1))) {
					count++;
				}
			}
			if(count < 10) {
				sort.add(count + " " + aChar);
			}
		}
		for(int i = 97; i <=122; i++) {
			int count = 0;
			String aChar = new Character((char)i).toString();
			for(int j = 0; j < line_2.length(); j++) {
				if(aChar.equals(line_2.substring(j, j+1))) {
					count++;
				}
			}
			if(count < 10) {
				sort.add(count + " " + aChar);
			}
		}
		
		Collections.sort(sort);
		List<Float> fin = new ArrayList<>();
		for(int i = sort.size() - 4; i <= sort.size() - 1; i++) {
			String[] second = sort.get(i).split(" ");
			int temp = line_2.indexOf(second[1]);
			String temp_1 = temp + "." + second[0];
			fin.add(Float.parseFloat(temp_1));
		}
		Collections.sort(fin);
		for(int i = fin.size() - 4; i <= fin.size() - 1; i++) {
			String temp = String.format("%.1f", fin.get(i) % 1);
			String[] output = temp.split("\\.");
			System.out.print(output[1].substring(0, 1));
		}
	}
}