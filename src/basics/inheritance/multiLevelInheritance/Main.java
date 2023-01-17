package basics.inheritance.multiLevelInheritance;

public class Main {
    public static void main (String[] args){
        IPhone14 iPhone = new IPhone14();

        iPhone.makeCalls();
        iPhone.unlockPhoneByFaceId();
        iPhone.support5GNetwork();
    }
}
