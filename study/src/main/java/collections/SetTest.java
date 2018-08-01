package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("F");
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        System.out.println("HashSet 顺序:\n" + hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("B");
        lhs.add("A");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");
        lhs.add("F");

        System.out.println("LinkedHashSet 顺序:\n" + lhs);

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("E");
        ts.add("C");
        ts.add("F");
        System.out.println("TreeSet 顺序:\n" + ts);

//		HashSet<String> hs1 = new HashSet<String>();  
//		hs1.add(null);
//		hs1.add(null);


    }

}
