// ESTRUTURAS DE REPETIÇÃO: BREAK
// --> EXERCÍCIO <--
package introducao;

public class Aula_017___estruturasDeRepeticao_IV
{
    public static void main(String[] args)
    {
        double valorDoProduto = 10000;

        for (int i = 1; i <= valorDoProduto; i++)
        {
            double valorParcela = valorDoProduto / i;
            if (valorParcela < 1000)
            {
                break;
            }
            System.out.println("Parcela " + i + ": " + valorParcela);

        }

    }


}
