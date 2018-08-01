package exceptiontest;


public class Test1 {

    public void carry() {
        Test2 t2 = new Test2();
        try {
            t2.open();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("this is test3 block!");
        }
    }
}
