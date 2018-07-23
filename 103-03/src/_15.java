import java.util.*;

public class _15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sign = input.nextLine();
		String _1 = input.nextLine();
		String _2 = input.nextLine();
		String[] _1Split;
		String[] _2Split;
		
		_1 = _1.replace("+", "#+");
		_1 = _1.replace("-", "#-");
		_1 = _1.replace("  ", " ");
		_1Split = _1.split("#");
		_2 = _2.replace("+", "#+");
		_2 = _2.replace("-", "#-");
		_2 = _2.replace(" ", "");
		_2Split = _2.split("#");
		
		ArrayList<String> Coeff_1 = new ArrayList<String>();
		ArrayList<String> Coeff_2 = new ArrayList<String>();
		
		for(int i = 0; i < _1Split.length; i++) {
			_1Split[i] = _1Split[i].replace("+", "");
			String[] Coeff = _1Split[i].split("\\^");
			if(_1Split[i].equals("")){
				continue;	
			}else 
			if(_1Split[i].contains("^") == false) {
				if(_1Split[i].contains("x")) {
					Coeff[0] = Coeff[0].replace("x", "");
					Coeff_1.add("1:" + Coeff[0].replace(" ", ""));
				}else {
					Coeff_1.add("0:" + Coeff[0].replace(" ", ""));
				}
			}else {
				Coeff[0] = Coeff[0].replace("x", "");
				Coeff_1.add(Coeff[1].replace(" ", "") + ":" + Coeff[0].replace(" ", ""));	
			}
		}
		for(int i = 0; i < _2Split.length; i++) {
			_2Split[i] = _2Split[i].replace("+", "");
			String[] Coeff = _2Split[i].split("\\^");
			if(_2Split[i].equals("")){
				continue;
			}else 
			if(_2Split[i].contains("^") == false) {
				if(_2Split[i].contains("x")) {
					Coeff[0] = Coeff[0].replace("x", "");
					Coeff_2.add("1:" + Coeff[0].replace(" ", ""));
				}else {
					Coeff_2.add("0:" + Coeff[0].replace(" ", ""));
				}
			}else {
				Coeff[0] = Coeff[0].replace("x", "");
				Coeff_2.add(Coeff[1].replace(" ", "") + ":" + Coeff[0].replace(" ", ""));
			}
		}
		
		if(sign.equals("+")) {
			ArrayList<String> Coeff_plus1 = new ArrayList<String>(Coeff_1);
			ArrayList<String> Coeff_plus2 = new ArrayList<String>(Coeff_2);
			
			for(int i = 0; i < Coeff_plus1.size(); i++) {
				for(int j = 0; j < Coeff_plus2.size(); j++) {
					String[] a = Coeff_plus1.get(i).split(":");
					String[] b = Coeff_plus2.get(j).split(":");
					if(a[1].equals("-")) {
						a[1] = "-1";
					}
					if(b[1].equals("-")) {
						b[1] = "-1";
					}
					if(a[0].equals(b[0])) {
						b[1] = String.format("%d", Integer.parseInt(a[1]) + Integer.parseInt(b[1]));
						Coeff_plus1.remove(i);
						if(Integer.parseInt(b[1]) == 0) {
							Coeff_plus1.remove(j);
						}else {
							Coeff_plus2.set(j, b[0] + ":" + b[1]);
						}
					}
				}
			}
			ArrayList<String> plus = (ArrayList<String>)Coeff_plus1.clone();
			plus.addAll(Coeff_plus2);
			Collections.sort(plus);
			
			for(int i = plus.size() - 1; i >= 0; i--) {
				String[] split = plus.get(i).split(":");
				if(i == plus.size() - 1) {
					System.out.print(split[1] + "x^" + split[0]);
				}else
				if(Integer.parseInt(split[0]) > 1) {
					if(Integer.parseInt(split[1]) > 0) {
						System.out.print(" + " + split[1] + "x^" + split[0]);
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])) + "x^" + split[0]);
					}
				}
				if(Integer.parseInt(split[0]) == 1) {
					if(Integer.parseInt(split[1]) > 0) {
						System.out.print(" + " + split[1] + "x");
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])) + "x");
					}
				}
				if(Integer.parseInt(split[0]) == 0) {
					if(Integer.parseInt(split[1]) > 0) {
						System.out.print(" + " + split[1]);
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])));
					}
				}
			}
		}
		
		if(sign.equals("-")) {
			ArrayList<String> Coeff_minus1 = new ArrayList<String>(Coeff_1);
			ArrayList<String> Coeff_minus2 = new ArrayList<String>(Coeff_2);
			for(int i = 0; i < Coeff_minus1.size(); i++) {
				for(int j = 0; j < Coeff_minus2.size(); j++) {
					String[] a = Coeff_minus1.get(i).split(":");
					String[] b = Coeff_minus2.get(j).split(":");
					if(a[1].equals("-")) {
						a[1] = "-1";
					}
					if(b[1].equals("-")) {
						b[1] = "-1";
					}
					if(a[0].equals(b[0])) {
						b[1] = String.format("%d", Integer.parseInt(a[1]) - Integer.parseInt(b[1]));
						Coeff_minus1.remove(i);
						if(Integer.parseInt(b[1]) == 0) {
							Coeff_minus1.remove(j);
						}else {
							Coeff_minus2.set(j, b[0] + ":" + b[1]);
						}
					}
				}
			}
			ArrayList<String> minus = (ArrayList<String>)Coeff_minus1.clone();
			minus.addAll(Coeff_minus2);
			Collections.sort(minus);
			
			for(int i = minus.size() - 1; i >= 0; i--) {
				String[] split = minus.get(i).split(":");
				if(split[1] == "1") {
					split[1] = "";
				}
				if(i == minus.size() - 1) {
					System.out.print(split[1] + "x^" + split[0]);
				}else
				if(Integer.parseInt(split[0]) > 1) {
					if(Integer.parseInt(split[1]) > 1) {
						System.out.print(" + " + split[1] + "x^" + split[0]);
					}else 
					if(Integer.parseInt(split[1]) == 1){
						System.out.print(" + " + "x^" + split[0]);
					}else
					if(Integer.parseInt(split[1]) == -1) {
						System.out.print(" - " + "x^" + split[0]);
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])) + "x^" + split[0]);
					}
				}
				if(Integer.parseInt(split[0]) == 1) {
					if(Integer.parseInt(split[1]) > 0) {
						System.out.print(" + " + split[1] + "x");
					}else 
					if(Integer.parseInt(split[1]) == 1){
						System.out.print(" + x");
					}else
					if(Integer.parseInt(split[1]) == -1) {
						System.out.print(" - x");
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])) + "x");
					}
				}
				if(Integer.parseInt(split[0]) == 0) {
					if(Integer.parseInt(split[1]) > 0) {
						System.out.print(" + " + split[1]);
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])));
					}
				}
			}
		}

		if(sign.equals("*")) {
			ArrayList<String> Coeff_multiply1 = new ArrayList<String>(Coeff_1);
			ArrayList<String> Coeff_multiply2 = new ArrayList<String>(Coeff_2);
			ArrayList<String> multiply = new ArrayList<String>();
			for(int i = 0; i < Coeff_multiply1.size(); i++) {
				for(int j = 0; j < Coeff_multiply2.size(); j++) {
					String[] a = Coeff_multiply1.get(i).split(":");
					String[] b = Coeff_multiply2.get(j).split(":");
					if(a[1].equals("-")) {
						a[1] = "-1";
					}
					if(b[1].equals("-")) {
						b[1] = "-1";
					}
					multiply.add((Integer.parseInt(a[0]) + Integer.parseInt(b[0])) + ":" + (Integer.parseInt(a[1]) * Integer.parseInt(b[1])));
				}
			}
			Collections.sort(multiply);
			for(int k = 0; k < multiply.size() - 1; k++) {
				String[] Split_1 = multiply.get(k).split(":");
				String[] Split_2 = multiply.get(k+1).split(":");
				if(Integer.parseInt(Split_1[0]) == Integer.parseInt(Split_2[0])) {
					multiply.set(k + 1, Split_2[0] + ":" + (Integer.parseInt(Split_1[1]) + Integer.parseInt(Split_2[1])));
					multiply.remove(k);
				}
			}
			for(int k = 0; k < multiply.size() - 1; k++) {
				String[] Split_1 = multiply.get(k).split(":");
				String[] Split_2 = multiply.get(k+1).split(":");
				if(Integer.parseInt(Split_1[0]) == Integer.parseInt(Split_2[0])) {
					multiply.set(k + 1, Split_2[0] + ":" + (Integer.parseInt(Split_1[1]) + Integer.parseInt(Split_2[1])));
					multiply.remove(k);
				}
			}
			
			for(int m = 0; m < multiply.size() - 1; m++) {
				String[] Split = multiply.get(m).split(":");
				if(Split[1].equals("0")) {
					multiply.remove(m);
				}
			}

			for(int n = 0; n < multiply.size() - 1; n++) {
				String[] Split_1 = multiply.get(n).split(":");
				String[] Split_2 = multiply.get(n+1).split(":");
				String temp;
				if(Integer.parseInt(Split_1[0]) > Integer.parseInt(Split_2[0])) {
					temp = multiply.get(n+1);
					multiply.set(n+1, multiply.get(n));
					multiply.set(n, temp);
				}
			}
			
			for(int i = multiply.size() - 1; i >= 0; i--) {
				String[] split = multiply.get(i).split(":");
				if(split[1] == "1") {
					split[1] = "";
				}
				if(i == multiply.size() - 1) {
					System.out.print(split[1] + "x^" + split[0]);
				}else
				if(Integer.parseInt(split[0]) > 1) {
					if(Integer.parseInt(split[1]) > 1) {
						System.out.print(" + " + split[1] + "x^" + split[0]);
					}else 
					if(Integer.parseInt(split[1]) == 1){
						System.out.print(" + " + "x^" + split[0]);
					}else
					if(Integer.parseInt(split[1]) == -1) {
						System.out.print(" - " + "x^" + split[0]);
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])) + "x^" + split[0]);
					}
				}
				if(Integer.parseInt(split[0]) == 1) {
					if(Integer.parseInt(split[1]) > 0) {
						System.out.print(" + " + split[1] + "x");
					}else 
					if(Integer.parseInt(split[1]) == 1){
						System.out.print(" + x");
					}else
					if(Integer.parseInt(split[1]) == -1) {
						System.out.print(" - x");
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])) + "x");
					}
				}
				if(Integer.parseInt(split[0]) == 0) {
					if(Integer.parseInt(split[1]) > 0) {
						System.out.print(" + " + split[1]);
					}else {
						System.out.print(" - " + Math.abs(Integer.parseInt(split[1])));
					}
				}
			}
		}	
	}
}