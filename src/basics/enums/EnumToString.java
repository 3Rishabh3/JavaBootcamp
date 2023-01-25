package basics.enums;

enum Device {
    LAPTOP, IPAD, DESKTOP;
}
public class EnumToString {
        public static void main(String[] args) {
        Device device = Device.DESKTOP;
        String output = device.toString();
//        String output = device.name(); // Alternative way
        System.out.println(output);
    }
}
