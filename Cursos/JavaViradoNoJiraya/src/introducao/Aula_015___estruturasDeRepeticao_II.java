// ESTRUTURAS DE REPETIÇÃO
// -> EXERCÍCIO <-

package introducao;

public class Aula_015___estruturasDeRepeticao_II
{
    public static void main(String[] args)
    {
        // Imprima todos os números pares de 0 até 100
        int num = 100;

        for (int i = 0; i <= num; i+=2)
        {
            System.out.println(i);
        }

        // OU

        for (int i = 0; i <= num; i++)
        {
            System.out.println(i % 2 == 0? ("Par: " +i) : ("Impar: " + i));
        }

    }
}
