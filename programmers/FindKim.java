package programmers;

public class FindKim {
	public String findKim(String[] seoul) {
//		String answer = "";
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				return "김서방은 " + i + "에 있다.";
			}
		}
		
		return "";
	}
}
