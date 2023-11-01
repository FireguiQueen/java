// Bubble sort
/*
    O que é?
    O bubble sort é um algoritimo para você organizar seu vetor numérico (byte, long, double..) tanto
    em forma decrescente, quanto na forma crescente. 

    Em java, e em outras diversas linguagens, já existem métodos prontos para ordernar
    seu array, porém, é um algorítimo importante de se conhecer.


    Qual a sua ideia?
    A ideia do bubble sort é bem simples. 
    Se o número a esquerda for MAIOR que o número a direita, eles trocaram de posição.
    Se o número a esquerda for MENOR que o número a direita, a posição será mantida. 
*/

public class Aula_33
{
    public static void main(String[] args)
    {
        // Definimos o array que desejamos organizar.
        // O array contém 6 elementos. Ou seja, vai do indice 0 a 5. 
        /*
            ->> Sendo:  
            indice[0] = primeiro elemento (5)
            indice[1] = primeiro elemento (3)
            indice[2] = primeiro elemento (1)
            indice[3] = primeiro elemento (4)
            indice[4] = primeiro elemento (6)
            indice[5] = primeiro elemento (2)
        */
        int[] numeros = {5, 3, 1, 4, 6, 2};

        // Aqui criamos nossa variável que será responsável por fazer a troca de posição entre os números
        int swap; 

        // Agora, vamos criar um laço de repetição.
        // Ele será útil para executar o algoritimo com base na quantidade de elementos que ele possui.
        for (int i = 0; i < numeros.length; i++)
        {

            // Agora, vamos criar outro laço de repetição.
            // Ele será responsável por se referir aos elementos de maneira individual.
            for (int j = 0; j < length; j++)
            {

                // responsável por verificar se o número a esquerda é maior que o número a direita.
                // caso seja, haverá uma instrução para os números trocarem de posição.
                if (numeros[j] > numeros[j + 1])
                {
                    swap = numeros[j];
                    numeros[j + 1] = swap; 
                }
            
            }
        }




    }
}
