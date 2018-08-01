/**
 *
 */
package websitelog;

import java.io.File;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import common.EJob;

/**
 * �鿴�����־�У��������У��Ǹ�ҳ�������ҳ�����
 *
 * @author chenqiang
 */
public class WebSiteLog {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Configuration configuration = new Configuration();

        try {

            String inputPath = "hdfs://192.168.3.28:9000/chenqiangtest/input/websitelog/log.txt";
            String outputPath = "hdfs://192.168.3.28:9000/chenqiangtest/output/websitelog/";

            // String inputPath = "D:\\����\\1.txt";
            // String outputPath = "D:\\����\\output";

            args = new String[2];

            args[0] = inputPath;
            args[1] = outputPath;

            File file = new File(outputPath);

            if (file.exists() && file.isDirectory()) {

                deleteAllFilesOfDir(file);
            }

            Job job = Job.getInstance(configuration, "WebSiteLogTest");

            job.setJarByClass(WebSiteLog.class);
            job.setJar(EJob.createPack("target").getPath());

            job.setMapperClass(WebSiteLogMapper.class);
            job.setReducerClass(WebSiteLogReducer.class);

//			job.setOutputFormatClass(TextOutputFormat.class);
//			job.setInputFormatClass(TextInputFormat.class);
//
//			job.setOutputKeyClass(DealerUrlCount.class);
//			job.setOutputValueClass(NullWritable.class);

            // ����mapper�������kv����
            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(DealerUrlCount.class);

            // ���������������kv����
            job.setOutputKeyClass(DealerUrlCount.class);
            job.setOutputValueClass(NullWritable.class);

            FileInputFormat.addInputPath(job, new Path(args[0]));
            FileOutputFormat.setOutputPath(job, new Path(args[1]));

            job.waitForCompletion(true);

        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

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
