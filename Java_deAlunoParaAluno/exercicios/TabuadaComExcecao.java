/*
    Peça ao usuário para inserir um número e, em seguida, mostre a tabuada desse número. 
    No entanto, se o usuário inserir o número 0, encerre o programa com break. 

    Esses exercícios envolvem o uso de break para controlar o fluxo do programa em situações específicas. 
    Eles também incorporam operadores lógicos para tomar decisões com base em condições específicas. 
*/ 

import java.util.Scanner;

public class TabuadaComExcecao{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);


        short numero;
        do {
            System.out.print("Digite um número: ");
            numero = userInput.nextShort();
            if (numero == 0){
                System.out.println("Você saiu do programa.");
                break;
            } 
                
            for (int i = 0; i <= 10; i++)
            {
                System.out.println(numero + " * " + i + " = " + numero * i);
            }
        } while (true);


    }
}