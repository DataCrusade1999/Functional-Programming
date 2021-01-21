package TinyHelper;

import java.util.List;
import java.util.stream.Collectors;

public class Declarative {
    public static void main(String[] args) {
        
        List<Person> people = List.of(
            new Person("Ashutosh Pandey",Gender.MALE),
            new Person("Jasmine",Gender.FEMALE),
            new Person("Ashely",Gender.FEMALE)

        );

        //Declarative approach
        System.out.println("Declarative approach");
         List<Person> females2 = people.stream().
         filter(person -> Gender.FEMALE.equals(person.gender)).
         collect(Collectors.toList());


        females2.forEach(System.out::println);

        //Declarative approach
        System.out.println("Declarative approach");
        people.stream().
        filter(person -> Gender.FEMALE.equals(person.gender))
        .forEach(System.out::println);


    }

    static class Person{
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;

        }

        @Override
        public String toString() {
            
            return "Person{" +
            "name= '" + name + '\'' +
            ", gender=" + gender + 
            '}' + '\n';
        }
    }
    enum Gender {
        MALE,FEMALE
    }
}
