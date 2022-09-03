package programmers;

public class Collatz {
	public int solution(int num) {
		int answer = 0;
		while(true) {
		if(num != 1) {	
			if(num%2==0) {
				num = num / 2;
				answer++;
			}
			else {
				num = num * 3 + 1;
				answer++ ;
			}
		}
		else break;
		}
		if(answer>500) return -1;
		return answer;
	}
}
