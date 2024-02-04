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
    }
}