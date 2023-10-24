// STRINGS

import java.util.Scanner; 

public class Aula_17{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        // Define uma string. Não é um tipo de dado primitivo, é um objeto. 
        String nome = "Osvaldo";
        System.out.println(nome);
        // ouput: "Osvaldo"


        // Pegando uma entrada de informação. O usuário irá digitar seu nome no terminal. 
        System.out.print("Digite seu nome: ");
        String userName = input.next();

        // printa o nome do usuário 
        System.out.println("Olá, " + userName + "!");

    }
}