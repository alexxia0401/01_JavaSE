public class SingletonTest2 {

    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();

        System.out.println(o1 == o2);
    }

}

// 懒汉式单例模式
class Order {
    private Order() {
        
    }
    
    private static Order instance = null;
    
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}