package baseTest;

public class test1 {

    public static void main(String[] args) {

        System.out.println(1 << 4);

        System.out.println(1 << 2);

        System.out.println(1 << 3);

        System.out.println(1 << 30);

        System.out.println("=======================");

        int h = 0;
        h = "demo".hashCode();

        System.out.println(h);
        System.out.println((h >>> 16));
        System.out.println(h ^ (h >>> 16));

        System.out.println("=======================");

        System.out.println(1 >>> 16);

        System.out.println(Integer.MAX_VALUE);

    }
}
