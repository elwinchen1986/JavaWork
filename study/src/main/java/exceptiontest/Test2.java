package exceptiontest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test2 {

    public void open() {
        String filename = "d:\\test.txt";
        try {
            FileReader reader = new FileReader(filename);
            Scanner in = new Scanner(reader);
            String input = in.next();
            int value = Integer.parseInt(input);
            System.out.println(value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("this is test2 block!");
        }
    }

}
