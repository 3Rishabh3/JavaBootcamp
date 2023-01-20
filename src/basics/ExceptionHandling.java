package basics;

class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}
public class ExceptionHandling {
    public static void main(String[] args){
        int[] nums = new int[5];
        int i = 3; // Try this with i > 4
        try{
            if(nums[i] == 0)
                throw new CustomException("Custom exception");
        }
        catch (CustomException e) {
            nums[i] = 1;
            System.out.println("That's the default value : " + nums[i]);
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
