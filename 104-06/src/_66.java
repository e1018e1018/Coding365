import java.util.*;

public class _66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		List<String> IP = new ArrayList<>();
		while(input.hasNext()) {
			String type = input.nextLine();
			if(type.equals("0.0.0.0,none")) {
				break;
			}
			String[] id_split = type.split(",");
			String[] ip_split = id_split[0].split("\\.");
			if(Integer.parseInt(ip_split[0]) > 255 || Integer.parseInt(ip_split[0]) < 0) {
				IP.add(String.format("machine %s is error ip\n", id_split[1]));
			}else if(Integer.parseInt(ip_split[1]) > 255 || Integer.parseInt(ip_split[1]) < 0) {
				IP.add(String.format("machine %s is error ip\n", id_split[1]));
			}else if(Integer.parseInt(ip_split[2]) > 255 || Integer.parseInt(ip_split[2]) < 0) {
				IP.add(String.format("machine %s is error ip\n", id_split[1]));
			}else if(Integer.parseInt(ip_split[3]) > 255 || Integer.parseInt(ip_split[3]) < 0) {
				IP.add(String.format("machine %s is error ip\n", id_split[1]));
			}else {
				IP.add(ip_split[0] + "." + ip_split[1] + "," + id_split[1]);
			}	
		}
				
		for(int i = 0; i < IP.size() - 1; i++) {
			if(IP.get(i).contains(",")) {
				String[] temp_1 = IP.get(i).split(",");
				String local = temp_1[1];
				int j = i + 1;
				while(j < IP.size()) {
					String[] temp_2 = IP.get(j).split(",");
					if(temp_1[0].equals(temp_2[0])) {
						local += " " + temp_2[1];
						IP.remove(j);
					}else {
						j++;
					}
				}
				IP.set(i, local);
			}
		}

		for(int j = 0; j < IP.size(); j++) {
			String[] split = IP.get(j).split(" ");
			if(split.length > 1) {
				if(split[0].equals("machine") == false) {
					if(split.length > 2) {
						System.out.printf("machines %s", split[0]);
						for(int k = 1; k < split.length - 1; k++) {
							System.out.print(", " + split[k]);
						}
						System.out.printf(" and %s are on the same local network.\n", split[split.length - 1]);
					}else {
						System.out.printf("machines %s and %s are on the same local network.\n", split[0], split[1]);
					}
				}
			}
		}
		for(int i = 0; i < IP.size(); i++) {
			String[] split = IP.get(i).split(" ");
			if(split[0].equals("machine")){
				System.out.print(IP.get(i));
			}
		}
	}
}