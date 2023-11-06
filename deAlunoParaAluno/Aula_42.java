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
    }    


}