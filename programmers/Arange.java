package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Arange {
	public long solution(long n) {
		long answer = 0;
		
		String str = String.valueOf(n);	
		System.out.println(str);
		
		char[] c = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			c[i] = str.charAt(i);
		}

		// 1�� ���
		Arrays.sort(c);
		String res = "";
		for(int i=c.length-1;i>=0;i--) {
			res += c[i];
		}		
	
		/*
		// 2�� ���
		// char[]�� Array�� ��ȯ String[], Integer[]
		String str2 = new String[str.length()]
		for(int i=0;i<c.length;i++){
			str2[i] = c[i];
		}	
		Arrays.sort(str2, Collections.reverseOrder());
		*/		
		
		System.out.println(res);
		answer = Long.parseLong(res);
		return answer;
	}
}
