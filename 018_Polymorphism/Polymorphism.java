import java.util.Random;

public class Polymorphism {

    public static void main(String[] args) {
        int key = new Random().nextInt(3);
        
        System.out.println(key);
        
        Animal animal = getInstance(key);
        animal.eat();
        
    }
    
    public static Animal getInstance(int key) {
        switch (key) {
        case 0:
            return new Cat();
        case 1:
            return new Dog();
        default:
            return new Sheep();
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eats foods.");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eats fishes.");
    }
}

class Sheep extends Animal {
    public void eat() {
        System.out.println("Sheep eats grass.");
    }
}