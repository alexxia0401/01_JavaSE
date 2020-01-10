public class ExceptionTest {

    public static void main(String[] args) {

        try {
            String str = "123";
            str = "abc";
            Integer i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}