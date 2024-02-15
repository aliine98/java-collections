package br.com.aline.collections.list.task_list;

import java.util.ArrayList;

public class ListaTarefas {
    private final ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
//    private ArrayList<String> listaDeDescricoes = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        this.listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        /*
        Não remove tarefas duplicadas, pois quando um item é removido, o que seria o próximo fica em seu lugar, mas
         o index já passou para o próximo, portanto um elemento nunca é lido quando um é removido, podendo assim
         não remover todas as duplicadas.

                for(int i = 0; i < this.listaDeTarefas.size(); i++) {
                    if (this.listaDeTarefas.get(i).getDescricao().equalsIgnoreCase(descricao)) {
                        this.listaDeTarefas.remove(listaDeTarefas.get(i));
        //                this.listaDeDescricoes.clear();
                    }
                }
        */

        ArrayList<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : this.listaDeTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        this.listaDeTarefas.removeAll(tarefasParaRemover);
    }

    /*
    Pode ser usada uma nova lista para armazenar as descrições e retorná-la ou printar as descrições diretamente no
     método.
        ArrayList<String> getListaDeDescricoes() {
            for(Tarefa tarefa : this.listaDeTarefas) {
                this.listaDeDescricoes.add(tarefa.getDescricao());
            }
            return this.listaDeDescricoes;
        }
    */

    public void getDescricoesTarefas() {
        for(Tarefa tarefa : this.listaDeTarefas) {
            System.out.println(tarefa.getDescricao());
        }
    }

    public int getTotalTarefas() {
        return this.listaDeTarefas.size();
    }
}
