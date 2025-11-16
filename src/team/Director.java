package team;

public class Director extends Person {

    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр: " + name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

}