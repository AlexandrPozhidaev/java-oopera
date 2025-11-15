import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE,180);
        Actor actor2 = new Actor("Петр", "Викторов", Gender.MALE, 190);
        Actor actor3 = new Actor("Виктория", "Иванова", Gender.FEMALE, 170);

        Director director1 = new Director("Артем", "Анин", Gender.MALE, 10);
        Director director2 = new Director("Анна", "Артемова", Gender.FEMALE, 15);

        MusicAuthor musicAuthor = new MusicAuthor("Виктория", "Филиппова", Gender.FEMALE);

        Choreographer choreographer = new Choreographer("Жанна", "Танцева", Gender.FEMALE);

        ArrayList<Actor> listOfActorsShow = new ArrayList<>();
        ArrayList<Actor> listOfActorsOpera = new ArrayList<>();
        ArrayList<Actor> listOfActorsBallet = new ArrayList<>();

        Show show = new Show("Обычный спектакль", 60, director1, listOfActorsShow);
        Opera opera = new Opera("Оперный спектакль", 120, director2, listOfActorsOpera, musicAuthor,
                "(Текст либретто оперы) для вывода", 7);
        Ballet ballet = new Ballet("Балетный спектакль", 180, director1, listOfActorsBallet, musicAuthor,
                "(Текст либретто балета) для вывода", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Список актеров обычного спектакля: ");
        show.printActors();
        System.out.println();

        System.out.println("Список актеров оперного спектакля: ");
        opera.printActors();
        System.out.println();

        System.out.println("Список актеров балетного спектакля: ");
        ballet.printActors();
        System.out.println();

        show.replaceActor(actor3, "Петров");
        System.out.println();

        System.out.println("Актёры в обычном спектакле после замены:");
        show.printActors();
        System.out.println();

        ballet.replaceActor(actor1, "Никифорова");
        System.out.println();

        opera.printLibrettoText();
        System.out.println();
        ballet.printLibrettoText();
    }
}