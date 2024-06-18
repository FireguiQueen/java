public class CheckAge
{
    public static void main(String[] args)
    {
        short age = 50;

        // pergunta se o valor que a variável "age" aponta é maior que 17.
        // números maiores que 17 é: 18..
        if (age > 17)
        {
            System.out.println("Adulto.");
        } else
        {
            System.out.println("Não adulto.");
        }

        // também poderíamos usar MAIOR OU IGUAL.
        // aqui é perguntado se o valor que a variável "age" aponta é maior ou IGUAl a 18.
        if (age >= 18)
        {
            System.out.println("Adulto.");
        } else
        {
            System.out.println("Não adulto.");
        }
    }
}