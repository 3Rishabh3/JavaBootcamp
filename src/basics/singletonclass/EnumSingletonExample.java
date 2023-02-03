package basics.singletonclass;

enum Printer {
    INSTANCE;

    private boolean isInUse = false;

    public void print(String document) {
        if (isInUse) {
            System.out.println("Printer is in use, please wait");
        } else {
            System.out.println("Printing document: " + document);
            isInUse = true;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isInUse = false;
        }
    }
}

class Computer {
    public void printDocument(String document) {
        Printer.INSTANCE.print(document);
    }
}

public class EnumSingletonExample {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Thread t1 = new Thread(() -> computer1.printDocument("Document 1"));
        Thread t2 = new Thread(() -> computer2.printDocument("Document 2"));

        t1.start();
        t2.start();
    }
}
