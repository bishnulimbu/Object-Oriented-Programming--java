// ########################-using-method-####################
class Animal{

    
    String name;
    String breed;
    int age;

    // making method for intalizing  
    void inputObject(String c, String b, int a){
        name = c;
        breed = b;
        age = a;
    }

    // making method for display 
    void display(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
    }


}
public class UsingMethod {
    public static void main(String[] args) {
        Animal dog = new Animal();


        dog.inputObject("puppy","husky",10);
        dog.display();
    }
}
