package collections;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * PriorityQueueT
 * Create by  chenqiang  on   2017/12/26 11:01
 */
public class PriorityQueueT {

    public static void main(String[] args) {
        int[] ia = {1, 10, 5, 3, 4, 7, 6, 9, 8};
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

        for (int x : ia) {
            pq1.offer(x);
        }

        // 注意排序
        System.out.println("pq1: " + pq1);
    }

}
