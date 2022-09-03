package programmers;

public class Subak {
	public String subak(int n) {
		String answer = "";
		
		int moks = n / 2;
		int rem = n % 2;

		System.out.println("[Subak][subak()]input value :" + n + "," + moks + "," + rem);
		
		for(int i=0; i<moks ;i++)
			answer += "¼ö¹Ú";
		
		if(rem == 1)
			answer += "¼ö";
		
		return answer;
	}
}
