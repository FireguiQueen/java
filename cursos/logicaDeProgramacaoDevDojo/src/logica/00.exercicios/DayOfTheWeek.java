import java.util.Scanner;

public class DayOfTheWeek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Dia da semana: ");
        byte diaDaSemana = input.nextByte();
        String diaCorrespondente = null;

        if (diaDaSemana == 1)
        {
          diaCorrespondente = "Domingo";
        } else if (diaDaSemana == 2)
        {
            diaCorrespondente = "Segunda-feira";
        } else if (diaDaSemana == 3)
        {
            diaCorrespondente = "Terça-feira";
        } else if (diaDaSemana == 4)
        {
            diaCorrespondente = "Quarta-feira";
        } else if (diaDaSemana == 5)
        {
            diaCorrespondente = "Quinta-feira";
        } else if (diaDaSemana == 6)
        {
            diaCorrespondente = "Sexta-feira";
        } else if (diaDaSemana == 7)
        {
            diaCorrespondente = "Sábado";
        } else {
            diaCorrespondente = "Digite um dia válido! (1-7)";
        }

        System.out.println(diaCorrespondente);

    }
}