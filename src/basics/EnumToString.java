package basics;

enum Device {
    LAPTOP, IPAD, DESKTOP;
}
public class EnumToString {
        public static void main(String[] args) {
        Device device = Device.DESKTOP;
        String output = device.toString();
//        String output = color.name(); Alternative way
        System.out.println(output);
    }
}
