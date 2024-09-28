package day5;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        try{
            int num= sc.nextInt();
            if(num>60000) {
                throw new NumberFormatException("Number Too Large :~()");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
//jhhgdjkfhsdb grelifugbdjfb sdfidu hdfjklvh ldfh jvh df dfbkjf iuh adarh lki o iodf b hu