package day5;

public class MathNew {
    public static void divide(String s1,String s2)throws ArithmeticException,NumberFormatException,ArrayIndexOutOfBoundsException {
        int dividend = Integer.parseInt(s1);
        int divisor = Integer.parseInt(s2);

        int result = dividend / divisor;
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        try{
            divide(args[0],args[1]);
    }
    //multi catch block
        catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e ) {
            System.out.println(e);
        }
        System.out.println("I am happy");
    }
}