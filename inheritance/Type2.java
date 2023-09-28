// Multilevel inheritance.java
class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}

class Dog extends Animal{

}

class Cat extends Dog{

}

public class Type2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();

    }
}
