package helloworld;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.tools.javac.util.List;

public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    private static Logger logger = LoggerFactory.getLogger(WordMapper.class);

    private final IntWritable one = new IntWritable(1);
    private Text word = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) {

        String line = null;

        try {
            line = new String(value.getBytes(), 0, value.getLength(), "GBK");

        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }

        logger.debug(
                String.format("=======================WorldMapper Key=%s ֵ=%s========================", key, line));

        StringTokenizer token = new StringTokenizer(line);

        try {

            while (token.hasMoreTokens()) {

                String string = token.nextToken();

                LinkedList<String> words = splitString(string);

                for (String string2 : words) {

                    word.set(string2);

                    context.write(word, one);
                }

            }
        } catch (IOException e) {

            e.printStackTrace();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

    /**
     * ���
     *
     * @param s
     * @return
     */
    private LinkedList<String> splitString(String s) {

        LinkedList<String> rList = new LinkedList<String>();

        Pattern p = Pattern.compile("\\S{1}");
        Matcher m = p.matcher(s);
        while (m.find()) {

            rList.add(m.group());

        }

        return rList;

    }

}
