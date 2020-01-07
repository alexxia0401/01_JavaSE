public class InterfaceTest {

    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly();

    }
}

interface Flyable {
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;  // 省略 public static final
    
    public abstract void fly();
    
    void stop();  // 省略 public abstract
}

interface Attackable {
    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Start engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine.");   
    }
}

// 一个类可以实现多个接口
class Bullet implements Flyable, Attackable {

    @Override
    public void attack() {
        // TODO Auto-generated method stub  
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub   
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub    
    }
    
}

//*****************************************

interface AA {
    void method1();
}

interface BB {
    void method2();
}

// 接口可以继承多个接口
interface CC extends AA, BB {
    
}

class AAA implements CC {

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        
    }
}