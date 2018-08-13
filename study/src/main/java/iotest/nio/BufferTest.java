package iotest.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * BufferTest
 *
 * @author chenqiang
 * @date 2018/8/3 18:16
 */
public class BufferTest {

    public static void main(String[] args) {

        String value = "123456789";

        CharBuffer byteBuffer = CharBuffer.allocate(1024);
        byteBuffer.put(value);

        byteBuffer.flip();

        System.out.println((char) byteBuffer.get());
        System.out.println((char) byteBuffer.get());

        byteBuffer.rewind();
        System.out.println((char) byteBuffer.get());

        byteBuffer.clear();
        System.out.println((char) byteBuffer.get());

    }

}
