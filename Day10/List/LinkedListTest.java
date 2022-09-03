import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add("Abstract Method");
        ll.add("007 no time to die");

        System.out.println(ll);

        ll.clear();
        ArrayList al = new ArrayList<>();

        for(int i=0; i<100000; i++){
            al.add(i);
            ll.add(i);
        }

        long stime = System.currentTimeMillis();
        for(int i=0; i<al.size(); i++){
            al.get(i);
        }
        long etime = System.currentTimeMillis();
        System.out.println("ArrayList Read Time : " + (etime-stime));

        stime = System.currentTimeMillis();
        for(int i=0; i< ll.size(); i++){
            ll.get(i);
        }
        etime = System.currentTimeMillis();
        System.out.println("LinkedList Read Time : " + (etime-stime));

        //Insert Test
        stime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            al.add(1000,i);
        }
        etime = System.currentTimeMillis();
        System.out.println("ArrayList Insert Time : " + (etime-stime));

        stime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            ll.add(1000,i); //ll.add(50000,i); // 이 성능이 낮은 이유는 get후에 insert를 해야 하므로
        }
        etime = System.currentTimeMillis();
        System.out.println("LinkedList Insert Time : " + (etime-stime));
    }
}
