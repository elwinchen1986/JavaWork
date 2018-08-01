package exceptiontest;

public class MyException extends RuntimeException {


    /**
     *
     */
    private static final long serialVersionUID = -5128957397586669079L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

}
