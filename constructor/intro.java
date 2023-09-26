package constructor;


// it is block which is similar to method have same as that class name.
// does not have any return type , not even a void.
// it is applicable for public , private, protected and default.
// it is executes automatically when we create and object.


// use :
// to initisialize object


class Test{
    int age;
    String name;

    public Test(int age, String name){ // it is constructor
        this.age = age;
        this.name = name;
    }

}

public class intro {
    public static void main(String[] args) {
        Test t1 = new Test(12,"bishal koirala");

    }
}
