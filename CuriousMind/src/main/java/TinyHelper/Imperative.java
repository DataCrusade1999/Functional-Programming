package TinyHelper;

import java.util.ArrayList;
import java.util.List;

public class Imperative {
    public static void main(String[] args) {
        
        List<Person> people = List.of(
            new Person("Ashutosh Pandey",Gender.MALE),
            new Person("Jasmine",Gender.FEMALE),
            new Person("Ashely",Gender.FEMALE)

        );

        //Imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);

        }
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
            '}';
        }
    }
    enum Gender {
        MALE,FEMALE
    }
}
