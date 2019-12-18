public class Polymorphism {

    public static void main(String[] args) {
        Polymorphism test = new Polymorphism();
        
        test.func(new Dog());
        test.func(new Cat());
    }
    
    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eats foods.");
    }
    
    public void shout() {
        System.out.println("Animal is shouting.");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }
    
    public void shout() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eats fishes.");
    }
    
    public void shout() {
        System.out.println("Cat is miaomiaoing.");
    }
}