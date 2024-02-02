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
    }
}