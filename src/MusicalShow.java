import java.util.ArrayList;

public class MusicalShow extends Show {

    static String musicAuthor = "Сергей Сергеев";
    String librettoText;

    public MusicalShow(String title, int duration, ArrayList<Actor> listOfActors) {
        super(title, duration, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}