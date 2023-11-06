// MÉTODOS VI: parâmetros e vetores. Dados primitivos e não-primitivos. 

public class Aula_41
{
    public static void main(String[] args)
    {
        // Vamos começar definindo duas variáveis. 

        // Esta variável será do tipo 'int'. Um tipo de dado PRIMITIVO.
        int numero = 100; 

        // Esta variável será uma variável especial. Será um array de números inteiros. 
        // Vetores são dados NÃO-PRIMITIVOS. 
        int[] numeros = {0, 10, 20};


        // A PARTIR DESTA LINHA, RECOMENDO QUE LEIA OS COMENTÁRIOS DOS MÉTODOS CRIADOS.

        // Agora, vamos invocar nossos métodos e passar as variáveis como argumento.

        // Este método recebe um número inteiro, ou seja, um dado primitivo.
        /* A questão é que, quando trabalhamos com dados primitivos, o que é passado é o valor 
        da nossa variável. Por exemplo, a variável 'numero' tem o valor de 100. 
        Como passamos ela como argumento, o que de fato está sendo colocado dentro desses paretensis é o valor
        100. */ 
        numeroInteiro(numero);


        // Este método recebe um vetor de inteiros, ou seja, um dado não-primitivo.
        /* Quando trabalhamos com dados não-primitivos, o que é passado é seu local na memória RAM.
        Quando criamos um vetor por exemplo ele fica salvo em algum lugar em nossa memória RAM, e por consequência
        ele possui um endereço. Vamos SUPOR que o endereço do nosso vetor 'numeros' seja '342592'.
        Então, o que de fato, foi passado como argumento, foi este valor: '342592'. */
        numerosInteiros(numeros);


        // MAS QUAL A UTILIDADE DE SABER ISSO? 
        /*
            O nosso método 'numeroInteiro()', ele contém instruções para dizer seu parâmetro, o 'x'
            terá um valor 500.
            Quando passamos a variável 'numero' como argumento, nos passamos o valor '100'.
            E dentro do método, este valor de '100' foi alterado para '500'.

            Mas no nosso método principal, a nossa variável continua tendo o mesmo valor de '100'.
            Pois o que foi passado, foi um valor final.
        */
        System.out.println(numero); // retorna 100. 

        /*
            As coisas mudam um pouco quando usamos os dados-não primitivos.
            O nosso método 'numerosInteiros' contém instruções para dizer que o primeiro elemento
            do array tenha um valor de 50. A questão, é que quando passamos o array como argumento
            para este método, nós não passamos o ARRAY EM SI, e sim SEU ENDEREÇO.

            Enquanto quando fazemos alterações, mesmo que utilizando um parâmetro, estamos trabalhando
            diretamente com aquele array. 
        */
        System.out.println(numeros); // retorna 50. 

    }


    // Vamos criar dois métodos do tipo void, pois não queremos retornar nada em ambos. 

    // Este será responsável por receber um número inteiro como argumento.
    public static void numeroInteiro(int x)
    {
        // Aqui, vamos dizer que o parâmetro 'x' será 500. 
        // Isto é, não importa qual valor que o 'x' recebeu dos argumentos, agora 'x' vale 500.
        x = 500;
    }


    // Este será responsável por receber um array de números inteiros como argumento.
    public static void numerosInteiros(int[] x)
    {
        x[0] = 50; 
    }
}