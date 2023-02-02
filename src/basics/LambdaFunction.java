package basics;

@FunctionalInterface
interface Cal {
    int add(int x, int y);
}
public class LambdaFunction {
    public static void main(String[] args){
        Cal obj = Integer::sum;
        System.out.println(obj.add(3,5));
    }
}
