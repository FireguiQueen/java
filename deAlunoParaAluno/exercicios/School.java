// Receber nomes de determinada turma;
// -> numeros de alunos da turma são baseados nos nomes informados pelo usuário

// Receber a quantiade de bimestres

// Deverá ser possivel definir a nota de cada aluno. 
// Deverá printar a média da turma
// Deverá dizer se y aluno passou ou reprovou.

import java.util.Scanner;

public class School{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int alunosTotal = userInput.nextInt();

        String[] alunosNomes = new String[alunosTotal];

        for (int i = 0; i < alunosTotal; i++)
        {
            System.out.print("Aluno " + i + ": ");
            alunosNomes[i] = userInput.next();
        }


        // Printa todos os alunos da sala. 
        System.out.println("Alunos: ");
        for (int i = 0; i < alunosTotal; i++)
        {
            System.out.print(alunosNomes[i] + "\t");
        }
    }
}