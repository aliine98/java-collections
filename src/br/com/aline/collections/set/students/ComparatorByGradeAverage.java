package br.com.aline.collections.set.students;

import java.util.Comparator;

public class ComparatorByGradeAverage implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGradeAverage(), s2.getGradeAverage());
    }
}
