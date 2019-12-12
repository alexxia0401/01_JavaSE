public class ThisConstructor {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person Rick = new Person("Rick");
        Person Morty = new Person("Morty", 14);
    }
}

class Person {
    private String name;
    private int age;
    
    Person() {
        
    }
    
    Person(String name) {
        this.name = name;
    }
    
    Person(String name, int age) {
        this(name);
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}