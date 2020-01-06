public class FinalTest {
    
    final int WIDTH = 0;  // final常量可以显式初始化
    final int LEFT;
    final int RIGHT;
    
    {
        LEFT = 1;  // final常量可以代码块初始化
    }
    
    public FinalTest() {
        RIGHT = 2;  // final常量可以构造器内初始化
    }
    
    public FinalTest(int n) {
        RIGHT = n;  // final常量可以构造器内初始化
    }
    
    // 方法的形参可以加final，实参传入值后就不可再改变
    public void show(final int n) {
        // n = 20;  // 编译不通过
        System.out.println(n);
    }

    public static void main(String[] args) {
        FinalTest t = new FinalTest();
        t.show(10);
    }
}

final class A {
    
}

//class B extends A {
//    final class A cannot be extended.
//}