package OOPS.ThisSuperKeyword;

public class SubClass extends SuperClass{
    String projectName = "Python Project";
    void displayDetails(){
        System.out.println("Parent Project:"+super.projectName);
        System.out.println("Child Project:"+this.projectName);
        super.displayProjectInfo();
    }
    public static void main(String[] args){
        SubClass obj = new SubClass();
        obj.displayDetails();
    }
}
