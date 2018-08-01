package study;

public class StringDemo {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根

        String s = "123";
        String s2 = "123";
        String s3 = new String("123");
        String s4 = new String("123");

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s3 == s4);
        System.out.println(s.equals(s3));
        System.out.println(s3.equals(s4));
        //
        // // equals()和==的区别，一句话：equals()比较的是对象的内容，也就是JVM堆内存中的内容，==比较的是地址，也就是栈内存中的内容。
        //
        // System.out.println(s.substring(1, 3));
        //
        // s = s.replace("1", "4");
        // System.out.println(s);
        //
        // String[] result = s2.split("d");
        //
        // StringBuilder builder = new StringBuilder();
        //
        // for (String string : result) {
        //
        // System.out.println(string);
        //
        // builder.append(string);
        // }
        //
        // System.out.println(builder.toString() + " " + result.length);

//		int i = 2;
//		int j = 3;
//		String demo = "9";
//
//		System.out.println(i + j + demo);
//		System.out.println("-----------------------");
//		System.out.println(i + demo + j);
//
//		System.out.println("-----------------------");
//
//		String s = "ab";
//		String s1 = "a";
//		String s2 = s1 + "b";
//		String s3 = "ab";
//		System.out.println(s == s2);// false
//		System.out.println(s2 == s3);// false
//		System.out.println(s2.equals(s3));// true
//		System.out.println(s2.hashCode() == s3.hashCode());
//
//		System.out.println("-----------------------");
//
//		String s4 = "ad";
//		String s5 = "a" + "d";
//		String s6 = "ad";
//		System.out.println(s4 == s5);// true
//		System.out.println(s4 == s6);// true
//		System.out.println(s5 == s6);// true
//
//		System.out.println("-----------------------");
//
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
//		System.out.println(s5.hashCode());

    }

}
