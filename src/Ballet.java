import java.util.ArrayList;

public class Ballet extends MusicalShow {

    Choreographer choreographer;
    MusicAuthor musicAuthor;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
                  String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.choreographer = choreographer;
        this.librettoText = librettoText;
        this.choreographer = choreographer;
    }
}