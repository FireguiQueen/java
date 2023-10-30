// Operadores lógicos

/*
    &&: operador lógico "and". Ele requerer que duas ou mais expressões booleanas sejam TRUE.  
    ||: operador lógico "or". Ele quer que APENAS UMA das expressões booleanas seja TRUE. 
*/

public class Aula_19{
    public static void main(String[] args){
        // EXEMPLOS COM: && 
        int num01 = 50;
        int num02 = 20; 

        // "variável num01 é maior do que 30   E (and)   variável num02 é maior do que 10?"
        // Ou seja, para este bloco ser executado, deve haver dois "TRUE" para esta pergunta.
        // Então o 'num01' precisa ser maior do que 30  E  o 'num02' precisa ser maior do que 10. 
        if (num01 > 30 && num02 > 10){
            System.out.println(" :) ");
        }

        // Este bloco será executado pois ambas as expressões são verdadeiras. 
        // dez é maior que 0   AND  trinta é maior que zero.
        if (10 > 0 && 30 > 0){
            System.out.println(" :) ");
        }

        // Este bloco não será executado pois apenas uma da expressão são verdadeiras.
        // Para que ele seja executado, ambas precisam ser verdades. 
        if (20 > 10 && 40 > 50){
            System.out.println(" :) ");
        }


        // EXEMPLOS COM: || 
        int num03 = 20; 
        int num04 = 10; 

        // "num03 é maior do que 5   || (or)  num04 é maior do que 100?"
        // Para este bloco ser executado, deve haver apenas um 'true' para esta pergunta.

        // A variável 'num04' não é maior do que 100, mas a variável 'num03' é maior do que 5.. 
        // Como o "||" exige que apenas uma expressão seja verdadeira, o bloco será executado. 
        if (num03 > 5  ||  num04 > 100){
            System.out.println(" :) ");
        }

        // Este bloco não será executado pois nenhuma única expressão é verdadeira. 
        if (0 > 5  ||  50 > 100){
            System.out.println(" :) ");
        }


        // Variáveis booleans e operadores DE COMPARAÇÃO;
        // Em teoria, variáveis booleanas só podem contem dois valores: TRUE ou FALSE.:
        boolean y = true; 
        boolean z = false; 

        // No entanto, como os operadores de comparação comparam valores, podemos utilizar números com essas variáveis.
        // Os números, quando combinados com esses operadores, irão resultar em 'true' ou 'false'.


        /*
            Por exemplo, o operador ">", compara se um valor é maior que o outro. Se for maior,
            ele retorna true; caso contrário, retorna false.
            Temos também o operador ">=", que compara se um valor é MAIOR ou IGUAL ao outro.
            >> Esses operadores sempre retornam TRUE ou FALSE. 
        */

       

        // retorna ERRO (estamos tentando armazenar um número numa variável booleana).
        // boolean x = 5;  

        // Não retorna erro. Pois agora a variável 'x' irá valer FALSE devido ao operador de comparação. 
        boolean x = 5 > 5; 
    }   
}