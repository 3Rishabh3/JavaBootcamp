package basics;

enum Device {
    LAPTOP, IPAD, DESKTOP;
}
public class EnumToString {
        public static void main(String[] args) {
        Device device = Device.DESKTOP;
        String output = device.toString();
        System.out.println(output);
    }
}
