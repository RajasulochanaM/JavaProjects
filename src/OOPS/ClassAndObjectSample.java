package OOPS;
//create a class
public class ClassAndObjectSample {
    String name;
    int age;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args){
        //creating an object
        ClassAndObjectSample obj = new ClassAndObjectSample();
        obj.name = "Rajasulochana";
        obj.age = 23;
        obj.display();
    }
}
