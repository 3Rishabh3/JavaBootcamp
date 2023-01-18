package basics;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {
    public void devApp(Computer machine) {
        machine.code();
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer rishabh = new Developer();
        rishabh.devApp(lap);
    }
}
