


// it is block which is similar to method have same as that class name.
// does not have any return type , not even a void.
// it is applicable for public , private, protected and default.
// it is executes automatically when we create and object.


// use :
// to initisialize object

// type
// Default constructor, which is create by compiler and it is hidden and it's doesn't have any argument 
// no-argument constructor , which is created  by user or and programmer and it'd doesn't have any argument
// parameterize constructor, which is created by user similar as a no-argument but, it contained a argument.


class Test{
    int age;
    String name;

    public Test(int age, String name){ // it is constructor
        this.age = age;
        this.name = name;
    }

}

public class Parameterize {
    public static void main(String[] args) {
        Test t1 = new Test(12,"bishal koirala");
        System.out.println(t1.name);

    }
}
