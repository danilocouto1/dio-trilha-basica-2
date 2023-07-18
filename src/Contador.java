import java.util.Scanner;

/**
 * Programa contador que recebe dois valores via terminal e a diferenca deles é a quantidade de vezes que for será feito, implentação de exception personalizada
 * 
 * Author: Danilo Couto
 */

public class Contador {
    public static void main(String[] args) throws Exception {
        //Implementando o scanner
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();

        
    }

    /**
     * Conta os números entre dois valores inteiros.
     * @param one o primeiro valor inteiro.
     * @param two o segundo valor inteiro.
     * @throws ParametrosInvalidosException se o valor de 'one' for maior do que 'two'.
     */
    static void contar(int one, int two) throws ParametrosInvalidosException {
        if (one > two) {
            throw new ParametrosInvalidosException();
        } else {
            int loop = two - one;
            for (int i = 0; i < loop; i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }
}
