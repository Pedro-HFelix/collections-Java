package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover =  new ArrayList<>();
        for (Tarefa t :tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void oberterDescricoesTarefas(){

        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Testanto o numero de tarefas(metodo adicionarTarefa e adicionarTarefa");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas() );
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas() );
        System.out.println("Fim do adicionarTarefa");
        System.out.println("--------------------------------");

        System.out.println("Teste do metodo removerTarefa");
        listaTarefa.removerTarefa("tarefa 2");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas() );
        System.out.println("Fim do removerTarefa");
        System.out.println("--------------------------------");

        System.out.println("Teste do metodo obeterDescricaotarefa");
        listaTarefa.oberterDescricoesTarefas();





    }
}
