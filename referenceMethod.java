// ##################### using reference #####################
class student{
    String name;
    int age;
    String address;
    float marks;
}

public class referenceMethod{
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.name = "Bishal koirala";
        s1.age = 21;
        s1.address = "Sudarharicha-10, morang";
        s1.marks = 97.7f;

        System.out.println(s1.name+" "+s1.age+" "+ s1.address+" "+s1.marks);
    }
}