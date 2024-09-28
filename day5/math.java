package day5;

public class math {

    public static void main(String[] args) {
        try {
            double dividend = Double.parseDouble(args[0]);
            double divisor = Double.parseDouble(args[1]);

            double result = dividend / divisor;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("The divisor can not be zero");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Enter Integers only");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter 2 values as dividend and divisor");
            System.out.println(e.getMessage());
        }


        System.out.println("after execution");

    }
}
