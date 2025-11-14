import java.util.ArrayList;

public class Opera extends MusicalShow {

    int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choirSize = choirSize;
    }
}