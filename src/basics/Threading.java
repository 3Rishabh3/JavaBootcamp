package basics;

class Thread1 extends Thread { // This was a normal class until we extended it with Thread class
    public void run() { // This method is compulsory to start a thread
        for(int i = 0; i<100; i++){
            System.out.println("hi");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.println("hello");
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1(); // Now these are not normal objects.
        Thread2 th2 = new Thread2();

        th1.start();
        th2.start();
    }
}
