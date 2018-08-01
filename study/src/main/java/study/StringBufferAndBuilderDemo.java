/**
 *
 */
package study;

/**
 * @author chenqiang
 */
public class StringBufferAndBuilderDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自动生成的方法存根

        String string = "0";
        int n = 10000;
        long begin = System.currentTimeMillis();
        for (int i = 1; i < n; i++) {
            string += i;
        }

        long end = System.currentTimeMillis();
        long between = end - begin;
        System.out.println("使用String类耗时:" + between + "ms");

        int n1 = 10000;
        StringBuffer sb = new StringBuffer("0");
        long begin1 = System.currentTimeMillis();
        for (int j = 1; j < n1; j++) {
            sb.append(j);
        }
        long end1 = System.currentTimeMillis();
        long between1 = end1 - begin1;
        System.out.println("使用StringBuffer类耗时:" + between1 + "ms");

        int n2 = 10000;
        StringBuilder sb2 = new StringBuilder("0");
        long begin2 = System.currentTimeMillis();
        for (int k = 1; k < n2; k++) {
            sb2.append(k);
        }
        long end2 = System.currentTimeMillis();
        long between2 = end2 - begin2;
        System.out.println("使用StringBuilder类耗时:" + between2 + "ms");


        System.out.println("--------------------------");


        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length());
        ;
        System.out.println(sb1.capacity());

        StringBuffer sbTest1 = new StringBuffer("hello world");
        System.out.println(sbTest1.length());
        ;
        System.out.println(sbTest1.capacity());


        System.out.println("--------------------------");


        StringBuffer sbTest2 = new StringBuffer();

        sbTest2.append("hello ").append(" world;");


        System.out.println(sbTest2.toString());


    }

}
