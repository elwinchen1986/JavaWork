package arithmetic;

/**
 * BubbleSort 冒泡排序 时间复杂度 o (N^2)，最好的时间复杂度 o(N) 稳定排序算法
 *
 * @author chenqiang
 * @date 2018/8/10 12:59
 */
public class BubbleSort {

    public static void main(String[] args) {


        int[] a = {60, 50, 40, 30, 20, 10};

        bubbleSort1(a);
        bubbleSort2(a);
        bubbleSort3(a);
    }

    public static void bubbleSort1(int[] a) {

        int len = a.length;
        System.out.printf("before sort:=======>");
        for (len = 0; len < a.length; len++) {
            System.out.printf("%d ", a[len]);
        }
        System.out.printf("\n");

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {

                int i1 = a[j];
                int i2 = a[j + 1];

                if (i1 > i2) {
                    int tmp = i1;

                    a[j] = i2;
                    a[j + 1] = tmp;
                }

                count++;
            }
        }


        System.out.printf("after  sort:=====>");
        for (len = 0; len < a.length; len++) {
            System.out.printf("%d ", a[len]);
        }

        System.out.println("运行次数为========>" + count);

    }

    public static void bubbleSort2(int[] a) {

        int len = a.length;
        System.out.printf("before sort:=======>");
        for (len = 0; len < a.length; len++) {
            System.out.printf("%d ", a[len]);
        }
        System.out.printf("\n");

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {

                int i1 = a[j];
                int i2 = a[j + 1];

                if (i1 > i2) {
                    int tmp = i1;

                    a[j] = i2;
                    a[j + 1] = tmp;
                }

                count++;
            }
        }


        System.out.printf("after  sort:=====>");
        for (len = 0; len < a.length; len++) {
            System.out.printf("%d ", a[len]);
        }

        System.out.println("运行次数为========>" + count);

    }

    public static void bubbleSort3(int[] a) {

        int len = a.length;
        System.out.printf("before sort:=======>");
        for (len = 0; len < a.length; len++) {
            System.out.printf("%d ", a[len]);
        }
        System.out.printf("\n");

        int count = 0;

        int falg = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {

                int i1 = a[j];
                int i2 = a[j + 1];

                if (i1 > i2) {
                    int tmp = i1;

                    a[j] = i2;
                    a[j + 1] = tmp;

                    falg = 1;
                }

                count++;

                if (falg == 0) {
                    break;
                }
            }
        }


        System.out.printf("after  sort:=====>");
        for (len = 0; len < a.length; len++) {
            System.out.printf("%d ", a[len]);
        }

        System.out.println("运行次数为========>" + count);

    }
}
