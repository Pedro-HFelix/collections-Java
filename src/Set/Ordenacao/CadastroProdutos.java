package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, double preco, String nome, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // o treeset deixa organizado; em princial pelo metodo caomparable
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new CompararProdutoPorPrco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos.produtoSet);
        cadastroProdutos.adicionarProduto(1L, 15d,"Produto 5",5);
        cadastroProdutos.adicionarProduto(2L, 20d,"Produto 0",10);
        cadastroProdutos.adicionarProduto(1L, 10d,"Produto 3",2);
        cadastroProdutos.adicionarProduto(9L, 2d,"Produto 9",2);
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("Exibir produto por nome");
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println("Exibir produto por preço");
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
