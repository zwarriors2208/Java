package day4;

import java.util.Scanner;
import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        Cart cart = new Cart();
//        dd[0] = new Cookies(25, "Chocolate", 2);
//        dd[1] = new IceCream(50, "Butter Scotch", 3);
//        dd[2] = new Candies(500, "Strawberry", 0.25);
//
//        double price = cart.addToCart(dd);
//        System.out.println("--------------------------------------------------------------\nTotal bill:"+price);
//
//        System.out.println("No. of items:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Dessert dd[] = new Dessert[n];
//        for(int i = 0; i < n; i++) {
//            System.out.println("Enter the name of item "+ (int)(i+1)+":");
//            String name = sc.next();
//            System.out.println("Enter the price of item "+(int)(i+1)+":");
//            double price = sc.nextDouble();
//            System.out.println("Enter the Quantity of item "+(int)(i+1)+":");
//            int quantity = sc.nextInt();
//            System.out.println("Enter the Flavour of item "+(int)(i+1)+":");
//            String flavour = sc.next();
//            switch (name.toLowerCase()) {
//                case "candies":
//                    dd[i] = new Candies(price, flavour, quantity);
//                    break;
//
//                case "icecream":
//                    dd[i] = new IceCream(price, flavour, quantity);
//                    break;
//
//                case "cookies":
//                    dd[i] = new Cookies(price, flavour, quantity);
//                    break;
//                default:
//                    System.out.println("Invalid item name!");
//
//            }
//        }
//        System.out.println("--------------------------------------------------------------");
//        double price = cart.addToCart(dd);
//        System.out.println("--------------------------------------------------------------\nTotal bill:"+price);
//

//        System.out.println("No. of items:");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        ArrayList<Dessert> dd = new ArrayList<>();
        while(true) {
            System.out.println("Enter the name of item :");
            String name = sc.next();
            System.out.println("Enter the price of item :");
            double price = sc.nextDouble();
            System.out.println("Enter the Quantity of item :");
            int quantity = sc.nextInt();
            System.out.println("Enter the Flavour of item :");
            String flavour = sc.next();
            String choice;
            switch (name.toLowerCase()) {
                case "candies":
                    dd.add(new Candies(price, flavour, quantity));
                    break;

                case "icecream":
                    dd.add(new IceCream(price, flavour, quantity));
                    break;

                case "cookies":
                    dd.add(new Cookies(price, flavour, quantity));
                    break;
                default:
                    System.out.println("Invalid item name!");
                    break;

            }
            do {
                System.out.println("Do you want to add more items[Y/N]");
                choice = sc.next();
                choice = choice.toUpperCase();
            } while (!(choice.equals("Y") || choice.equals("N")));

            if(choice.equals("N"))
                break;

        }

        System.out.println("--------------------------------------------------------------");
        Dessert[] dessertArray = dd.toArray(new Dessert[0]);
        double price = cart.addToCart(dessertArray);
        System.out.println("--------------------------------------------------------------\nTotal count:"+ dessertArray.length + "\nTotal bill:"+price);
        System.out.println("--------------------------------------------------------------");
    }
}
