public class MyChar {
    public static void main(String[] args) {
        // char 变量相加会把 char 变成 int 处理
        // 只有 String 变量是字符串连接
        System.out.println('*' + '\t' + '*');
        System.out.println("*" + '\t' + "*");
    }
}