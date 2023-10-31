// Vetores e Arrays: são a mesma coisa.
/*
    Os arrays (ou vetores) é utilizado para armazenar diversos valores de determinado
    tipo de dado. 

    O array é uma variável especial que pode armazenar um ou mais valores.
    Dentro do array, esses valores são conhecidos como "elementos" e eles 
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
        // são strings, logo, podemos criar uma lista capaz de armazenar nomes.

        /* 
            Para fazer isso é bem simples, primeiro vamos definir o tipo de dado que será armazenado
            em nosso array. 

            Bem, como estamos trabalhando com nomes, iremos usar o objeto "String", e ao seu lado, colocaremos
            colchetes duplos "[]" (são importantes pois definem que aquela variável será um array). 
            Após isso, daremos um nome a nossa variável especial, o array.
        */
        String[] alunos = {"João", "Maria", "José"};


        // Lembre-se da frase: 
        /*
            Dentro do array, esses valores são conhecidos como "elementos" e eles 
            terão seu próprio endereço para serem chamados. O endereço é conhecido como "índice".
        */  

        // Neste caso, os nossos elementos são: "João", "Maria" e "José". 
        
        // Para acessar o primeiro elemento do array (João), iremos utilizar os colchetes. 
        // Pois dentro deles, podemos colocar qual indice queremos acessar.

        // Mas o que é "índice"?
        /* 
            O indice é justamente o endereço do elemento. Por exemplo, o indíce 0 (zero) se refere ao primeiro
            elemento do array.

            O indice 1 (um) se refere ao segundo item do array
            O indice 2 (dois) se refere ao terceiro item do array..
        */

       // Então como acessamos um determinado elemento através do seu indice? 

       // O "João" é o primeiro elemento do array. O primeiro elemento é o indice 0. 
       // Então vamos fazer o seguinte:
       System.out.println(alunos[0]);

       // alunos -> se refere ao nosso array, nossa variável especial.
       // [0]    -> se refere ao indice 0. O indice 0 acessa o primeiro elemento do array. 


        // Por que motivo é utilizado o indice 0 e não indice 1 para se referir ao primeiro elemento?
        /*
            É uma dúvida bem comum, mas não se preocupe com isso agora. 
            Apenas saiba que, o indice 0 se refere ao primeiro elemento do array.
        */
    


    }
}