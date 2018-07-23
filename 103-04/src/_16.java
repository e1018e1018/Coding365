import java.util.*;

public class _16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		String _1 = input.next();
		String _2 = input.next();
		if(_1.length() > 59 || _2.length() > 59) {
			System.exit(1);
		}
		ArrayList<Integer> plus = new ArrayList<Integer>();
		ArrayList<Integer> minus = new ArrayList<Integer>();
		int[] multiply = new int[_1.length() + _2.length() + Math.abs(_1.length() - _2.length())];
		String zero = "";

		int add_1 = 0, add_2 = 0;
		boolean negative = false;
		
		String[] _01Split = _1.split("");
		String[] _02Split = _2.split("");
		String tempString;
		int zeroCount = 0;
		int _1Length = _1.length();
		int _2Length = _2.length();
		
		if(_01Split[0].equals("-")) {
			_1Length--;
			for(int a = 1; a < _01Split.length; a++) { 
				add_1 += Integer.parseInt(_01Split[a]);
			}
		}else {
			for(int a = 0; a < _01Split.length; a++) { 
				add_1 += Integer.parseInt(_01Split[a]);
			}
		}
		if(_02Split[0].equals("-")) {
			_2Length--;
			for(int b = 1; b < _02Split.length; b++) { 
				add_2 += Integer.parseInt(_02Split[b]);
			}
		}else {
			for(int b = 1; b < _02Split.length; b++) { 
				add_2 += Integer.parseInt(_02Split[b]);
			}
		}
			
		for(int z = 0; z < Math.abs(_1Length - _2Length); z++) {
			zero += "0";
			zeroCount++;
		}
		if(_1Length < _2Length) {
			_1 = zero + _1;
			tempString = _1;
			_1 = _2;
			_2 = tempString;
			negative = true;
		}else 
		if(_1Length > _2Length){
			_2 = zero + _2;
		}else {
			if(add_1 < add_2) {
				tempString = _1;
				_1 = _2;
				_2 = tempString;
				negative = true;
			}
		}
		
		String[] _1Split = _1.split("");
		String[] _2Split = _2.split("");

		int digit = 0;
		for(int i = _1.length() - 1; i >= 0; i--) {
			int temp = Integer.parseInt(_1Split[i]) + Integer.parseInt(_2Split[i]);
			if(temp > 9) {
				temp %= 10;
				plus.add(digit + temp);
				digit = 0;
				digit++;
			}else {
				if(digit + temp > 9) {
					plus.add(0);
					digit = 0;
					digit++;
				}else {
					plus.add(digit + temp);
					digit = 0;
				}
			}
		}
		if(digit == 1) {
			System.out.print(digit);
			digit = 0;
			for(int k = plus.size() - 1; k >= 0; k--) {
				System.out.print(plus.get(k));
			}
		}else {
			for(int k = plus.size() - 1; k >= 0; k--) {
				System.out.print(plus.get(k));
			}	
		}
		System.out.print("\n");
		
		for(int i = _1.length() - 1; i >= 0; i--) {
			int temp = Integer.parseInt(_1Split[i]) - Integer.parseInt(_2Split[i]) + digit;
			if(temp < 0) {
				temp += 10;
				minus.add(temp);
				digit = 0;
				digit--;
			}else {
				minus.add(temp);
				digit = 0;
			}
		}
		if(negative) {
			System.out.print("-");
			for(int k = minus.size() -1 ; k >= 0; k--) {
				System.out.print(minus.get(k));
			}
		}else {
			for(int k = minus.size() -1 ; k >= 0; k--) {
				System.out.print(minus.get(k));
			}
		}
		System.out.print("\n");
		
        for(int i =0 ; i < _1.length(); i++){
            for(int j =0; j < _2.length(); j++){
            	multiply[i + j] += Integer.parseInt(_1Split[i]) * Integer.parseInt(_2Split[j]);
            }
        }
        for(int i =multiply.length - 1; i > 0 ;i--){
        	multiply[i - 1] += multiply[i] / 10;
            multiply[i] = multiply[i] % 10;
        }

        if(add_1 == 0 || add_2 == 0) {
        	System.out.print(0);
        }
        else {
            if(multiply[zeroCount - 1] != 0) {
            	System.out.print(multiply[zeroCount - 1]);
            }
            for(int k = 0 + zeroCount; k < multiply.length - 1; k++) {
            	System.out.print(multiply[k]);
            }
        }

	
	}
}