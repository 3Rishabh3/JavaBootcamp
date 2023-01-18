package basics;

interface Application {
    int size = 1024; // You must declare this variable because by default it is final and static in interfaces.
    void frontEnd();
    void backend(); // No need to add public before void, by default it is public in interfaces.
}

class MyApp implements Application {
    public void frontEnd() {
        System.out.println("Handling front end");
    }

    public void backend() {
        System.out.println("Handling backend");
    }
}
public class Interface {
    public static void main(String[] args) {
        Application app = new MyApp();
        app.backend();
        app.frontEnd();
    }
}
