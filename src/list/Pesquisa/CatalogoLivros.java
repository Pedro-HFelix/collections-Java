package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor,int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloDeAnos(int AnoInicial, int anoFinal){
        List<Livro> livroPorintervaloDeAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= AnoInicial && l.getAnoPublicacao() <= anoFinal ){
                    livroPorintervaloDeAnos.add(l);
                }
            }
        }
        return livroPorintervaloDeAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTiulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTiulo = l;
                    break;
                }
            }
        }
        return livroPorTiulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
        System.out.println("Pesquisando por autor");
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));

        System.out.println("------------------");

        System.out.println("Pesquisar por intervalo de ano");
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2020,2022));

        System.out.println("------------------");

        System.out.println("Pesquisar por Titulo");
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
    }
}
