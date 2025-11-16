package implementation;

import team.Actor;
import team.Director;

import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.getName().equals(newActor.getName()) &&
                    actor.getSurname().equals(newActor.getSurname()) &&
                    actor.getHeight() == newActor.getHeight()) {
                System.out.println("Такой актер уже добавлен");
                return;
            }
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String oldActorSurname) {
        boolean replace = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(oldActorSurname)) {
                listOfActors.set(i, newActor);
                replace = true;
                break;
            }
        }
        if (!replace) {
            System.out.println("Актер с предложенной фамилией отсутствует");
        }
    }
}