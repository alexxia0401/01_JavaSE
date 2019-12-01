// 输入两个正整数，求最大公约数。
// 比如 12，20 的最大公约数是 4。

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入第一个正整数: ");
        int m = scan.nextInt();

        System.out.print("请输入第二个正整数: ");
        int n = scan.nextInt();

        int min = (m >= n) ? n : m;

        for (int i = min; i >= 1; i--) {
            if ((m % i == 0) && (n % i == 0)) {
                System.out.println("最大公约数是: " + i);
                break;
            }
        }
    }
}