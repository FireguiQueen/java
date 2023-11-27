package test;

public class Main
{
    public static void main(String[] args)
    {
        Estudante[] listaDeAlunos = new Estudante[3];


        for (int i = 0; i < 3; i++)
        {
            listaDeAlunos[i] = new Estudante();
        }

        listaDeAlunos[0].idade = 30;
        listaDeAlunos[1].idade = 50;
        listaDeAlunos[2].idade = 60;
        System.out.println(listaDeAlunos[0].idade);
        System.out.println(listaDeAlunos[1].idade);
        System.out.println(listaDeAlunos[2].idade);
    }
}
