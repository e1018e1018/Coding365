import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] type = input.nextLine().split(" ");
		int N = Integer.parseInt(type[0]);
		int M = Integer.parseInt(type[1]);
		int K = Integer.parseInt(type[2]);
		ArrayList<Integer> New = new ArrayList<Integer>();		
		ArrayList<Integer> Num = new ArrayList<Integer>();		

		for(int i = 1; i <= N; i++) {							//�̧ǥ[�JN�ӤH�A������۹����}�C��m
			Num.add(i);
		}
		for(int i = 0; i < K; i++) {							//�]�w�z������
			while(M > Num.size()) {								//�p�G����j��H�ơA�h�����h�H��(��֤@��)
				M -= Num.size();
			}
			System.out.print(Num.get(M - 1) + " ");				//����z�����H����m
			Num.remove(M - 1);									//�����z�����H
			
			if(M - 1 >= Num.size()) {							//�p�G�z�����H���̫�@�ӤH
				for(int k = 0; k < M - 1; k++) {				//�N�z�����H���e�����H��b�s�}�C
					New.add(Num.get(k));
				}
			}else {
				for(int j = M - 1; j < Num.size(); j++) {		//�N�z�����H���᭱���H�[�J�s�}�C���̫e��
					New.add(Num.get(j));
				}
				for(int k = 0; k < M - 1; k++) {				//�N�z�����H���e�����H��b�s�}�C���᭱�A�H�F���骺�ĪG
					New.add(Num.get(k));
				}
			}
			Num = (ArrayList<Integer>) New.clone();				//�ƻs�s�}�C�������°}�C���л\
			New.clear();//�s�}�C�M��
		}
		for(int i = 0; i < Num.size(); i++) {					//�z���٦b�}�C���Y�s�����H�A���쪺�Ĥ@�H�Y���B��
			System.out.print(Num.get(i));
			break;
		}	
	}
}