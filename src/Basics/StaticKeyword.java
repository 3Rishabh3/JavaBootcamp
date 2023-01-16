package Basics;

class Mobile {
    int price; //Object member
    String brand; // Object member
    static String name; // name is always same i.e., "smartPhone" and it is a class member not instance.
    // name is class member
    static {
        name = "SmartPhone";
        System.out.println("in static block");
        /* This block will be called only once at the time of class loading,
           not every time whenever an object is created like a constructor.
           And this block will be called first before constructor because
           class loading is done first in java.
        */
    }

    public Mobile(){
        price = 200;
        brand = "Apple";
        Mobile.name = "Phone";
        System.out.println("in constructor");
        /* This block will be called every time a object is created */
    }
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class StaticKeyword {
    public static void main (String[] args){
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 1500;
        mb1.show();

        Mobile mb2 = new Mobile();
    }
}
