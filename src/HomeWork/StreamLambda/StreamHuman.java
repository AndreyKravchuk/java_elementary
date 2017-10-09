package HomeWork.StreamLambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by andrey.kravchuk on 09.10.2017.
 */
public class StreamHuman {

    public static void main(String[] args) {

        Collection<Human> humans = Arrays.asList(
                new Human("Ann", "female", 23),
                new Human("Andrey", "male", 32),
                new Human("Tom", "male", 23),
                new Human("Katrin", "female", 35),
                new Human("Brain", "male", 72),
                new Human("Lucy", "female", 45),
                new Human("Jon", "male", 27),
                new Human("Harrison", "male", 13)
                );


        Collection<Human> newMilitaryMen =  humans.stream().filter(human -> ((human.getAge() > 16) && (human.getPerson() == "male"))).collect(Collectors.toList());
        newMilitaryMen.forEach((e) -> System.out.println(e.getLastName()));



        float averageAge = (float) humans.stream().filter(human -> human.getPerson() == "female").mapToDouble(Human::getAge).average().getAsDouble();

        System.out.println(averageAge);



        Collection<Human> birthdays1990 = humans.stream().filter(human -> human.getAge() == 27).collect(Collectors.toList());

        birthdays1990.forEach((b) -> System.out.println(b.getLastName()));
