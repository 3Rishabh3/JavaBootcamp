package basics;

class CustomE extends Exception {
    public CustomE(String msg) {
        super(msg);
    }
}
// TODO Create custom exception class : Arithmetic, IO, IndexOutOfBound, Sql
public class ExceptionHandling {
    public static void main(String[] args){
        int[] nums = new int[5];
        int i = 3; // Try this with i > 4
        try{
            if(nums[i] == 0)
                throw new CustomE("Custom exception");
        }
        catch (CustomE e) {
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
