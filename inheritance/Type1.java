// Single type inheritance 
class Student{
    String name;
    int age;

    void getinfo(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Students extends Student{

}

public class Type1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "bishal";
        s1.age = 21;

        Students s2 = new Students();
        s2.name = "bishnu";
        s2.age = 21;

        s1.getinfo();
        s2.getinfo();
        
    }
}

