package regexTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) throws IOException {

        String path = "D:\\下载\\1.txt";

        String content = RegexTest.readFile(path);

//		String regex = "(?<=[^\\x00-\\xff]\\.|name=\")(\\w+)\\d";

        String regex = "(?<=[^\\x00-\\xff]\\.)([^Ie]\\w+)\\d";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find() == true) {
            System.out.println(matcher.group());

            String string = matcher.group();
            String replace = string.replaceAll("\\d", "");

            content = content.replaceAll(string, replace);
        }

        RegexTest.writeFile("D:\\下载\\2.txt", content);

    }

    public static String readFile(String path) throws IOException {

        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis, "GBK");

        BufferedReader reader = new BufferedReader(isr);

        String s;
        StringBuffer sb = new StringBuffer();
        while ((s = reader.readLine()) != null) {

            sb.append(s);
            sb.append("\n");
        }

        reader.close();

        return sb.toString();

    }

    public static void writeFile(String path, String content) {

        try {

            FileOutputStream fos = new FileOutputStream(path, false);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

            BufferedWriter writer = new BufferedWriter(osw);

            writer.write(content);

            writer.flush();
            fos.flush();
            osw.flush();

            osw.close();
            writer.close();

        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }

}
