package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

    /**
     * @param args ArrayList LinkedList  Vector
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(i + "d");
        }

        list.add("10");
        list.add("20");

        list.forEach(System.out::println);

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add(null);
        l_list.add(null);

        for (int i = 0; i < 10; i++) {
            l_list.add(i + "d");
        }

        l_list.add("10");
        l_list.add("20");

        l_list.forEach(System.out::println);


        Vector<String> vtor = new Vector<String>();
        vtor.add("test");
        vtor.addAll(l_list);


        vtor.forEach(s -> {
            System.out.println(s);
        });


        // CopyOnWriteArrayList

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();

        copyOnWriteArrayList.add("12312");
        copyOnWriteArrayList.get(1);

    }


}
