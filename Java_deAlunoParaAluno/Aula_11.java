// Interação com o usuário: INPUTS 

// Precisamos importar a classe "Scanner" para utilizar ela (óbvio).
// É ela quem nos permite receber entradas de informação.  
import java.util.Scanner;

public class Aula_11 {
    public static void main(String[] args)
    {

        // Essa linha certamente está um pouco confusa a você, mas ignore ela por enquanto. 
        // Apenas entenda que esse é um jeito para você herdar comandos que irão trazer novas funcionalidades
        // ao nosso programa. Esses comandos ficarão salvos na variável 'input'.
        Scanner input = new Scanner(System.in);

        // Na aula 09, calculamos a área de um triângulo com valores definidos no código.
        // Agora, vamos permitir que o usuário insira os valores.
        System.out.print("Digite o valor da base: ");
        double base = input.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double high = input.nextDouble();
 
        double trianguleArea = (base * high) / 2;

        System.out.println("A área do triângulo é de: " + trianguleArea);


        /* Quando temos uma variável que recebe uma função, a primeira coisa que o ocorre é a função
        ser executada, e depois, o valor retornado por ela é salvo na nossa variável. 
        então as ações semprem ocorrem da direita para a esquerda. 
        
        > Primeiro a função é executada, e então aparece um lugar no terminal para o usuário digitar informações
        essas informações são enviadas para a função e ela faz um retorno. E este retorno fica salvo na variável. */
    }
}