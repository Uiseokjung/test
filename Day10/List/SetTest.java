import java.util.*;
public class SetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
    hs.add("1");
    hs.add("James");
    hs.add("House");
    hs.add(1);

    System.out.println(hs);
    
    Iterator it = hs.iterator();
    while(it.hasNext()){
        //System.out.println(it.next());
        Object o = it.next();
        System.out.println(o.toString() + ":" + o.getClass().getSimpleName());
    }
    }
}
