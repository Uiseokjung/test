package programmers;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	int dimension = 0;
	int[] correct = new int[5];
	
	public BaseBall(int n) {
		dimension = n;
		
		// Random을 이용하여 정답을 세팅
		// 조건 : 기존 correct에 그 숫자가 있으면 안됨
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
		
		// 생성된 숫자 배열을 시스템으로 출력(for debugging)
		//for(int i=0;i<dimension;i++) {
		//	System.out.print(correct[i]);
		//}
				
	}
	
	public void run() {
		// 무한루프
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		
		while(true) {
		// 사용자에게 입력을 받는다.
			System.out.print("숫자를 입력하세요: ");
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
			
		// 몇 개의 숫자가 일치하는지 S B 형태로 보여준다.
			for(int i=0; i<dimension; i++) {
				for(int j=0; j<dimension; j++) {
					if(guess_i[i] == correct[j]) {
						if(i==j) strikes++;
						else balls++;
					}			
				}
			}
			
			System.out.println("당신의 입력은 " + strikes + "S " + balls + "B입니다.");
			tries++;
		
		// 다 맞춘 경우 탈출
			if(strikes == dimension) break;
		}
		// 무한루프 탈출 후에는 try회수와 축하메시지 출력
		System.out.println("축하합니다! " + tries + "번 만에 성공하셨습니다.");
		
	}	
	
	
}
