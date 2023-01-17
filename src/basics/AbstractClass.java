package basics;

abstract class Car{ // Abstract class
    public abstract void drive();
    public abstract void fly();
    public void playMusic () {
        System.out.println("Playing music");
    }
}

abstract class Thar extends Car {
    public void drive(){
        System.out.println("Driving in Thar style");
    }
}

class UpdatedThar extends Thar {  // Concrete class
    public void fly(){
        System.out.println("Flying in updated Thar");
    }
}
public class AbstractClass {
    public static void main(String[] args){
        Car obj = new UpdatedThar();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}
