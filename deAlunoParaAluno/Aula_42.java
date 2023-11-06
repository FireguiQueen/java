public class Aula_42
{
    public static void main(String[] args)
    {
        int[] numeros = {500, 400, 300, 200, 100};
        inverse(numeros);

        int arrayLength = numeros.length; 
        for (int i = 0; i < arrayLength; i++)
        {
            System.out.println(numeros[i]);
        }
    }

    // metodo - receber um vetor de um tipo de dado primitivo - retornar este array invertido
    public static void inverse(int[] x)
    {
        int arrayLength = x.length; 

        for (int i = 0; i < arrayLength; i++)
        {
            int swap;

            for (int j = 0; j < (arrayLength - 1); j++)
            {
                swap = x[j+1]; // 400 
                x[j+1] = x[j]; // indice 01 recebe 500;
                x[j] = swap; 
            }
        }


    }
}