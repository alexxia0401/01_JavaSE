public class StaticTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("p1 id: " + p1.getId() + ", total has " + p1.getTotal());
        Person p2 = new Person("Jason");
        System.out.println("p2 id: " + p2.getId() + ", total has " + p2.getTotal());
        Person p3 = new Person();
        System.out.println("p3 id: " + p3.getId() + ", total has " + p3.getTotal());
    }
    
}

class Person {
    private int id;
    private String name;
    
    private static int index = 1001;
    private static int total = 0;
    
    Person() {
        id = index++;
        total++;
    }
    
    Person(String name) {
        this();
        this.name =name;
    }
    
    public int getId() {
        return id;
    }
    
    public static int getTotal() {
        return total;
    }
}