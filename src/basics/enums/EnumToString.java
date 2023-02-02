package basics.enums;

enum Device {
    LAPTOP, IPAD, DESKTOP;
    public static String getString(Device device){
        return device.toString();
    }
}
public class EnumToString {
        public static void main(String[] args) {
        Device device = Device.DESKTOP;
        String output = device.toString();
//        String output = device.name(); // Alternative way
            System.out.println(Device.getString(device.LAPTOP));
        System.out.println(output);
    }
}
