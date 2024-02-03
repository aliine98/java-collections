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
    }
}