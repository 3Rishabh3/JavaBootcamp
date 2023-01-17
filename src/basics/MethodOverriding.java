package basics;

class IPhone6 {
    public void camera (){
        System.out.println("Capturing by 10MP");
    }

    public void makeCall () {
        System.out.println("Calling...");
    }
}

class IPhone12 extends IPhone6 {
    public void camera (){
        System.out.println("Capturing by 12MP");
    }
}
public class MethodOverriding {
    public static void main (String[] args){
        IPhone12 iPhone12 = new IPhone12();
        IPhone6 iPhone6 = new IPhone6();
        iPhone12.camera();
        iPhone6.camera();
    }
}
