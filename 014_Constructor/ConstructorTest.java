public class ConstructorTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person Rick = new Person("Rick");
        Person Morty = new Person("Morty", 14);
    }
}

class Person {
    private String name;
    private int age;
    
    // Person() constructor overloading.
    // Notice an empty Person() {} is required.
    Person() {
        
    }
    
    Person(String n) {
        name = n;
    }
    
    Person(String n, int a) {
        name = n;
        age = a;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        age = a;
    }
}