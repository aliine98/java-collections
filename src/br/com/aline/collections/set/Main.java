package br.com.aline.collections.set;

import br.com.aline.collections.set.product_register.ProductRegister;
import br.com.aline.collections.set.students.StudentList;

public class Main {
    public static void main(String[] args) {
        GuestSet gs = new GuestSet();
        gs.addGuest("Aline",66385);
        gs.addGuest("Lucas",7869160);
        gs.addGuest("Raquel",162228);
        gs.addGuest("Gabriel",3815);
        System.out.println("Total guests: " + gs.countGuests());
        System.out.println(gs.getGuestSet());
        gs.removeByInviteCode(162228);
        System.out.println("Total guests: " + gs.countGuests());
        System.out.println(gs.getGuestSet());

        System.out.println("\n ----------------------------------- \n");

        UniqueWordCollection wc = new UniqueWordCollection();
        wc.addWord("Carnaval");
        wc.addWord("2024");
        wc.addWord("Aline");
        System.out.println("Tem a palavra 'carnaval'? " + wc.contains("carnaval"));
        System.out.println(wc.getUniqueWordsSet());
        wc.removeWord("aline");
        System.out.println(wc.getUniqueWordsSet());

        System.out.println("\n ----------------------------------- \n");

        ContactBook cb = new ContactBook();

        cb.addContact("Aline",999999999);
        cb.addContact("Aline 2",555555555);
        cb.addContact("Igor",888888888);
        cb.addContact("Thiago",777777777);
        cb.addContact("Thiago 2",666666666);
        System.out.println(cb.getContactSet());
        System.out.println("Há contato com nome 'aline'? " + cb.searchByName("aline"));
        System.out.println("Há contato com nome 'vitória'? " + cb.searchByName("vitória"));
        cb.removeContact("thiago 2");
        System.out.println("Depois de remover:");
        System.out.println(cb.getContactSet());
        cb.updateContactNumber("aline",444444444);
        System.out.println("Depois de mudar número");
        System.out.println(cb.getContactSet());

        System.out.println("\n ----------------------------------- \n");

        TaskList tl = new TaskList();
        tl.addTask("Tarefa 1");
        tl.addTask("Tarefa 2");
        tl.addTask("Tarefa 3");
        System.out.println("Task count: " + tl.getTaskCount());
        System.out.println("task set: " + tl.getTaskSet());
        System.out.println("Pending: " + tl.getPendingTasks());
        System.out.println("Finished: " + tl.getFinishedTasks());
        tl.markTaskAsCompleted("tarefa 1");
        tl.markTaskAsCompleted("tarefa 2");
        System.out.println("Finished: " + tl.getFinishedTasks());
        System.out.println("Pending: " + tl.getPendingTasks());
        tl.removeTask("tarefa 2");
        System.out.println("Task count: " + tl.getTaskCount());
        System.out.println("task set: " + tl.getTaskSet());
        tl.markTaskAsPending("tarefa 1");
        System.out.println("Finished: " + tl.getFinishedTasks());
        System.out.println("Pending: " + tl.getPendingTasks());
        tl.clearTaskList();
        System.out.println("Task count: " + tl.getTaskCount());
        System.out.println("task set: " + tl.getTaskSet());

        System.out.println("\n ----------------------------------- \n");

        ProductRegister pr = new ProductRegister();
        pr.addProduct("notebook",74557,6000.00,1);
        pr.addProduct("notebook",74557,6000.00,1);
        pr.addProduct("fone de ouvido",585266,35.00,2);
        pr.addProduct("celular",1190,1200.00,1);
        System.out.println(pr.getProductSet());
        System.out.println(pr.sortByName());
        System.out.println(pr.sortByPrice());

        System.out.println("\n ----------------------------------- \n");

        StudentList sl = new StudentList();
        sl.addStudent("lucas",6,9.5);
        sl.addStudent("carol",65,7.5);
        sl.addStudent("aline",60,8.5);
        System.out.println(sl.getStudentSet());
        System.out.println(sl.sortByName());
        System.out.println(sl.sortByGradeAverage());
        sl.removeStudent(65);
        System.out.println("Depois de remover: " + sl.getStudentSet());
    }
}
