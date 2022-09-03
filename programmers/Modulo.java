package programmers;

public class Modulo {
	public int solution(int left, int right) {
		int answer = 0;
		
		/*
		// 1번 방법
		for(int i=left;i<=right;i++) {
			int count = 1;
			
			// 1은 무조건 약수이므로 수행최적화를 위해 돌리지 않는다.
			for(int j=2;j<=i;j++) {
				// 약수인지 아닌지 check
				if(i % j == 0) // 약수
					count++;
			}
			
			// count가 짝수이면 더하고 홀수이면 뺀다.
			if(count % 2 == 0)
				answer += i;
			else
				answer -= i;			
		}
		*/
		
		// 2번 방법
		for(int i=left;i<=right;i++) {
			if(Math.sqrt(i) - (int)Math.sqrt(i) > 0.001) answer += i;
			else answer -= i;
		}
		
		return answer;
	}
}
