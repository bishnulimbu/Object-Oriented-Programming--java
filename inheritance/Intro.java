
class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}

class Dog extends Animal{
    void drink(){
System.out.println("dog is dringking");
}

public class Intro{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.drink();
    }
}
