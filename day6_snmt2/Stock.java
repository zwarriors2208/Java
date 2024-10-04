package day6_snmt2;

import day5.Employee;
import java.time.temporal.ChronoUnit;

import java.util.*;
import java.util.Map.Entry;
import java.time.LocalDate;

public class Stock {

//    initialising the data
    public List<Toy> addStock()
    {
        List <Toy> toys=new ArrayList<>();
        toys.add(new Toy(101, "Wooden Building Blocks", 25.99, 3, "23/01/2023", "Educational"));
        toys.add(new Toy(102, "Remote Control Car", 45.50, 6, "23/01/2022", "Battery Operated"));
        toys.add(new Toy(103, "Alphabet Puzzle", 12.00, 4, "23/01/2023", "Educational"));
        toys.add(new Toy(104, "Talking Robot", 60.99, 7, "23/01/2021", "Battery Operated"));
        toys.add(new Toy(105, "Plush Teddy Bear", 15.99, 2, "23/01/2023", "Soft Toy"));
        toys.add(new Toy(106, "LEGO Classic Creative Set", 34.95, 5, "23/01/2023", "Building"));
        toys.add(new Toy(107, "Musical Toy Keyboard", 27.75, 3, "23/01/2022", "Musical"));
        toys.add(new Toy(108, "Kids Microscope Set", 49.99, 8, "23/01/2021", "Educational"));
        toys.add(new Toy(109, "Electronic Learning Tablet", 65.49, 6, "23/01/2022", "Electronic"));
        toys.add(new Toy(110, "Racing Car", 10.25, 4, "23/01/2023", "Mechanical"));
        toys.add(new Toy(111, "Baby Rattle", 5.50, 1, "23/01/2023", "Infant Toy"));
        toys.add(new Toy(112, "Arts & Crafts Kit", 18.20, 9, "23/01/2020", "Creative"));
        toys.add(new Toy(113, "Remote Control Helicopter", 75.99, 10, "23/01/2020", "Battery Operated"));
        toys.add(new Toy(114, "Jigsaw Puzzle", 22.10, 12, "23/01/2021", "Puzzle"));
        toys.add(new Toy(115, "Coding Robot Kit", 80.00, 10, "23/01/2021", "Educational"));
        return toys;
    }
// making a function to print a list of Toy objects
    public void printList(List<Toy> toys){
        for(Toy i:toys){
            System.out.println(i);
        }
    }
// Filtering the toy object category wise
    public List<Toy> filterCategory(List<Toy> toys, String category)
    {
        List<Toy> filtered=new ArrayList<>();
        for(Toy i : toys){
            if (i.getCategory().equals(category)){
                filtered.add(i);
            }

        }

        return filtered;
    }


//    Listing toys by price range
    public List<Toy> priceRange(List<Toy> toys, double low, double high)
    {
        List<Toy> byRange=new ArrayList<>();
        for(Toy i : toys)
        {
            if(i.getPrice() >= low && i.getPrice() <= high)
            {
                byRange.add(i);
            }
        }
        return byRange;
    }

//    Listing toys by age group
    public List<Toy> ageGroup(List<Toy> toys, int age)
    {
        List<Toy> byAge = new ArrayList<>();
        for(Toy i : toys)
        {
            if(i.getAge() == age)
            {
                byAge.add(i);
            }
        }
        return byAge;
    }


//    making the list of old stocks i.e older than 1 year
    public List<Toy> oldStock(List<Toy> toys)
    {
        List<Toy> old=new ArrayList<>();
        for(Toy i : toys)
        {
////            if(2024 - i.purchase_year > 1)
//            LocalDate firstDate = LocalDate.of(2024, 9, 30);
//            long yearsDifference = ChronoUnit.YEARS.between(firstDate, i.purchase_year);
            double today = 2024 + (9/12.0);
            double purchase = i.purchase_year.getYear() +(i.purchase_year.getMonthValue()/12.0);
            double yearsDifference = today - purchase;
            if(yearsDifference > 1)
            {
                old.add(i);
            }
        }
        return old;
    }

//    Category wise
    public Map<String,List<Toy>> categoryWise(List<Toy> toys)
    {
        List<String> categories=new ArrayList<>();
        for(Toy i:toys)
        {
            if(!(categories.contains(i.getCategory())))
            {
                categories.add(i.getCategory());
            }
        }

        Map<String,List<Toy>> map = new HashMap<>();
        for(String i : categories)
        {
            List<Toy> toi = new ArrayList<>();
            for(Toy t:toys)
            {
                if(t.getCategory().equals(i))
                {
                    toi.add(t);
                }
            }
            map.put(i, toi);
        }
        return map;
    }
    public static void main(String[] args) {
        Stock stock=new Stock();
        List<Toy> toys = stock.addStock();
        stock.printList(toys);
        System.out.println("\n-----------toys by category--------------------");
        List<Toy> toys2 = stock.filterCategory(toys,"Educational");
        stock.printList(toys2);

        System.out.println("\n-------------binary search------------------------");
        Collections.sort(toys);
        int indeks = Collections.binarySearch(toys, new Toy(105, null, null, 0, "", null));
        System.out.println(indeks);

        System.out.println("\n-----------prices by range-----------------------");
        toys2 = stock.priceRange(toys,15,25);
        stock.printList(toys2);

        System.out.println("\n-------list toy by specific age group---------------------");
        toys2 = stock.ageGroup(toys,4);
        stock.printList(toys2);

        System.out.println("\n------------------------sort the toys by price---------------");
        Collections.sort(toys, new PriceComparator());
        stock.printList(toys);
        System.out.println("\n------------------------sort the toys by product id -----------------------");
        Collections.sort(toys);
        stock.printList(toys);

        System.out.println("\n------------------------sorting the toys by name -----------------------");
        Collections.sort(toys, new NameComparator());
        stock.printList(toys);
        System.out.println("\n====================Returning stock older than one year========================");
        toys2 = stock.oldStock(toys);
        stock.printList(toys2);

        System.out.println("\n------------------category wise---------------");

        Map<String, List<Toy>> map = stock.categoryWise(toys);
        Set<Entry<String, List<Toy>>> entrySet = map.entrySet();
        for(Entry<String, List<Toy>> entry : entrySet)
        {
            System.out.println("\nToys of Category '"+entry.getKey()+ "' are----->");
            for(Toy t:entry.getValue())
            {
                System.out.println("    "+t);
            }
        }


    }
}
