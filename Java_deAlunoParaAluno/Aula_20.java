// Operadores lógicos

/*
    &&: operador lógico "and". Ele requerer que duas ou mais expressões booleanas sejam TRUE.  
    ||: operador lógico "or". Ele quer que apenas UMA das expressões booleanas seja TRUE. 
*/

public class Aula_19{
    public static void main(String[] args){
        // Exemplo com && 
        int num01 = 50;
        int num02 = 20; 

        // "A variável num01 é maior do que 30  E (and)  a variável num02 é maior do que 10?"
        // Ou seja, para este bloco ser executado, deve haver dois "TRUE" para esta pergunta.
        // Então o 'num01' precisa ser maior do que 30 E o 'num02' precisa ser maior do que 10. 
        if (num01 > 30 && num02 > 10){
            System.out.println(" :) ");
        }


        // Exempo com || 
        int num03 = 20; 
        int num04 = 10; 

        // "A varipavel num03 é maior do que 5   OU (or)  a variável num04 é maior do que 100?"
        // Para este bloco ser executado, deve haver apenas um 'true' para esta pergunta.
        // A variável 'num04' não é maior do que 100, mas a variável 'num03' é maior do que 5.. 
        // Como o "||" exige que apenas uma expressão seja verdadeira, o bloco será executado. 
        if (num03 > 5  ||  num04 > 100){
            System.out.println(" :) ");
        }



        // Variáveis booleans e operadores DE COMPARAÇÃO;
        // Em teoria, variáveis booleanas só podem contem dois valores: TRUE ou FALSE.:
        // sintaxe correta.
        boolean y = true; 
        boolean z = false; 

        // Mas como os operadores de comparação comparam coisas, temos a capacidade de armazenar até mesmo
        // números nessas variáveis, já que, no fim das contas, os números juntamente a esses operadores, irão
        // resultar em true ou false.

        /*
            Por exemplo, o operador ">", ele compara se determinado valor é maior do que o outro. Se for maior
            ele retorna true, do contrário, retorna false.
            Também temos o operador ">=", onde ele compara se determinado valor é MAIOR ou IGUAL ao outro..
            >> Esses operadores sempre irão retornar TRUE ou FALSE. 
        */

        // retorna ERRO (estamos tentando armazenar um número numa variável booleana).
        // boolean x = 5;  

        // Não retorna erro. Pois agora a variável 'x' irá valer FALSE devido ao operador de comparação. 
        boolean x = 5 > 5; 
    }   
}