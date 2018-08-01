//package arithmetic;
//
///**
// * KMP 算法
// * <p>
// * 字符串匹配。给你两个字符串，寻找其中一个字符串是否包含另一个字符串，如果包含，返回包含的起始位置。
// * <p>
// * Create by  chenqiang  on   2018/1/2 14:05
// */
//public class KMP {
//
//
//    public static void main(String[] args) {
//
//        String a = "ab";
//        String b = "adabc";
//
//        System.out.println("第一个字符串=" + a);
//        System.out.println("第二个字符串=" + b);
//
//        System.out.println("出现第一个字符串的索引是=" + method1(a, b));
//    }
//
//    /**
//     * 暴力方式
//     *
//     * @param s1
//     * @param s2
//     * @return 索引位置
//     */
//    public static int method1(String s1, String s2) {
//
//
//        int i = 0;
//        int j = 0;
//
//        int result = -1;
//
//        char[] charArray = s1.toCharArray();
//        char[] chars = s2.toCharArray();
//
//        //ab
//        //adabc
//
//        while (i < s1.length() && j < s2.length()) {
//
//            if (charArray[i] == chars[j]) {
//                i++;
//                j++;
//            } else {
//                j = j - i + 1;
//                i = 0;
//            }
//
//            if (i == s1.length()) {
//                result = j - i;
//            }
//        }
//
//
//        return result;
//
//    }
//
//
//    /**
//     * @param s1
//     * @param s2
//     * @return
//     */
//    public static int kmp(String s1, String s2) {
//
//        int i = 0;
//        int j = 0;
//
//        int result = -1;
//
//        char[] charArray = s1.toCharArray();
//        char[] chars = s2.toCharArray();
//
//        //ab
//        //adabc
//
//        while (i < s1.length() && j < s2.length()) {
//
//            if (charArray[i] == chars[j]) {
//
//                i++;
//                j++;
//
//            } else {
//
//                j=nextKMP();
//
//            }
//
//            if (i == s1.length()) {
//                result = j - i;
//            }
//        }
//
//
//        return result;
//    }
//
//    private static int[] nextKMP() {
//
//
//
//    }
//
//
//}
