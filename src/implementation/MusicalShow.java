package implementation;

import team.Actor;
import team.Director;
import team.MusicAuthor;

import java.util.ArrayList;

public class MusicalShow extends Show {

    protected String librettoText;
    protected MusicAuthor musicAuthor;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}