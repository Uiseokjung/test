public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "";
		StringBuffer str2 = new StringBuffer("");
		
		long start = System.currentTimeMillis();
		//System.out.println(start);
		
		for(int i=0;i<10000;i++) {
			str1 = str1 + i;
		}
		
		long end = System.currentTimeMillis();
		
		for(int i=0;i<10000;i++) {
			str2.append(i);
		}
		
		long end2 = System.currentTimeMillis();
		
		System.out.println("String수행시간 : " + (end-start));
		System.out.println("StringBuffer수행시간 : " + (end2-end));
		
		StringBuffer sb1 = new StringBuffer("abcde");
		StringBuffer sb2 = new StringBuffer("abcde");
		System.out.println("" + (sb1==sb2));
		
		// String�� ���� equals�� ���� ��
		System.out.println("" + (sb1.toString().equals(sb2.toString())));
		
	}

}