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
        int totalAlunos = userInput.nextInt();

        String[] alunosNomes = new String[totalAlunos];
        Double[] alunosNotas = new Double[totalAlunos];

        for (int i = 0; i < totalAlunos; i++)
        {
            System.out.print("\nAluno " + (i+1) + ": ");
            alunosNomes[i] = userInput.next();
            
            System.out.print("Nota de " + alunosNomes[i] + ": ");
            alunosNotas[i] = userInput.nextDouble();
        }


        // Printa todos os alunos da sala e suas notas. 
        System.out.println("\nNomes \t Notas \t Aprovado");
        for (int i = 0; i < totalAlunos; i++)
        {
            String aprovado = alunosNotas[i] >= 50? " sim" : " não";
            System.out.println(alunosNomes[i] + "\t " + alunosNotas[i] + "\t" + aprovado);
        }

        // Printa a media da turma
        double media = 0; 
        for (int i = 0; i < totalAlunos; i++)
        {
            media += alunosNotas[i];
        }
        media /= totalAlunos;
        System.out.println("\nMedia da turma: " + media);
        
    }
}