package OOPS.ThisSuperKeyword;

public class SampleClass {
    String deviceName;
    SampleClass(String name){
        this.deviceName = name;
    }
    void display(){
        System.out.println("Device Name:"+this.deviceName);
    }
    public static void main(String[] args){
        SampleClass sampleObj = new SampleClass("Oppo");
        sampleObj.display();

    }
}
