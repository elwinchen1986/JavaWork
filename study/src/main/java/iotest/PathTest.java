package iotest;

import java.io.File;
import java.io.IOException;

public class PathTest {

    public static void main(String[] args) throws IOException {

        File file = new File("");

        System.out.println(file.getCanonicalPath());

        System.out.println(PathTest.class.getResource("").getPath());

        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("java.class.path"));

    }
}
