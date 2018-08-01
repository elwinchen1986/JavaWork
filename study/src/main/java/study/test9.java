package study;

public class test9 {

    static {
        System.out.println("test static");
    }

    static Person1 person = new Person1("Test");

    {
        System.out.println("test 构造代码块");
    }

    public test9() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new MyClass1();
    }

}

class Person1 {
    static {
        System.out.println("person static");
    }

    {
        System.out.println("person 构造代码块");
    }

    public Person1(String str) {
        System.out.println("person " + str);
    }
}

class MyClass1 extends test9 {
    {
        System.out.println("MyClass 构造代码块");
    }

    Person1 person = new Person1("MyClass");


    static {
        System.out.println("myclass static");
    }

    public MyClass1() {
        System.out.println("myclass constructor");
    }
}