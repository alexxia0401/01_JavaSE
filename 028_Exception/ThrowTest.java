public class ThrowTest {

    public static void main(String[] args) {
        try {
            Student s1 = new Student();
            s1.register(-1001);
            System.out.println(s1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class Student {
    private int id;
    
    public void register(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            // throw new RuntimeException("输入的id非法");
            throw new Exception("输入的id非法");
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }
    
    
}