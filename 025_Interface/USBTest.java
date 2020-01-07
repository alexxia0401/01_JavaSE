public class USBTest {
    
    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);
        System.out.println("***************");
        com.transferData(new Printer());
    }
}

class Computer {
    public void transferData(USB usb) {
        usb.start();
        System.out.println("具体传输的细节");
        usb.stop();
    }
}

interface USB {
    // 定义USB的一些常量，比如针脚数量，传输速度等
    
    void start();
    
    void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}