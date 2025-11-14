import java.util.ArrayList;

public class Show {

    String title;
    int duration;  //в минутах
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            listOfActors.remove(index);
            listOfActors.add(newActor);
        }
    }
}