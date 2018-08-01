package study;

import java.io.IOException;

/**
 * SwitchTest
 *
 * @author chenqiang
 * @date 2018/2/22 17:20
 */
public class SwitchTest {

    public static void main(String[] args) throws Exception {

        int type = 4;

        switch (type) {
            default:
                System.out.println(4);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:

                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
        }


        try {

            throw new Exception("1");

        } catch (IOException e) {

            throw new Exception("2");

        } catch (Exception e) {

            throw new Exception("3");
        } finally {
            throw new Exception("4");
        }

    }
}
