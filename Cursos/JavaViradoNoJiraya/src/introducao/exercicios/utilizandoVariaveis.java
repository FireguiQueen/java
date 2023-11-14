/*
    Crie variáveis para os campos descritos abaixo que estão entre <>, e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço (<endereço> + <cep>), confirmo que recebi o salário de <salario> , na data <data>.
*/
package introducao.exercicios;

public class utilizandoVariaveis {
    public static void main(String[] args)
    {
        String name = "Flora";
        double salario = 5220.0;

        int cep = 23289320;
        String address = "Oswvaldo Weldir";
        String data = "12-03-2024";

        // printando
        System.out.println("Eu, " + name + ", morando no endereço " + (address +' '+cep) + ", confirmo que recebi o salário de " + salario + " na data de " + data);

        // outro jeito de printar (mais prático)
        System.out.format("Eu, %s, morando no endereço %s %d, confirmo que recebi o salário de %.2f, na data de %s", name, address, cep, salario, data);
        
    }
}
