package day5;

public class StringMethods {
    public static String convertToLower(String str) throws EmptyStringException {
        if (str.equals(""))
            throw new EmptyStringException("String is empty");
        else
            return str.toLowerCase();
    }


    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "";
        try {
            String lower = convertToLower(s);
            System.out.println(lower);
        }
        catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
}
}
