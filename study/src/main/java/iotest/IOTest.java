package iotest;

import java.io.*;

public class IOTest {

    public static void main(String[] args) throws IOException {

        String path = new File(PathTest.class.getResource("").getPath(), "1.txt").getPath();

        long time = System.currentTimeMillis();

        // String result1 = IOTest.readFile(path);
        // System.out.println(result1);
        // System.out.println("readFile=" + (System.currentTimeMillis() - time) + "ms");

        IOTest.writeFile("D:\\下载\\1.txt");

        // time = System.currentTimeMillis();
        // String result2 = IOTest.readFile2(path);
        // System.out.println(result2);
        // System.out.println("readFile2=" + (System.currentTimeMillis() - time) +
        // "ms");
    }

    /**
     * @return
     * @throws IOException
     */
    public static String readFile(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String s;
        StringBuffer sb = new StringBuffer();
        while ((s = reader.readLine()) != null) {

            sb.append(s);
            sb.append("\n");
        }

        reader.close();

        return sb.toString();
    }

    /**
     * @param path
     * @return 字符串
     * @throws IOException
     */
    public static String readFile2(String path) throws IOException {

        BufferedInputStream bis = null;

        bis = new BufferedInputStream(new FileInputStream(path));

        int len = 0;
        byte[] bytes = new byte[1024];

        StringBuilder builder = new StringBuilder();
        while ((len = bis.read(bytes)) != -1) {

            builder.append(new String(bytes, 0, len));
            builder.append("\n");
        }

        bis.close();

        return builder.toString();
    }

    /**
     * @param path
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     * @category 写文件通过BufferWriter
     */
    public static void writeFile(String path) {

        try {

            FileWriter fileWriter = new FileWriter(path, true);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < 100; i++) {

                writer.append(i + "");
            }

            writer.flush();
            fileWriter.flush();

            fileWriter.close();
            writer.close();

        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }

    /**
     * @param path
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     * @category 写文件通过FileWriter
     */
    public static void writeFile2(String path) {

        try {
            // 构造函数中的第二个参数true表示以追加形式写文件
            FileWriter fw = new FileWriter(path, true);
            fw.write("1231232");
            fw.close();

            System.out.println(1111111111);
        } catch (IOException e) {
            System.out.println("文件写入失败！" + e);
        }

    }

}
