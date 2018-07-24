import java.util.*;

public class _17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		String _1 = input.next();
		String _2 = input.next();
		int num = input.nextInt();
		
		int dot, _1Dot = 0, _2Dot = 0;
		for(int i = _1.length() - 1; i >= 0; i--) {
			String[] Split = _1.split("");
			if(Split[i].equals(".")) {
				_1Dot = _1.length() - i;
				break;
			}
		}
		for(int i = _2.length() - 1; i >= 0; i--) {
			String[] Split = _2.split("");
			if(Split[i].equals(".")) {
				_2Dot = _2.length() - i;
				break;
			}		
		}
		if(_1Dot > _2Dot) {
			dot = _1Dot;
		}else {
			dot = _2Dot;
		}
		
		String[] _1Split = _1.split("\\.");
		String[] _2Split = _2.split("\\.");
		String zero = "";
		int count = 0;
		if(_1Split[0].length() > _2Split[0].length()) {
			for(int i = 0; i < _1Split[0].length() - _2Split[0].length(); i++) {
				zero += "0";
				count++;
			}
			_2Split[0] = zero + _2Split[0];
			zero = "";
		}
		if(_1Split[0].length() < _2Split[0].length()) {
			for(int i = 0; i < _2Split[0].length() - _1Split[0].length(); i++) {
				zero += "0";
				count++;
			}
			_1Split[0] = zero + _1Split[0];
			zero = "";
		}
		if(_1Split[1].length() > _2Split[1].length()) {
			for(int i = 0; i < _1Split[1].length() - _2Split[1].length(); i++) {
				zero += "0";
				count++;
			}
			_2Split[1] = _2Split[1] + zero;
			zero = "";
		}
		if(_1Split[1].length() < _2Split[1].length()) {
			for(int i = 0; i < _2Split[1].length() - _1Split[1].length(); i++) {
				zero += "0";
				count++;
			}
			_1Split[1] = _1Split[1] + zero;
			zero = "";
		}

		String _1Long = _1Split[0] + _1Split[1];
		String _2Long = _2Split[0] + _2Split[1];
		_1Split = _1Long.split("");
		_2Split = _2Long.split("");
		
		ArrayList<Integer> plus = new ArrayList<Integer>();
		
		int digit = 0;
		for(int i = _1Long.length() - 1; i >= 0; i--) {
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
			for(int k = plus.size() - 1; k > num; k--) {
				if(k == plus.size() - dot) {
					System.out.print(".");
				}
				System.out.print(plus.get(k));
			}
		}else {
			for(int k = plus.size() - 1; k > num; k--) {
				if(k == plus.size() - dot - count) {
					System.out.print(".");
				}
				System.out.print(plus.get(k));
			}	
		}
		System.out.print("\n");
		
		ArrayList<Integer> minus = new ArrayList<Integer>();
		
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
		if(_1.equals(_2)) {
			System.out.print(0);
		}else {
			if(_1.indexOf(".") < _2.indexOf(".")) {
				System.out.print("-");
				for(int k = minus.size() -1 ; k > num; k--) {
					if(k == minus.size() - dot - count) {
						System.out.print(".");
					}
					System.out.print(minus.get(k));
				}
			}else {
				for(int k = minus.size() -1 ; k > num; k--) {
					if(k == minus.size() - dot - count) {
						System.out.print(".");
					}
					System.out.print(minus.get(k));
				}
			}
		}
		
		System.out.print("\n");
		
		int[] multiply = new int[_1Long.length() + _2Long.length() + Math.abs(_1Long.length() - _2Long.length())];
		
		for(int i =0 ; i < _1Long.length(); i++){
            for(int j =0; j < _2Long.length(); j++){
            	multiply[i + j] += Integer.parseInt(_1Split[i]) * Integer.parseInt(_2Split[j]);
            }
        }
        for(int i =multiply.length - 1; i > 0 ;i--){
        	multiply[i - 1] += multiply[i] / 10;
            multiply[i] = multiply[i] % 10;
        }

        //if(add_1 == 0 || add_2 == 0) {
        //	System.out.print(0);
        //}
        //else {
        	int m;
            for(m = 0; m < multiply.length -1; m++) {
            	if(multiply[m] != 0) {
            	break;
            }
            }
            for(int k = m; k < multiply.length - _1Dot - _2Dot + num - 5; k++) {
				if(k == multiply.length - _1Dot - _2Dot - 5) {
					System.out.print(".");
				}
            	System.out.print(multiply[k]);
            }
        //}

	}
}