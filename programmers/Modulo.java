package programmers;

public class Modulo {
	public int solution(int left, int right) {
		int answer = 0;
		
		/*
		// 1�� ���
		for(int i=left;i<=right;i++) {
			int count = 1;
			
			// 1�� ������ ����̹Ƿ� ��������ȭ�� ���� ������ �ʴ´�.
			for(int j=2;j<=i;j++) {
				// ������� �ƴ��� check
				if(i % j == 0) // ���
					count++;
			}
			
			// count�� ¦���̸� ���ϰ� Ȧ���̸� ����.
			if(count % 2 == 0)
				answer += i;
			else
				answer -= i;			
		}
		*/
		
		// 2�� ���
		for(int i=left;i<=right;i++) {
			if(Math.sqrt(i) - (int)Math.sqrt(i) > 0.001) answer += i;
			else answer -= i;
		}
		
		return answer;
	}
}
