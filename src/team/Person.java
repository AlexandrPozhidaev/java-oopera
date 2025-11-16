package team;

public class Person {

    protected String name;
    protected String surname;
    protected Gender gender;

    protected Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "team.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public Object getName() {
        return name;
    }
}