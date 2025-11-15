import java.util.ArrayList;

public class Opera extends MusicalShow {

    public int choirSize;
    MusicAuthor musicAuthor;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choirSize = choirSize;
    }
}