package javacore.A_orientacaoAObjetos.exercicios.Carros;
import javacore.A_orientacaoAObjetos.exercicios.Carros.Domain.Car;

public class Main
{
    public static void main(String[] args)
    {
        Car fiatUno = new Car();
        Car bwm = new Car();

        fiatUno.nome = "Fiat uno";
        fiatUno.modelo = "way";
        fiatUno.ano = 2013;

        System.out.println("Nome: " + fiatUno.nome + "\nModelo: " + fiatUno.modelo + "\nAno: " + fiatUno.ano);


        bwm.nome = "BMW";
        bwm.modelo = " 320i M Sport";
        bwm.ano = 2023;
    }
}
