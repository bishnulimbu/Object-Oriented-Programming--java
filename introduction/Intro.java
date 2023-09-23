package introduction;

// creating the my first class
class student{

    String name;
    int age;
    Float marks;

    // function to print infomration
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }

}

public class Intro{
    public static void main(String[] args) {

        student firstPerson = new student();
        student secondPerson = new student();

        firstPerson.name = "bishal koirala";
        firstPerson.age = 21;
        firstPerson.marks = 96.45f;

        secondPerson.name = "Bishnu limbu";
        secondPerson.age = 21;
        secondPerson.marks = 96.43f;

        
        firstPerson.getInfo();
        secondPerson.getInfo();

    }
}