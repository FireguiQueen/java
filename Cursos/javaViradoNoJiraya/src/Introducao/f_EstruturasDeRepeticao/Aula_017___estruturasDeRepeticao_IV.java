// ESTRUTURAS DE REPETIÇÃO: BREAK
// --> EXERCÍCIO <--
package introducao.f_EstruturasDeRepeticao;

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

        System.out.println("--- separador ---");
        // OU


        double valorProduto = 10000;
        int totalParcelas = 10;

        for (int i = 1; i <= totalParcelas; i++)
        {
            double valorDaParcela = valorProduto / i;
            System.out.println("Parcela " + i + ": " + valorDaParcela);
        }

    }


}
