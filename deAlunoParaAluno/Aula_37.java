// MÉTODOS II 

/*
    Entendemos por cima o que são os métodos. 
    E vimos que eles são executados quando invocados (chamados) em nosso método principal.

    O que é o cabeçalho (header) de um método?
    O cabeçalho define como nosso método irá funcionar, qual será seu nome e etc.. 
    - Tipo de acesso (public or private)
    - Tipo de retorno (void, int, String)
    - Nome do método ('main' para o método principal e qualquer nome para nossos próprios métodos)

    Neste aula, vamos nos aprofundar sobre o tipo de retorno. 
    Podemos ver que na função principal, nós utilizamos o tipo 'void'. 
    "Void" siginifica vázio, ou seja, é um retorno vazio.
    
    Mas o que significa? Porque precisamos definir o tipo de retorno de nosso método? 

    Vamos por parte. Quando definimos um método do tipo 'void', estamos informando ao "java" que o papel 
    daquele método será apenas executar instruções. Logo, métodos do tipo 'void' não retornam nada, e nem podem. 
    E isto faz total sentido ao nosso método principal (main), ele executará instruções e ponto final. 

    Quando dizemos que determinado método é do tipo 'int' estamos dizendo que aquele método
    será capaz de retornar números inteiros. Isto é, após todas as instruções do método serem executadas,
    ele fará um retorno de um número inteiro. 

    Mas vamos para o código, para entender isto melhor.   
*/

import java.util.Scanner;

public class Aula_37
{
    public static void main(String[] args)
    {
        // invocando um método. Ele será responsável por APENAS executar INSTRUÇÕES. 
        /* 
            Assim que o "java" chegar na linha abaixo, ele irá pular lá pra linha 17, onde se encontra
            o nosso método "askQuestions", e assim, as linhas deste método serão executadas. 
        */
        askQuestions();

        // Este método é responsável por executar instruções, e no final, retornar um número. 
        // As instruções se resumem a pergunta ao usuário dois valores, x e y. 
        // E no final, ela vai retornar a soma de x e y. 

        // Podemos salvar este número em uma variável. Lembre-se, as ações ocorrem da direita para esquerda.
        // Então primeiro nossa função será executada, com instruções para receber inputs do usuário.
        // Na última instrução, ela vai retornar a soma entre esses dois números. 
        // Esta soma ficará salvar na variável abaixo.
        int total = somar();

        System.out.println(total);
        
    }

    public static int somar()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro X: ");
        int x = input.nextInt();
        
        System.out.print("Digite um número inteiro Y: ");
        int y = input.nextInt();

        // Return significa "retornar". Isto faz com que esta função "somar()" retorne um número.
        return x + y;
    }



    // quando o "java" vê este método no método principal, as instruções abaixo serão executadas. 
    public static void askQuestions()
    {
        System.out.println("Tudo bem?");
        System.out.println("Como você está?");
        System.out.println("Tem estudado muito?");
    }
}