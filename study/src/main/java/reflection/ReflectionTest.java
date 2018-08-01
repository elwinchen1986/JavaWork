package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * ReflectionTest
 * Create by  chenqiang  on   2017/12/26 11:41
 */
public class ReflectionTest {

    /**
     * The Age.
     */
    public final int AGE = 1;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Class cl = null;


        try {

//            cl = ReflectionTest.class;

            cl = Class.forName("reflection.ReflectionTest");
            System.out.println("打印构造函数：");
            printConstructors(cl);
            System.out.println("打印方法：");
            printMethods(cl);
            System.out.println("打印字段：");
            printFields(cl);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ReflectionTest() {
    }


    public ReflectionTest(String name) {
    }

    /**
     * 打印构造函数
     *
     * @param cl
     */
    private static void printConstructors(Class cl) {

        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor constructor : constructors) {

            System.out.println(constructor.getName());

            Parameter[] parameters = constructor.getParameters();

            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName() + "  " + parameter.getType());
            }

        }

    }

    /**
     * 打印方法
     *
     * @param cl
     */
    private static void printMethods(Class cl) {

        Method[] methods = cl.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName() + "   " + method.getGenericReturnType());
        }

    }


    private static void printFields(Class cl) {

        Field[] fields = cl.getFields();

        for (Field field : fields) {

            System.out.println(field.getName() + "  " + field.getType());
        }

    }


}
