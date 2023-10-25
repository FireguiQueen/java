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


        
}