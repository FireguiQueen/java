/*
    Verificação de Números:
        Peça ao usuário para inserir dois números. Verifique se um é divisível pelo outro e exiba o resultado.
*/

package introducao.z_Exercicios;
import java.util.Scanner;

public class verificacaoNumeros
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double num0 = userInput.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double num1 = userInput.nextDouble();

        String isDivisible = (num0 % num1) == 0? "sim" : "não";

        System.out.println("X é divisivel por Y: " + isDivisible);



    }
}
