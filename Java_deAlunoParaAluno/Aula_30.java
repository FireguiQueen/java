// Vetores e Arrays: são a mesma coisa.
/*
    Os arrays (ou vetores) é um tipo de dado utilizado para armazenar diversos valores de determinado
    tipo de dado. 

    Os arrays são como listas. Então por exemplo, temos uma lista 'nome'.
    A lista 'nome' armazena nomes. 

    Podemos ter uma lista de números quebrados. E ela armazena apenas números inteiros ou quebrados.
    Ela pode ser útil para infinitas coisas. Um exemplo é: armazenar notas de diferentes alunos.
*/

public class Aula_30{
    public static void main(String[] args)
    {
        // Você é um professor, e na sua sala de aula, há 3 alunos. 
        /*
            - João
            - Maria
            - José

            Você deseja armazenar todos eles em seu programa. 
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
        // Então podemos criar uma lista "alunos", e salvar todos os alunos nela. 

        /* 
            Para fazer isso é bem simples, primeiro vamos definir o tipo de dado que será armazenado
            em nosso array. 

            Um "array" é uma variável especial capaz de armazenar mais de um valor.
            E esses valores terão seu próprio endereço para serem chamados.

            Bem, como estamos trabalhando com nomes, iremos usar o objeto "String", e ao seu lado, colocaremos
            colchetes duplos "[]". Após isso, daremos um nome a nossa variável especial.

        */
        String[] alunos = {"João", "Maria", "José"};

    }
}