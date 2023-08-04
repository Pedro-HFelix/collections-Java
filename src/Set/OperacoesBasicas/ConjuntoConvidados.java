package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome,codigo));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Testando contarConvidados");
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() +" convidado(s) dentro do set de convidados");
        System.out.println("----------------------------");
        System.out.println("Testando adicionarConvidados");
        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4",1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() +" convidado(s) dentro do set de convidados");
        System.out.println("-------------------------------------------");
        System.out.println("Testando o exibir convidados");
        conjuntoConvidados.exibirConvidados();
        System.out.println("---------------------------");
        System.out.println("Testando removerConvidados");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("O número total de convidados é: " +conjuntoConvidados.contarConvidados() );
        conjuntoConvidados.exibirConvidados();
    }
}


