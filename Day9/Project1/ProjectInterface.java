package Day9.Project1;

public interface ProjectInterface {
    // 인터페이스의 버전을 나타내는 변수
    static int version = 10;

    // 현재 인터페이스의 버전을 나타내는 메서드
    public int getVersion();

    // str에 fstr이 들어있는지 검사하는 메서드, hint) string의 indexOf메서드 이용
    public boolean checkString(String str, String fstr);

    // 파라미터들을 모두 합쳐서 return
    // 난이도 1 : String을 합친다.
    String mergeString1(String[] params);
    
    // 난이도 2 : StringBuffer을 이용하여 합친다.
    String mergeString2(String[] params);

    // 난이도 3 : 난이도 2와 동일하나, 인풋이 1개라면 "Only 1 Input Excpetion"이라는 예외 발생
    String mergeString3(String[] params) throws Exception;
}
