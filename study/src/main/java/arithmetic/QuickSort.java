package arithmetic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * QuickSort
 *
 * @author chenqiang
 * @date 2018/8/10 16:19
 */
public class QuickSort {

    static  int count=0;

    /**
     * 快速排序 快速排序的时间复杂度在最坏情况下是O(N2)，平均的时间复杂度是O(N*lgN)。
     *
     * @param sortData 待排序的数组
     * @param left     数组的左边界(例如，从起始位置开始排序，则l=0)
     * @param right    数组的右边界(例如，排序截至到数组末尾，则r=sortData.length-1)
     */
    public static void quickSort(int[] sortData, int left, int right) {

        if (left < right) {

            int i, j, x;

            i = left;
            j = right;
            x = sortData[i];

            while (i < j) {
                while (i < j && sortData[j] > x) {

                    // 从右向左找第一个小于x的数
                    j--;
                }

                if (i < j) {
                    sortData[i++] = sortData[j];
                }

                while (i < j && sortData[i] < x) {

                    // 从左向右找第一个大于x的数
                    i++;
                }
                if (i < j) {
                    sortData[j--] = sortData[i];
                }


            }


            sortData[i] = x;

            /* 递归调用 */
            quickSort(sortData, left, i - 1);

            /* 递归调用 */
            quickSort(sortData, i + 1, right);
        }
    }

    public static void main(String[] args) {
        int i;
        int a[] = {30, 40, 60, 10, 20, 50};

        System.out.printf("before sort=========>");
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");

        quickSort(a, 0, a.length - 1);

        System.out.printf("after  sort=========>");
        for (i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}
