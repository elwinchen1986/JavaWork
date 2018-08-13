package iotest.nio;


import iotest.PathTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * NIOTest
 *
 * @author chenqiang
 * @date 2018/7/17 10:25
 */
public class NIOTest {


    public static void main(String[] args) {

        try {

            FileInputStream fileInputStream = new FileInputStream("test.txt");
            FileChannel channel = fileInputStream.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            String d = "123456";
            byteBuffer.put(d.getBytes());

            int read = channel.read(byteBuffer);

            System.out.println(read);


        } catch (FileNotFoundException e) {


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
