package day3;

//import java.util.Scanner;
import java.lang.*;


//public class Assignment1 {
//    public static boolean compare(String a, String b) {
//        if(a.length() != b.length()){
//            return false;
//        }
//        for(Character c : a.toCharArray()) {
//            boolean count = true;
//           for (Character c2 : b.toCharArray()) {
//               if(c == c2) {
//                   count = false;
//                   int ind = b.indexOf(c2);
//                   b = b.substring(0, ind) + b.substring(ind + 1);
//                   break;
//               }
//           }
//           if(count) {return false;}
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("String 1 : ");
//        String a = sc.next();
//
//        System.out.println("String 2 : ");
//        String b = sc.next();
//        if(compare(a,b)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//
//    }
//}


// upper_lower_special count
//public class Assignment1 {
//    public static void counts(String a) {
//        int c_upper = 0;
//        int c_lower = 0;
//        int c_special = 0;
//        for (char i : a.toCharArray()) {
//            if(Character.isLowerCase(i)){
//                c_lower++;
//            }
//            else if(Character.isUpperCase(i)){
//                c_upper++;
//            }
//            else if(!Character.isLetterOrDigit(i)){
//                c_special++;
//            }
//        }
//        System.out.println("The count of lowers are:" + c_lower + "\nThe count of uppers are:" + c_upper + "\nThe count of specials are:" + c_special);
//    }
//
//    public static void main(String[] args) {
//        String a = "adarsh1234@gmail.com";
//        counts(a);
//    }
//}



// Check if string UpperCase
public class Assignment1 {
    public static boolean check(String n){
        for(char ch : n.toCharArray()){
            if(!Character.isUpperCase(ch)) {
                return false;
            }
        }
        return true;
    }

    public static String shift(String n){
        int l = n.length();
//        char[] charArray = new char[l];
//        int j = l - 1;
//        for(char ch : n.toCharArray()){
//            j = j % l;
//            charArray[j] = ch;
//            j += 1;
//        }
//        return new String(charArray);



//        }
        String s = n.substring(1,l) + n.charAt(0);
        return s;
    }

    public static void test_equals(String n, String s){
        if(s.equals(n)){
            System.out.println(n + " == " + s);
        }
        else if (s.equalsIgnoreCase(n)) {
            System.out.println(n + " == " + s + "  without considering cases");

        }
    }

    public static void main(String[] args) {
        String n = "ANKIT";
        if (check(n)) {
            System.out.println("All are uppercase");
        }
        else {
            System.out.println("All are not uppercase");
        }

        System.out.println(shift(n));

        test_equals(n, "ankit");
    }

}
