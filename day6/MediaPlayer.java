package day6;
import java.util.List;
import java.util.ArrayList;
public class MediaPlayer {
    public void playMyList(List<? extends Media> medialist){
        /*when wild card is used the collection can not be modified*/
        //medialist.add(new Video()); doesn't compile
        for (Media m:medialist)
        {
            m.play();
        }
    }
    public static void main(String[] args) {
        MediaPlayer player=new MediaPlayer();
        List<Song> songs=new ArrayList<>();
        songs.add(new Song(3212,"Happy nation"));
        songs.add(new Song(123, "Blinding Nights"));
        songs.add(new Song(987, "Chery Chery lady"));

        player.playMyList(songs);
    }
}
