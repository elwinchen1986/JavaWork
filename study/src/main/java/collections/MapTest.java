package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        System.out.println("HashMap的初始值:" + map.size());
        System.out.println("HashMap是否为空:" + (map.isEmpty() ? "是" : "否"));

        map.put("erqing", 1);
        map.put("niuniu", 2);
        map.put("egg", 3);
        System.out.println(map.size());
        System.out.println("HashMap是否为空:" + (map.isEmpty() ? "是" : "否"));


        /* 遍历HashMap中的元素 */

        for (Map.Entry<String, Integer> dd : map.entrySet()) {

            System.out.println(String.format("key=%s;value=%s", dd.getKey(),
                    dd.getValue()));
        }

        for (String string : map.keySet()) {

            System.out.println(String.format("key=%s;value=%s", string,
                    map.get(string)));
        }

        /* 检测是否含有某个Key */
        System.out.println(map.containsKey("egg"));

        /* 检测是否含有某个Value */
        System.out.println(map.containsValue(2));

        /* 打印hashCode */
        System.out.println(map.hashCode());

        //        MapTest.print2n();

        HashMap<Integer, String> stringHashMap = new HashMap<Integer, String>();

        stringHashMap.put(null, null);
        stringHashMap.put(1, "1");
        stringHashMap.put(1, "1");
        stringHashMap.put(1, "2");

        System.out.println(stringHashMap.size());

        stringHashMap.forEach((k, v) -> System.out.println(k + "===" + v));

        System.out.println();

        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        table.put(1, 1);
        table.put(1, 1);
        table.put(1, 2);

        System.out.println(table.size());

        table.forEach((k, v) -> {
            System.out.println(k + "===" + v);
        });

    }

    /**
     * * 打印在数组中出现n/2以上的元素 ,利用一个 HashMap来存放数组元素及出现的次数
     */
    public static void print2n() {

        int[] a = {2, 3, 2, 2, 1, 4, 2, 2, 2, 7, 9, 6, 2, 2, 3, 1, 0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : a) {

            if (map.containsKey(i)) {

                int count = map.get(i);
                count += 1;

                map.put(i, count);

            } else {
                map.put(i, 1);
            }

        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {

            if (i.getValue() > 1) {
                System.out.println(String.format("%d出现次数%d", i.getKey(), i.getValue()));
            }

        }

    }

    /**
     * 利用lambda
     */
    public static void print2n2() {

        int[] array = {2, 3, 2, 2, 1, 4, 2, 2, 2, 7, 9, 6, 2, 2, 3, 1, 0};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : array) {

            list.add(i);
        }

        // list.forEach(System.out::println);

        Map<Object, List<Integer>> d = list.parallelStream()
                .collect(Collectors.groupingBy(x -> x, Collectors.toList()));

        d.forEach((k, v) -> {

            if (v.size() > 1) {
                System.out.println(k + "===" + v.size());
            }

        });

    }

}
