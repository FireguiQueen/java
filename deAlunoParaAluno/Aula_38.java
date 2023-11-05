// MÉTODOS III: parâmetros e argumentos 
/*
    Os parâmetros são utilizados para que os nossos métodos sejam capazes de receber inputs de outros
    métodos.

    Ficou confuso? Irei explicar.
    Pois bem, o que é um intput? Um input é uma entrada de informação, ela pode ser um string, um número,
    um array e muitas outras coisas. 

    Vamos criar um método onde suas ÚNICAS instruções serão voltadas para realizar um cálculo da área 
    de um triângulo e retornar o resultado, nada além disso. 
    Certo, mas para realizar este cálculo, vamos precisar de duas informações: base e altura. 
    
    Mas eu acabei de dizer que a única coisa que o método irá fazer será o cálculo e o retorno do resultado.
    Da onde irá vir essas informações externas? Elas virão do método principal. 
    E para que isso ocorra, utilizaremos parâmetros.

    Podemos dizer que os parâmetros são variáveis do método, e elas foram apenas declaradas, mas não possuem
    valor.   
*/

import java.util.Scanner;

public class Aula_38
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Instruções reponsáveis por pegar a base e a altura do triângulo. Nada além disso.
        System.out.print("Digite a base do triângulo: "); 
        int base = input.nextInt();

        System.out.print("Digite a altura do triângulo: "); 
        int altura = input.nextInt();

        // Após essas intruções o usuário será capaz de digitar a base e a altura do triângulo e salvá-las na variável.
        // Mas inda está faltando uma coisa, o nosso método responsável por realizar o cálculo. 
        // Então vamos invocar ele. 
    }


    public static int areaTrinagulo(int b, int a)
    {
        
    }
}