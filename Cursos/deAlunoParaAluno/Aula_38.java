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
        // Tanto a base quanto a altura digitada pelo usuário ficaram salvas em variáveis diferentes.
        System.out.print("Digite a base do triângulo: "); 
        int base = input.nextInt();

        System.out.print("Digite a altura do triângulo: "); 
        int altura = input.nextInt();

        // Mas inda está faltando uma coisa: o nosso método responsável por realizar o cálculo. 
        // Então vamos invocar ele. Dentro dos seus parentesis, colocaremos algo chamado "argumentos".
        // quando invocamos o método, passaremos argumentos, que são os valores substituiram os parâmetros.
        System.out.println(areaTriangulo(base, altura)); 
    }

    // Dentro dos parentesis deste método, colocaremos nossos parâmetros.
    // Eles futuramente serão substituidos por valores, que serão os argumentos. 
    // Podemos pensar que os parâmetros são exatamente como variáveis vazias.
    public static int areaTriangulo(int b, int a)
    {
        // perceba que estamos utilizando nossos parâmetros aqui.
        // e esses parâmetros serão substituidos pelos argumentos. Isto deixa nosso código dinâmico.
        return (b * a) / 2;
    }
}