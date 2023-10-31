// Vetores e Arrays: são a mesma coisa.
/*
    Os arrays (ou vetores) é utilizado para armazenar diversos valores de determinado
    tipo de dado. 

    O array é uma variável especial que pode armazenar um ou mais valores.
    Dentro do array, esses valores são conhecidos como "elementos"  e eles 
    terão seu próprio endereço para serem chamados. O endereço é conhecido como "índice". 

    Podemos imaginar que os arrays são como listas. Temos uma lista de nomes, que o seu propósito é justamente
    armazenar um ou mais nomes. Nomes são strings (sequência de caracteres);
    -> Logo, precisamos ter um array de strings.  

    Podemos ter uma lista de números quebrados. E ela armazena apenas números inteiros ou quebrados.
    Ela pode ser útil para infinitas coisas. Um exemplo é: armazenar notas de diferentes alunos.
    
*/

public class Aula_30{
    public static void main(String[] args)
    {
        // EXEMPLO 01: Você é um professor, e na sua sala de aula, há 3 alunos. 
        // Você deseja armazenar todos eles em seu programa. 
        /*
            - João
            - Maria
            - José
        */ 
        // Você pode pensar: "Ok, basta criar três variáveis e salvar seus nomes."

        String aluno01 = "João";
        String aluno02 = "Maria";
        String aluno03 = "José";

        // Na prática, o problema foi resolvido. Então agora, nós podemos fazer outputs dizendo frases aos nossos alunos:
        System.out.println("Olá, " + aluno01); 
        System.out.println("Oi, " + aluno03);



        // Mas e se fossem 30 alunos? Você criaria 30 variáveis para cada nome? 
        // Você até pode, mas isso não é uma boa prática tendo em vista que temos os arrays a disposição.
        
        // Como foi dito anteriormente, os arrays são como listas. 
        // Então podemos criar uma lista que irá armazenar strings. E como já sabemos, os nomes
        // são strings, logo, podemos criar uma lista capaz de armazenar nomes de alunos.

        /* 
            Para fazer isso é bem simples, primeiro vamos definir o tipo de dado que será armazenado
            em nosso array. 


            Bem, como estamos trabalhando com nomes, iremos usar o objeto "String", e ao seu lado, colocaremos
            colchetes duplos "[]". Após isso, daremos um nome a nossa variável especial.

        */
        String[] alunos = {"João", "Maria", "José"};


        System.out.println(alunos[1]);

    }
}