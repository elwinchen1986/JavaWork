package collections;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * StreamTest
 *
 * @author chenqiang
 * @date 2018/4/8 9:11
 */
public class StreamTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }

        List<String> list1 = list.stream()
                .filter(x -> x.equals("5"))
//                .map(x->x.toLowerCase())
                .collect(toList());


        list1.forEach(x -> {

            System.out.println(x);
        });


    }
}
