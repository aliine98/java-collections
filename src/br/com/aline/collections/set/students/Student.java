package br.com.aline.collections.set.students;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private long enrollmentNumber;
    private double gradeAverage;

    public Student(String name, long enrollmentNumber, double gradeAverage) {
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
        this.gradeAverage = gradeAverage;
    }

    public String getName() {
        return name;
    }

    public long getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrollmentNumber=" + enrollmentNumber +
                ", gradeAverage=" + gradeAverage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return enrollmentNumber == student.enrollmentNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollmentNumber);
    }

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.getName());
    }
}
