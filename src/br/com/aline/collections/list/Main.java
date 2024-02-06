package br.com.aline.collections.list;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();
        lt.adicionarTarefa("Primeira tarefa");
        lt.adicionarTarefa("Segunda tarefa");
        lt.adicionarTarefa("Segunda tarefa");
        lt.adicionarTarefa("Terceira tarefa");
        System.out.println("Total de tarefas: " + lt.getTotalTarefas());
        lt.getDescricoesTarefas();
        lt.removerTarefa("Segunda tarefa");
        System.out.println("----Depois de remover----");
        System.out.println("Total de tarefas: " + lt.getTotalTarefas());
        lt.getDescricoesTarefas();

        System.out.println("\n ----------------------------------- \n");

        Cart cart = new Cart();
        cart.addItem("Notebook",6000.00,1);
        cart.addItem("Notebook",6000.00,1);
        cart.addItem("Fone de ouvido",20.00,2);
        cart.showItems();
        System.out.println("Preço total:" + cart.getTotalPrice());
        cart.removeItem("notebook");
        System.out.println("-----Depois de remover-----");
        cart.showItems();
        System.out.println("Preço total:" + cart.getTotalPrice());

        System.out.println("\n ----------------------------------- \n");

        BooksCatalog bc = new BooksCatalog();
        bc.addBook("Teste","Aline",2022);
        bc.addBook("Teste","Aline",2021);
        bc.addBook("Teste2","Aline",2024);
        bc.addBook("Teste","Aline2",2024);
        bc.addBook("Teste2","Aline2",2023);
        System.out.println(bc.searchByAuthor("aline"));
        System.out.println(bc.searchByTitle("teste1"));
        System.out.println(bc.searchByPubYear(2024));
        System.out.println(bc.searchByYearInterval(2021,2023));

        System.out.println("\n ----------------------------------- \n");

        NumberList nl = new NumberList();
        nl.addNumber(1);
        nl.addNumber(-1);
        nl.addNumber(2);
        nl.addNumber(3);
        nl.addNumber(4);
        nl.addNumber(5);
        nl.addNumber(6);
        nl.addNumber(7);
        nl.addNumber(8);
        nl.addNumber(9);
        nl.addNumber(10);
        System.out.println(nl.showNumbers());
        System.out.println(nl.findMax());
        System.out.println(nl.findMin());
        System.out.println(nl.sumList());

        System.out.println("\n ----------------------------------- \n");

        PeopleSort ps = new PeopleSort();
        ps.addPerson("Aline",25,1.57);
        ps.addPerson("Thiago",23,1.75);
        ps.addPerson("Heloisa",18,1.60);
        ps.addPerson("Lucas",24,1.80);
        System.out.println("Unsorted: " + ps.getPersonList());
        System.out.println("Sort by age: " + ps.sortByAge());
        System.out.println("Sort by height: " + ps.sortByHeight());

        System.out.println("\n ----------------------------------- \n");

        NumbersSort ns = new NumbersSort();
        ns.addNumber(3);
        ns.addNumber(1);
        ns.addNumber(4);
        ns.addNumber(2);
        ns.addNumber(5);
        System.out.println(ns.getIntegerList());
        System.out.println(ns.sortAscending());
        System.out.println(ns.sortDescending());
    }
}