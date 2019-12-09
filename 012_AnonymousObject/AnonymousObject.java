public class AnonymousObject {

    public static void main(String[] args) {
        // 下面两个对象是不同的对象
        new Phone().sendEmail();
        new Phone().playGame();
        
        PhoneFactory p1 = new PhoneFactory();
        // 这个时候执行的两个方法调用的是同一个对象，形参传进去的
        p1.show(new Phone());
    }
}

class Phone {
    int price;
    
    public void sendEmail() {
        System.out.println("Email sent.");
    }
    
    public void playGame() {
        System.out.println("Played game.");
    }
}

class PhoneFactory {
    public void show(Phone phone) {
        phone.sendEmail();
        phone.playGame();
    }
}