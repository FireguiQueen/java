// Tipos de dados 

class Aula_06{

    public static void main(String[] args){

        // Uma variável que recebe um número inteiro é utilizado o 'int' para ela:
        int y = 10; 

        // Para fazer um número quebrado precisamos definir que o seu tipo é double.
        double x = 10.5;


        // O double não é importante apenas para isso, pois nem sempre iremos trabalhar com números quebrados..
        // Mas não trabalhar com eles diretamente, não significa que não geraremos eles.

        // Por exemplo:
        // Observe que daqui pra baixo há somente números inteiros. 
        int numero_01 = 150;
        int numero_02 = 4; 

        // Mas e se realizarmos uma divisão entre eles? 
        System.out.println(numero_01 / numero_02); // 150 dividido por 4 = 37.5 
        // output: 37 

        // O nosso output foi 37 e não 37.5, ou seja, o nosso número quebrado foi totalmente ignorado. 

        // E caso não houvesse um número inteiro 
        System.out.println(4 / 150); // 4 dividido por 150 = 0,02 (ou seja, não há números inteiros)
        // o nosso output será 0.


    }
}