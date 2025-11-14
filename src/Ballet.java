import java.util.ArrayList;

public class Ballet extends MusicalShow {

    static String choreographer = "Николай Николаев";

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choreographer = choreographer;
    }
}