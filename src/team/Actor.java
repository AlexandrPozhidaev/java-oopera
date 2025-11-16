package team;

import java.util.Objects;

public class Actor extends Person {

    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актёр: " + name + " " + surname + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }

    public Object getHeight() {
        return height;
    }
}