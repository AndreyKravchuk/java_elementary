package HomeWork.StreamLambda;

/**
 * Created by andrey.kravchuk on 09.10.2017.
 */
public class Human {
    private String lastName;
    private String person;
    private int age;

    public Human(String lastName, String person, int age) {
        this.lastName = lastName;
        this.person = person;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPerson() {
        return person;
    }

    public int getAge() {
        return age;
    }
}
