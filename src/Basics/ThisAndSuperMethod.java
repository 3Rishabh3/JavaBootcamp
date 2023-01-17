package Basics;

class A{
    public A(){
        super();
        System.out.println("In default constructor A");
    }

    public A(int a){
        super();
        System.out.println("In parameterized constructor A");
    }
}

class B extends A{
    public B(){
        super();
        /*
            super() is here by default even if we don't call it here.
            It is used to call constructors of parent class.
         */
        System.out.println("In default constructor B");
    }

    public B(int a){
        this();
        /*
            this() is used to call constructor of same class.
         */
        System.out.println("In parameterized constructor B");
    }
}
public class ThisAndSuperMethod {
    public static void main (String[] args){
        B b = new B(5);
    }
}
