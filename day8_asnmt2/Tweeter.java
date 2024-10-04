package day8_asnmt2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tweeter {

    public static List<Tweet> initializelist()
    {
        List<Tweet> tweets = new ArrayList<>();

        tweets.add(new Tweet("Tech Conference", 1500, "03/10/2024", new HashSet<>(Arrays.asList("#Tech", "#Conference", "#AI" ,"#India"))));
        tweets.add(new Tweet("Sports Event Highlights", 3000, "01/10/2024", new HashSet<>(Arrays.asList("#Sports", "#Football","#India", "#Highlights"))));
        tweets.add(new Tweet("New Movie Release", 2000, "02/05/2023", new HashSet<>(Arrays.asList("#Movies", "#Cinema", "#Hollywood"))));
        tweets.add(new Tweet("Tech Conference", 50000, "20/11/2023", new HashSet<>(Arrays.asList("#Launch", "#Gadgets", "#Innovation"))));
        tweets.add(new Tweet("Travel Tips 2024", 1200, "05/07/2024", new HashSet<>(Arrays.asList("#Travel","#India", "#Vacation", "#Adventure"))));
        tweets.add(new Tweet("Breaking News", 8000, "03/10/2023", new HashSet<>(Arrays.asList("#BreakingNews", "#Politics", "#World"))));
        tweets.add(new Tweet("Cooking Tips", 100000, "18/04/2024", new HashSet<>(Arrays.asList("#Cooking", "#Food", "#Recipes"))));
        tweets.add(new Tweet("Music Concert Live", 2500, "25/06/2023", new HashSet<>(Arrays.asList("#Music", "#Concert","#India", "#Live"))));
        tweets.add(new Tweet("Fitness Tips", 1800, "12/03/2024", new HashSet<>(Arrays.asList("#Fitness", "#Health", "#Wellness"))));
        tweets.add(new Tweet("Tech Conference", 40000, "29/08/2023", new HashSet<>(Arrays.asList("#Jobs", "#Tech","#India", "#Hiring"))));

        return tweets;
    }

    public static void main(String[] args) {
        List<Tweet> tweets = initializelist();
        LocalDate today = LocalDate.now();
        Stream<Tweet> stream = tweets.stream();
        System.out.println("----------------------listing all the tweets posted in current month----------------------");
        stream.filter((twit)->twit.getDate().getMonthValue() == today.getMonthValue() && twit.getDate().getYear() == today.getYear()).forEach(System.out::println);


        System.out.println("\n\n------=---------lisiting all the tweets for #India hashtag----------------------------");
        stream = tweets.stream();
        stream.filter((twit)->twit.getHashtags().contains("#India")).forEach(System.out::println);


        System.out.println("\n\n---------------Counting the tweets of subjects-------------------------------");
        stream = tweets.stream();
        stream.collect(Collectors.groupingBy(Tweet::getSubject, Collectors.counting())).forEach((k,v)-> System.out.println("No of tweets of subject '"+k+"' are:"+v));

        System.out.println("\n\n---------------------listing the tweet which got more than 10k views---------------------");
        stream = tweets.stream();
        stream.filter((twit)->twit.getNoOfViews()>10000).forEach(System.out::println);

        System.out.println("\n\n---------------------Printing top 5 trending Tweet------------------------");
        stream = tweets.stream();
        Comparator<Tweet> byView = Comparator.comparing(Tweet::getNoOfViews);
        stream.sorted(byView.reversed()).limit(5).forEach(System.out::println);



    }
}
