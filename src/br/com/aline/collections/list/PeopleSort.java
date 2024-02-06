package br.com.aline.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleSort {
    private List<Person> personList = new ArrayList<>();

    void addPerson(String name, int age, double height) {
        this.personList.add(new Person(name,age,height));
    }

    List<Person> sortByAge() {
        List<Person> sortedList = new ArrayList<>(personList);
        Collections.sort(sortedList);
        return sortedList;
    }

    List<Person> sortByHeight() {
        List<Person> sortedList = new ArrayList<>(personList);
        sortedList.sort(new ComparatorByHeight());
        return sortedList;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
