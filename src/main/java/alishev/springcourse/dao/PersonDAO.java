package alishev.springcourse.dao;

import alishev.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people = new ArrayList<>();;

    {
        people.add(new Person(++PEOPLE_COUNT, "Rick"));
        people.add(new Person(++PEOPLE_COUNT, "Ram"));
        people.add(new Person(++PEOPLE_COUNT, "Serg"));
        people.add(new Person(++PEOPLE_COUNT, "Rust"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
