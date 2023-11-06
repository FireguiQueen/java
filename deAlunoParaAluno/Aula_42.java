// EXERCICIo: invertando um array de inteiros com um método.

public class Aula_42
{
    public static void main(String[] args)
    {
        // Definindo um array que será invertido.
        int[] numeros = {500, 400, 300, 200, 100};

        /*
            Passando nosso vetor para uma função que recebe um array como parâmetro e retorna este mesmo array, 
            só que invertido.
        */ 
        int[] arrayInvertido = inverterArray(numeros);

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(arrayInvertido[i]);
        }
    }

    public static int[] inverterArray(int[] vetor)
    {
        int comprimentoVetor = vetor.length;
        int[] vetorInvertido = new int[comprimentoVetor];

        for (int i = 0, j = comprimentoVetor - 1; i < comprimentoVetor; i++, j--)
        {
            vetorInvertido[i] = vetor[j];
        }
        return vetorInvertido;

        // ENTENDENDO O MÉTODO PASSO-A-PASSO
        /*
            - Começamos definindo uma variável que salva a quantidade de elementos do nosso array principal.
            - Em seguida, criamos um novo array vazio, que contém a mesma quantidade de elementos do array principal.
            
            - Criamos um 'for loop'.
                > Definimos duas variáveis: 
                    i = 0 (zero)
                    j = comprimento do array principal -1 (4)

            Porque fizemos o comprimento -1?
                Quando usamos o ".length" em um array, ele nos retorna a quantidade de elementos.
                Se o array possui 5 elementos, ele retorna 5. 
                Mas como trabalhamos com indices, 

    


        */
    }    


}