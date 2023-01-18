package basics;

enum Machine {
    Macbook(3000), XPS(2400), Surface, ThinkPad(1700);
    private int price;

    private Machine(){
        price = 1000;
    }

    private Machine(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumExample {
    public static void main(String[] args) {
        Machine mc = Machine.Macbook;
        System.out.println(mc + " : " + mc.getPrice());
    }
}
