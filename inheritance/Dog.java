class Animal{
    void eat(){
        System.out.println("Hello world");
    }
}

class Dog extends Animal{ 
    public static void main(String[] args) {
       Animal a = new Animal();
       Dog d = new Dog();
       Cat c = new Cat();
       a.eat();
       d.eat();
       c.eat();
        //done
    }
}

class Cat extends Animal{

}
