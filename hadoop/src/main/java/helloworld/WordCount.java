package helloworld;

import java.io.File;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import common.EJob;

/**
 * @author chenqiang
 */
public class WordCount {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // String inputPath = "D:\\����\\1.txt";
        // String outputPath = "D:\\����\\output";
        String inputPath = "hdfs://192.168.3.28:9000/chenqiangtest/input/1.txt";
        String outputPath = "hdfs://192.168.3.28:9000/chenqiangtest/output/";

        args = new String[2];

        File file = new File(outputPath);

        if (file.exists() && file.isDirectory()) {

            deleteAllFilesOfDir(file);
        }

        args[0] = inputPath;
        args[1] = outputPath;

        // ����job
        Job job = Job.getInstance(new Configuration(), "chenqiang-wordcount-test");

        job.setJar(EJob.createPack("target").getPath());
        job.setJarByClass(WordCount.class);

        // ����ӳ����
        job.setMapperClass(WordMapper.class);
        job.setReducerClass(WordReduce.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        job.waitForCompletion(true);

    }

    /**
     * ɾ���ļ���
     *
     * @param path
     */
    public static void deleteAllFilesOfDir(File path) {
        if (!path.exists())
            return;
        if (path.isFile()) {
            path.delete();
            return;
        }
        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            deleteAllFilesOfDir(files[i]);
        }
        path.delete();
    }

}
