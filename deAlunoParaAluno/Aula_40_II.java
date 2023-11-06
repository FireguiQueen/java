// MÉTODOS VI: parâmetros e vetores. Dados primitivos e não-primitivos. 

public class Aula_40_II
{
    public static void main(String[] args)
    {
        // Vamos começar definindo duas variáveis. 

        // Esta variável será do tipo 'int'. Um tipo de dado PRIMITIVO.
        int numero = 100; 

        // Esta variável será uma variável especial. Um array. 
        // Será um array de números inteiros. Um vetor é um tipo de dado NÃO-PRIMITIVO. 
        int[] numeros = {0, 10, 20};


        // 
    }

    // Vamos criar dois métodos do tipo void, pois não queremos retornar nada em ambos. 

    // Este será responsável por receber um número inteiro.
    public static void numeroInteiro(int x)
    {
        // Aqui, vamos dizer que o parâmetro 'num' será 500. 
        // Isto é, não importa qual valor que o 'num' recebeu dos argumentos. Agora 'num' vale 500.
        x = 500;
    }
}