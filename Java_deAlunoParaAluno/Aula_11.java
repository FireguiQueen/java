// Interação com o usuário: INPUTS 

// Precisamos importar a classe "Scanner" para utilizar ela
// É ela quem nos permite realizar entradas de informação.  
import java.util.Scanner;

public class Aula_11 {
    public static void main(String[] args)
    {

        // Essa linha certamente está um pouco confusa a você, mas ignore ela por enquanto. 
        // Apenas entenda que esse é um jeito para você herdar comandos que irão trazer novas funcionalidades
        // ao nosso programa.
        Scanner entradaDeInformacao = new Scanner(System.in);

        // Na aula 09 fizemos um programa que calcula a área de um triângulo. Mas todos os valores,
        // como o da base e altura, foram definidos por nós pelo próprio código.
        
        // Mas agora através dessa classe "Scanner", podemos receber valores do usuário via terminal. 
        System.out.print("Digite o valor da base: ");
        float base = entradaDeInformacao.nextFloat();

        System.out.print("Digite o valor da altura: ");
        float high = entradaDeInformacao.nextFloat();
 
        float trianguleArea = (base * high) / 2;

        System.out.println("A área do triângulo é de: " + trianguleArea);





        /* Vale lembrar que quando temos uma variável que recebe uma função por exemplo, primeiro é executado
        toda a função, e depois, o valor retornado por ela é salvo na nossa variável. 
        então as ações semprem ocrrem da direita para a esquerda. 
        Primeiro a função é executada, e então aparece um lugar no terminal para o usuário digitar informações
        essas informações são enviadas para a função e ela faz um retorno. E este retorno fica salvo na variável. */
    }
}