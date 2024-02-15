package br.com.aline.collections.list.people_sort;

import java.util.Comparator;

public class ComparatorByHeight implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Double.compare(p1.getHeight(),p2.getHeight());

        /*
            implementação do compare e compareTo
                if(p1.getHeight() > p2.getHeight()) {
                    return 1;
                } else if (p1.getHeight() < p2.getHeight()) {
                    return -1;
                } else {
                    return 0;
                }
        */
    }
}