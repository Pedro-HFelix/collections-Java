package Stream.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // usar o suppler com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Hello world, be welcome";
        //uar o Supplier para obter uma lista com 5 saudações
//        List<String> listaSaudacao = Stream.generate(saudacao)
//                .limit(5)
//                // embaixo temos o jeito original porem menos pratico
//                // .collect(Collectors.toList());
//                .toList();
        //fazendo de uma forma em uma, classe anonima
//        List<String> listaSaudacao = Stream.generate(
//                        new Supplier<String>() {
//                            @Override
//                            public String get() {
//                                return "Hello world, be welcome";
//                            }
//                        }
//                )
//                .limit(5)
//                .toList();
        List<String> listaSaudacao = Stream.generate(
                ()-> "Hello world, be welcome"
        )
        .limit(5)
        .toList();
        //imprimindo as saudações gerada
        listaSaudacao.forEach(System.out::println);
    }
}
