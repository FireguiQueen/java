// INPUTS (entradas de informação)
/*
   A entrada de informações é uma parte fundamental em muitos programas. Ela nos permite coletar dados
   fornecidos pelo usuário ou de outras fontes. Neste caso, usamos a classe "Scanner" para receber
   entradas de informações do usuário.
 */

// Precisamos importar a classe "Scanner" para utilizar ela (óbvio).
// É ela quem nos permite receber essas entradas de informação.
import java.util.Scanner;

public class Aula_11 {
    public static void main(String[] args)
    {

        // Essa linha certamente está um pouco confusa a você, mas ignore ela por enquanto. 
        // Apenas saiba que esta é uma forma herdar instruções de outro arquivo, e que irão trazer
        // novas funcionalidades ao nosso programa, como por exemplo, receber inputs via terminal.
        // As instruções herdados ficarão salvos na variável 'input'.
        Scanner input = new Scanner(System.in);

        // Na aula 09, calculamos a área de um triângulo com valores definidos no código.
        // Agora, vamos permitir que o usuário insira os valores.
        System.out.print("Digite o valor da base: ");
        double base = input.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double high = input.nextDouble();
 
        double trianguleArea = (base * high) / 2;
        System.out.println("A área do triângulo é de: " + trianguleArea);

        /*
            Quando temos uma variável que recebe um método:
            double base = input.nextDouble();

            A primeira coisa que ocorre é o método ser executado, e depois, o valor retornado
            por ele é salvo na nossa variável.
            -> Então, as ações ocorrem da direita para a esquerda.

            -> Primeiro o método é executado, e depois aparece um local no terminal para o usuário digitar informações.
            Essas informações são enviadas para o método e ele retorna um valor, que fica armazenado na variável.
        */
    }
}