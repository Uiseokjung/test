

import java.util.*;

public class ListClass {
    public static void main(String[] args) {
        // List Test
        //ArrayList<String> list1 = new ArrayList<String>();
        ArrayList list1 = new ArrayList();
        list1.add("1");
        list1.add("100");
        list1.add("myblog");
        System.out.println(list1);
        System.out.println(list1.size());

        list1.add(1, "new one");
        System.out.println(list1);
        System.out.println(list1.size());

        list1.add(1); // String형만 됨.
        System.out.println(list1);
        System.out.println(list1.size());
        if(list1.get(0) != list1.get(4))
            System.out.println("Not Equal");

        //contains
        System.out.println("List가 myblog를 포함하나요? " + list1.contains("myblog"));

        //clear
        list1.clear();
        System.out.println(list1);
    }
}
