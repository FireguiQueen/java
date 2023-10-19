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


        // Você pode pensar: "bem, a solução é bem simples :o, basta colocar o tipo de dado 'double' xD xD"
        // Por exemplo: 
        int num0 = 150;
        int num1 = 4;

        double divisaoFinal = num0 / num1; // 150 dividido por 4. Resultado esperado: 37.5  
        System.out.println(divisaoFinal);
        // ouput: 37 

        // Mas não, não é assim que o Java funciona. Como podemos ver, o output foi de 37, e não 37.5, mas por que?
        /*
            Um número inteiro dividido por outro número inteiro RESULTARÁ sempre em um número inteiro.
            INDEPENDENTE do tipo de dado que irá armazenar os valores. 

            Quando dizemos que uma variável do tipo 'double' irá armazenar a divisão de 150 por 4, estamos
            apenas dizendo ao Java que aquela variável irá SURPORTAR um valor quebrado. 
            Mas como o valor daquela variável foi um inteiro dividido por outro, o resultado é um inteiro.  


    }
}