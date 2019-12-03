public class ArrayTest {
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 2, 3, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println("\n");

        // define array but not initialize it, JVM will assign default value 0 to all elements.
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
    }
}