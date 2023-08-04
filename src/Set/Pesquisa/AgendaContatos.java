package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){ //o metodo startsWith ele procura se comeca com algum valor, nesse caso com nome
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        System.out.println("Exibir Contato");
        agendaContatos.exibirContatos();
        System.out.println("------------------------");
        System.out.println("Adicionar Contatos");
        agendaContatos.adicionarContato("Pedro",123456);
        agendaContatos.adicionarContato("Pedro",0);
        agendaContatos.adicionarContato("Pedro félix",1111);
        agendaContatos.adicionarContato("Pedro  DIO",674935);
        agendaContatos.adicionarContato("Leonardo Silva",1111);

        agendaContatos.exibirContatos();
        System.out.println("------------------------");
        System.out.println("Pesquisar Por nome");
        System.out.println(agendaContatos.pesquisarPorNome("Pedro"));
        System.out.println("------------------------");
        System.out.println("Atualizar Numero de Contato");
        agendaContatos.atualizarNumeroContato("Pedro", 30112005);
        agendaContatos.exibirContatos();
    }
}

