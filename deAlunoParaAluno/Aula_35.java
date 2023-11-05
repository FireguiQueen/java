// REVISÃO: vetores

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

        System.out.print("Digite a quantidade de bimestres: ");
        short totalBimestres = userInput.nextShort();

        // array para armazenar todos os alunos
        String[] alunosNomes = new String[totalAlunos];

        // array para armazenar outros arrays. Os arrays secundários terão 4 elementos, e cada um representa uma nota de bimestre
        Double[][] alunosNotas = new Double[totalAlunos][4];


        // RECEBE NOME E NOTAS.
        for (int i = 0; i < totalAlunos; i++)
        {
            // usuario digita o nome do aluno.
            System.out.print("\nAluno " + (i+1) + ": ");
            alunosNomes[i] = userInput.next();
            
            // usuario informa a nota deste mesmo aluno em 4 bimestres.
            for (int j = 0; i < totalBimestres; i++)
            {
                System.out.print("Nota de " + alunosNomes[i] + "no " + (j+1) + "° bimestre: ");
                alunosNotas[i][j] = userInput.nextDouble();
            }
        }

        // PRINTA AS NOTAS
        

/*
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
*/       
    }
}