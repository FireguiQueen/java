package javacore.A_orientacaoAObjetos.exercicios;
import javacore.A_orientacaoAObjetos.exercicios.dominios.car;

public class carsObjects
{
    public static void main(String[] args)
    {
        car fiatUno = new car();

        fiatUno.nome = "Fiat uno";
        fiatUno.modelo = "way";
        fiatUno.ano = 2013;

        System.out.println("Nome: " + fiatUno.nome + "\nModelo: " + fiatUno.modelo + "\nAno: " + fiatUno.ano);
    }
}
