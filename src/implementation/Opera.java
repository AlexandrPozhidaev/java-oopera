package implementation;

import team.Actor;
import team.Director;
import team.MusicAuthor;
import team.MusicalShow;

import java.util.ArrayList;
import java.util.Objects;

public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.choirSize = choirSize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Opera opera = (Opera) o;
        return choirSize == opera.choirSize;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(choirSize);
    }
}