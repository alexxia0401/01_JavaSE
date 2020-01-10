public class ErrorTest {

    public static void main(String[] args) {

        // Exception in thread "main" java.lang.StackOverflowError
        main(args);
        
        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        // Integer[] arr = new Integer[1024 * 1024 * 1024];

    }
}