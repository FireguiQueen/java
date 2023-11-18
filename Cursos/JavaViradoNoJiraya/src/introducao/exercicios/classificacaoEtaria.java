/*
Classificação Etária:
    Crie um programa que pede a idade do usuário e determina a classificação etária: "Criança" (0-12 anos),
    "Adolescente" (13-17 anos) ou "Adulto" (18 anos ou mais).
*/

package introducao.exercicios;
import java.util.Scanner;

public class classificacaoEtaria
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int pessoaIdade = userInput.nextInt();
        String categoria = "";
        if (pessoaIdade <= 12)
        {
            categoria = "Criança";
        } else if (pessoaIdade >= 13 && pessoaIdade <= 17)
        {
            categoria = "Adolescente";
        } else{
            categoria = "Adulto";
        }

        System.out.println("Você é:" + categoria);


    }
}
