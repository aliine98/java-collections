package br.com.aline.collections.set.students;

import java.util.*;

public class StudentList {
    Set<Student> studentSet = new LinkedHashSet<>();

//    adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
//    removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
//    exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
//    exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
//    exibirAlunos():

    public void addStudent(String name,long enrollmentNumber,double gradeAverage) {
        studentSet.add(new Student(name, enrollmentNumber, gradeAverage));
    }

    public void removeStudent(long enrollmentNumber) {
        if (!studentSet.isEmpty()) {
            Student student = null;
            for (Student s : studentSet) {
                if (s.getEnrollmentNumber() == enrollmentNumber) {
                    student = s;
                    break;
                }
            }
            studentSet.remove(student);
        }
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public List<Student> sortByName() {
        List<Student> studentsByName = new ArrayList<>(studentSet);
        Collections.sort(studentsByName);
        return studentsByName;
    }

    public List<Student> sortByGradeAverage() {
        List<Student> studentsByGradeAverage = new ArrayList<>(studentSet);
        studentsByGradeAverage.sort(new ComparatorByGradeAverage());
        return studentsByGradeAverage;
    }
}
