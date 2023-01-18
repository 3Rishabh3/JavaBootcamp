package basics;

class DefaultException extends Exception {
    public DefaultException() {
        System.out.println("Default exception");
    }
}

public class ExceptionHandling {
    public static void main(String[] args){
        int[] nums = new int[5];
        int i = 3;
        try{
            if(nums[i] == 0)
                throw new DefaultException();
        }
        catch (DefaultException e) {
            nums[i] = 1;
            System.out.println("That's the default value : " + nums[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
