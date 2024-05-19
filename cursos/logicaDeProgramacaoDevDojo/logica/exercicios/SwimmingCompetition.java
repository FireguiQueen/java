import java.util.Scanner;

public class SwimmingCompetition
{
    public static void main(String[] args)
    {
        // Cria um objeto a partir da classe Scanner.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        // Objetos instanciados da classe Scanner trazem diversos métodos/funções prontas
        // uma delas é para receber INPUTs do usuário e retornar. Este retorno pode ser salvo em uma variável.
        String name = input.next();

        System.out.println("Digite sua idade: ");
        short age = input.nextShort();

        String categoria = "";


        if (age < 10)
        {
            categoria = "infantil";
        } 
        else if (age >= 11 && age <= 15)
        {
            categoria = "juvenil";   
        }
        else if (age >= 16 && age <= 19)
        {
            categoria = "pre-adulto";   
        } else 
        {
            categoria = "adulto";   
        }

        System.out.print(name + ": participará da categoria " + categoria);   
        
        
    }
}
