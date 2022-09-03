

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList alist1 = new ArrayList<>();
        System.out.println(alist1.size());

        alist1.add("John");
        alist1.add("have a nice day?");

        System.out.println(alist1.size());

        // 1. for문으로 get
        for(int i=0; i<alist1.size(); i++){
            System.out.println(alist1.get(i));
        }

        // 2. Iterator로 get
        Iterator it = alist1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        ArrayList alist2 = new ArrayList();
        alist2.add(cat1); // 클래스에서 나온 ArrayList는 주소까지 출력됨.
        alist2.add(cat2);
        alist2.add(dog1);
        alist2.add(dog2);
        alist2.add(10);
        alist2.add("Student");

        System.out.println(alist2);

        for(int i=0; i<alist2.size(); i++){
            System.out.println("getClass() : " + alist2.get(i).getClass());
            System.out.println("getClass().getName() : " + alist2.get(i).getClass().getName());
            System.out.println("getClass().getSimpleName() : " + alist2.get(i).getClass().getSimpleName());
        }
    }
}
class Cat{
    int legs;
}

class Dog{
    int age;
}
