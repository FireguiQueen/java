// OPERADOR CONDICONAL 

/*
    O operador condicional em muitas vezes pode substituir estruturas condicionais que possuem apenas
    um 'if - else'.

    Primeiro, vamos colocar uma expressão que será avaliada em 'TRUE' ou 'FALSE'.
    Após a expressão, colocaremos um ponto de interrogação.
    Ao lado dele, teremos o que será feito caso a expressão seja "TRUE".
    Após isso, teremos dois pontos (:), e outra parte, determinando o que será feito casa a expressão 
    seja "FALSE".
*/ 

public class Aula_28{
    public static void main(String[] args)
    {
        int x = 100;
        int y = 50;

        // é perguntado "x (100) é maior do que y (50)".
        // a expressão é avaliada como 'TRUE', então, a primeira parte é a executada.
        // Logo, nossa variável 'z', recebe o valor de 500
        int z = x > y? 500 : 250; 



    }
}