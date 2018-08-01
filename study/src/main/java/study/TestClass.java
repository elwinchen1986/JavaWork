package study;

public class TestClass extends Base {

    static {
        System.out.println("test static");
    }

    public TestClass() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new TestClass();
    }
}
