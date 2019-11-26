public class MyMod {
    public static void main(String[] args) {
        // 取模运算结果的符号和被取模数的符号相同，此处和 x1 的符号相同。
        
        int x1 = 13;
        int y1 = 5;
        System.out.println(x1 % y1);

        x1 = 13;
        y1 = -5;
        System.out.println(x1 % y1);

        x1 = -13;
        y1 = -5;
        System.out.println(x1 % y1);
    }
}