package day8_asnmt2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Set;


public class Tweet {
    String subject;
    int noOfViews;
    LocalDate date;
    Set<String> hashtags;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Tweet(String subject, int noOfViews, String date, Set<String> hashtags) {
        this.subject = subject;
        this.noOfViews = noOfViews;
        this.date = LocalDate.parse(date, formatter);
        this.hashtags = hashtags;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNoOfViews() {
        return noOfViews;
    }

    public void setNoOfViews(int noOfViews) {
        this.noOfViews = noOfViews;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<String> hashtags) {
        this.hashtags = hashtags;
    }

    public static DateTimeFormatter getFormatter() {
        return formatter;
    }

    public static void setFormatter(DateTimeFormatter formatter) {
        Tweet.formatter = formatter;
    }

    @Override
    public String toString() {

        return String.format(
                "Subject: %-30s | No. Of Views: %-12d | Date: %-12s | Hashtags: %-50s",
                subject, noOfViews, date, hashtags
        );
    }


}
