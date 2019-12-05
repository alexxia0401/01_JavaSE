import java.util.Arrays;

public class BubbleSearchTest {

    public static void main(String[] args) {
        int[] arr = new int[] {98, 0, -54, -66, 7, -9, 12, 34, 89};
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }  
        System.out.println(Arrays.toString(arr));
    }
}