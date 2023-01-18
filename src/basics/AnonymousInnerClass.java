package basics;

class Phone {
    int price;
    public void config() {
        System.out.println("Black : 32GB : 5G Support");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Phone ph = new Phone()
        {
            public void config() {
                System.out.println("Black : 32GB : 5G Support : Unlock by face id");
            }
        };
        ph.config();
    }
}
