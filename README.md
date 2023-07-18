# Contador

Um programa em Java que conta os números entre dois valores inteiros. Se o primeiro valor for maior que o segundo, uma exceção personalizada é lançada.

## Autor

Danilo Couto

## Contato

- Telefone: (73) 9 88513272
- LinkedIn: [https://www.linkedin.com/in/danilocoutopsantos/](https://www.linkedin.com/in/danilocoutopsantos/)

## Executando o programa

1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2. Compile o arquivo `Contador.java` utilizando o comando `javac Contador.java`.
3. Execute o programa com o comando `java Contador`.

## Utilização

1. O programa solicitará que você digite dois parâmetros numéricos.
2. Digite o primeiro parâmetro e pressione Enter.
3. Digite o segundo parâmetro e pressione Enter.
4. O programa exibirá os números entre os dois parâmetros digitados.
5. Se o primeiro parâmetro for maior que o segundo, será exibida uma mensagem de erro.

## Método `contar`

```java
/**
 * Conta os números entre dois valores inteiros.
 * 
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
```

O método `contar` recebe dois valores inteiros como parâmetros. Ele conta e imprime os números entre esses dois valores. Se o primeiro valor for maior que o segundo, uma exceção do tipo `ParametrosInvalidosException` é lançada.

---