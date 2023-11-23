package javacore.A_orientacaoAObjetos.exercicios;
import javacore.A_orientacaoAObjetos.exercicios.dominios.Car;

public class carsObjects
{
    public static void main(String[] args)
    {
        Car fiatUno = new Car();
        Car bwm = new Car();

        fiatUno.nome = "Fiat uno";
        fiatUno.modelo = "way";
        fiatUno.ano = 2013;

        System.out.println("Nome: " + fiatUno.nome + "\nModelo: " + fiatUno.modelo + "\nAno: " + fiatUno.ano);



    }
}
