package Stream.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    public static void main(String[] args) {
        //criear uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o consumer com expressão lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        //jeito inicial
//        numeros.stream().forEach(imprimirNumerosPares);

        //jeito redusido ams a mesma coisa
        numeros.forEach(imprimirNumerosPares);
        // caso não declare o consumer fora
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });
        // transformando em um lambda
        numeros.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
