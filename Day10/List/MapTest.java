import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();

        hm.put("Name", "James");
        hm.put("Age", 50);
        hm.put("Country", "Korea");

        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsKey("Country"));
        System.out.println(hm.containsValue(50));

        // Map에서 데이터를 꺼내는 방법
        // 1. Key를 받아서 Key에 해당하는 Value를 꺼내는 방법
        Set keyset = hm.keySet();
        System.out.println(keyset);
        Iterator it = keyset.iterator();
        while(it.hasNext()){
            System.out.println(hm.get(it.next()));
        }
        // 2. Key와 Value(entry)를 한꺼번에 꺼내는 방법
        Set entryset = hm.entrySet();
        System.out.println(entryset);
        Iterator it2 = entryset.iterator();
        while(it2.hasNext()){
            Map.Entry entry = (Map.Entry)it2.next();
            System.out.println("Key: " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
