public class SingletonTest1 {

    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();

        System.out.println(b1 == b2);
    }

}

// 饿汉式单例模式
class Bank {
    // 1. 私有化构造器
    private Bank() {
        
    }
    
    // 2. 内部创建该类的对象，要求此对象必须是静态的
    private static Bank instance = new Bank();
    
    // 3. 提供公共的方法，返回该类的对象
    public static Bank getInstance() {
        return instance;
    }
}