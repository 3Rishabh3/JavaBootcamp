package basics;

class Outer {
    int x;
    public void show() {
        System.out.println("in show");
    }

    class Inner {  // This class can be static also
        public void config() {
            System.out.println("in config");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj2 = obj.new Inner();
        obj2.config();
    }
}
