package programmers;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	int dimension = 0;
	int[] correct = new int[5];
	
	public BaseBall(int n) {
		dimension = n;
		
		// Random�� �̿��Ͽ� ������ ����
		// ���� : ���� correct�� �� ���ڰ� ������ �ȵ�
		Random rd = new Random();
		for(int i=0; i<5; i++) {
			correct[i] = -1;
		}
			
		for(int i=0; i<n; i++) {
			int j = 0;
			boolean dup = false;
			
			while(true) {
				dup = false;
				
				j = rd.nextInt(10);
				for(int k=0; k<correct.length; k++) {
					if(j == correct[k]) dup = true; 
				}
				
				if(!dup) break;
			}
			correct[i] = j;
		}
		
		// ������ ���� �迭�� �ý������� ���(for debugging)
		//for(int i=0;i<dimension;i++) {
		//	System.out.print(correct[i]);
		//}
				
	}
	
	public void run() {
		// ���ѷ���
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		
		while(true) {
		// ����ڿ��� �Է��� �޴´�.
			System.out.print("���ڸ� �Է��ϼ���: ");
			String str = sc.next();
			String[] guess = new String[5];
			int[] guess_i = new int[5];
			int strikes = 0;
			int balls = 0;
			
			for(int i=0;i<str.length();i++) {
				guess[i] = str.substring(i,i+1);
				guess_i[i] = Integer.parseInt(guess[i]);
				//System.out.println(guess[i]);
			}
			
		// �� ���� ���ڰ� ��ġ�ϴ��� S B ���·� �����ش�.
			for(int i=0; i<dimension; i++) {
				for(int j=0; j<dimension; j++) {
					if(guess_i[i] == correct[j]) {
						if(i==j) strikes++;
						else balls++;
					}			
				}
			}
			
			System.out.println("����� �Է��� " + strikes + "S " + balls + "B�Դϴ�.");
			tries++;
		
		// �� ���� ��� Ż��
			if(strikes == dimension) break;
		}
		// ���ѷ��� Ż�� �Ŀ��� tryȸ���� ���ϸ޽��� ���
		System.out.println("�����մϴ�! " + tries + "�� ���� �����ϼ̽��ϴ�.");
		
	}	
	
	
}
