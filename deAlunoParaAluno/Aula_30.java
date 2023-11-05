// Arrays I: introdução
/*
    Os arrays (ou vetores) são variáveis especiais que podem aramazenar mais de um valor. 

    Dentro do array, esses valores são conhecidos como "elementos".
    Os elementos terão seus próprios endereços para serem chamados. O endereço é conhecido como "índice". 

    Podemos imaginar que os arrays são como listas. 
    Temos uma lista de nomes, que o seu propósito é justamente armazenar um ou mais nomes.
        -> Nomes são strings (sequência de caracteres);
        -> Logo, precisamos ter um array de strings.  

    Podemos ter uma lista de números inteiros. E ela armazena apenas números inteiros.
    Ela pode ser útil para infinitas coisas.
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
        /* 
            Para fazer isso é bem simples.
            Primeiro vamos definir o tipo de dado que será armazenado em nosso array. 

            Bem, como estamos trabalhando com nomes, iremos usar o objeto "String", e ao seu lado, colocaremos
            colchetes duplos "[]" (são importantes pois definem que aquela variável será um array). 
            Após isso, daremos um nome ao nosso array.
        */
        String[] alunos = {"João", "Maria", "José"};


        // Lembre-se da frase: 
        /*
            Dentro do array, esses valores são conhecidos como "elementos" e eles 
            terão seu próprio endereço para serem chamados. O endereço é conhecido como "índice".
        */  

        // Neste caso, os nossos elementos são: 
        // "João", "Maria" e "José". 
        

        // Para acessar o primeiro elemento do array, o "João", iremos utilizar os colchetes. 
        // Pois dentro deles, podemos colocar qual indice queremos acessar.

        // Mas o que é "índice"?
        /* 
            O indice é justamente o endereço do elemento. 
            Por exemplo, o indíce 0 (zero) se refere ao primeiro elemento do array.
            O indice 1 (um) se refere ao segundo item do array
            O indice 2 (dois) se refere ao terceiro item do array..
        */

       // Então como acessamos um determinado elemento através do seu indice? 

       // O "João" é o primeiro elemento do array. O primeiro elemento é o indice 0. 
       // -> Acessamos nossa variávei especial (o array alunos)
       // -> Colocamos colchetes e dentro deles especificamos qual indice queremos acessar.
       System.out.println(alunos[0]);

       // alunos -> se refere ao nosso array, nossa variável especial.
       // [0]    -> se refere ao indice 0. O indice 0 acessa o primeiro elemento do array. 


        // Por que motivo é utilizado o indice 0 e não indice 1 para se referir ao primeiro elemento?
        /*
            É uma dúvida bem comum, mas não se preocupe com isso agora. 
            Apenas saiba que, o indice 0 se refere ao primeiro elemento do array.
        */
    


        // Com as variáveis, podemos DECLARAR elas e posteriormente atribuir um valor a mesma.
        int x; 
        x = 50;

        // Também é possível fazer isto com arrays? SIM. Afinal, os arrays também são variáveis. 

        // Vamos declarar nosso array. Vamos colocar o seu tipo de dado, e os colchetes.
        // Mas este array irá receber uma instância do objeto String.
        
        String nomes[] = new String[3];

        // Por mais que tenha ficado confuso, apenas saiba que foi criado um array vazio.
        // ->> o '[3]' se refere a quantos elementos nosso array pode/irá armazenar. 
        // ->> Por consquência, nosso array não pode ultrapassar de 3 elementos.  

        // Aqui definimos que o indice 0 recebe a string "Jubileu"
        nomes[0] = "Jubileu";

        // Aqui definimos que o indice 1 recebe a string "Flora"
        nomes[1] = "Flora";

        // Por fim, aqui é definido que o indice 2 recebe a string "Joseph"
        nomes[2] = "Joseph"; 

        // TODOS OS 3 ELEMENTOS FORAM DEFINIDOS. 

        // Obviamente não podemos definir um valor ao indice 3, pois ele se refere ao quarto elemento.
        // E noso array armazena apenas 3 elementos.
    }
}