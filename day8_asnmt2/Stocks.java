package day8_asnmt2;
import day6_snmt2.Toy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Stocks {
    public List<Toy> addStock()
    {
        List <Toy> toys=new ArrayList<>();
        toys.add(new Toy(101, "Wooden Building Blocks", 25.99, 3, "23/01/2024", "Educational"));
        toys.add(new Toy(102, "Remote Control Car", 45.50, 6, "13/02/2022", "Battery Operated"));
        toys.add(new Toy(103, "Alphabet Puzzle", 12.00, 4, "21/12/2024", "Educational"));
        toys.add(new Toy(104, "Talking Robot", 60.99, 7, "27/11/2021", "Battery Operated"));
        toys.add(new Toy(105, "Plush Teddy Bear", 15.99, 2, "03/01/2023", "Soft Toy"));
        toys.add(new Toy(106, "LEGO Classic Creative Set", 34.95, 5, "03/06/2023", "Building"));
        toys.add(new Toy(107, "Musical Toy Keyboard", 27.75, 3, "23/07/2022", "Musical"));
        toys.add(new Toy(108, "Kids Microscope Set", 49.99, 8, "30/04/2021", "Educational"));
        toys.add(new Toy(109, "Electronic Learning Tablet", 65.49, 6, "31/03/2024", "Electronic"));
        toys.add(new Toy(110, "Racing Car", 10.25, 4, "23/12/2023", "Mechanical"));
        toys.add(new Toy(111, "Baby Rattle", 5.50, 1, "12/05/2023", "Infant Toy"));
        toys.add(new Toy(112, "Arts & Crafts Kit", 18.20, 9, "11/11/2020", "Creative"));
        toys.add(new Toy(113, "Remote Control Helicopter", 75.99, 10, "23/01/2020", "Battery Operated"));
        toys.add(new Toy(114, "Jigsaw Puzzle", 22.10, 12, "11/12/2021", "Puzzle"));
        toys.add(new Toy(115, "Coding Robot Kit", 80.00, 10, "23/01/2021", "Educational"));
        return toys;
    }


    // filtering the stocks by categories
//    public Map<String,List<Toy>> categoryWise(List<Toy> toys)
//    {
//        List<String> categories=new ArrayList<>();
//        for(Toy i:toys)
//        {
//            if(!(categories.contains(i.getCategory())))
//            {
//                categories.add(i.getCategory());
//            }
//        }
//        Map<String,List<Toy>> map=new HashMap<>();
//        Stream<Toy> stream = toys.stream();
//        stream.map(n->stream.filter(toi->toi.getCategory().equals(n)));
//
//    }





















    public static void main(String[] args) {
        Stocks stock=new Stocks();
        List<Toy> toys = stock.addStock();
        Stream<Toy> stream = toys.stream();

        // listing the stock
        stream.forEach(System.out::println);

        // filtering the stocks by category

        stream = toys.stream();
        Map<String, List<Toy>> map = stream.collect(Collectors.groupingBy(Toy::getCategory));
        map.forEach((k,v)->System.out.println("\nToys of Category "+k+" are--------------------------------->\n"+v));


        // toys by price range
        System.out.println("\n\n-----------------------------------Toys by price Range----------------------------");
        Predicate<Toy> pricerange = (toi)->{
            if(toi.getPrice()>25 && toi.getPrice()<50)
                return true;
            else
                return false;
        };
        stream = toys.stream();
        stream.filter(pricerange).forEach(System.out::println);

        //Sort the toys by price-category wise
        System.out.println("\n\n----------------toys sorted by price-Category wise--------------------------");
        stream = toys.stream();
        Comparator<Toy> byPrice = Comparator.comparing(Toy::getPrice);
        Comparator<Toy> byCat = Comparator.comparing(Toy::getCategory).thenComparing(byPrice);
        stream.sorted(byCat).forEach(System.out::println);

        //make the list of old stocks older than 1 year
        System.out.println("\n\n--------------------list of old stocks--------------------------");
        stream = toys.stream();
        stream.filter(toi -> ChronoUnit.YEARS.between(toi.getPurchase_year(), LocalDate.now()) >= 1).forEach(System.out::println);

        System.out.println("\n\n--------------------count of toys as per their category-----------------");
        stream = toys.stream();
        Map<String, Long> map1 = stream.collect(Collectors.groupingBy(Toy::getCategory, Collectors.counting()));
        map1.forEach((k,v)-> System.out.println(k+" : "+v));

        // displaying the most and least expensive toy in given category
        System.out.println("\n\n------------------displaying the most and least expensive toy in 'Educational' category--------------");
        stream = toys.stream();
        System.out.println("Most Expensive toy in 'Educational' category:");
        String temp = "Educational";
        stream.filter(toi-> toi.getCategory().equalsIgnoreCase("Educational")).max(Comparator.comparing(Toy::getPrice)).ifPresent(System.out::println);
        System.out.println("Cheapest toy in 'Educational' category:");
        stream  = toys.stream();
        stream.filter(toi->toi.getCategory().equalsIgnoreCase("Educational")).min(Comparator.comparing(Toy::getPrice)).ifPresent(System.out::println);
        System.out.println("\n\n---------Printing Total no. of toys for each age group--------------------------");
        stream = toys.stream();
        stream.collect(Collectors.groupingBy(Toy::getAge, Collectors.counting())).forEach((k,v)-> System.out.println("For age group of '"+k+"' years old:"+" : "+v));

    }
}
