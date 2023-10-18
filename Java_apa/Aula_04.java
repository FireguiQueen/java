// VARIÁVEIS

public class Aula_04{
    
    public static void main(String[] args){
        
        // Fizemos apenas uma declaração. Como é do tipo "int", a variável aceita somente números INTEIROS!! 
        // sintaxe: tipo de dado - nomeDaVariavel 
        int x; 

        // Agora, podemos atruibuir um valor a ela;
        // sintaxe: nomeDaVariavel - sinal de atribuição(=) - valor que desejamos (precisa estar de acordo com o tipo de dado)
        x = 50;

        // Mas também podemos fazer isto em uma única linha: 
        // sintaxe: tipo de dado - nomeDaVariavel - sinal de atribuição(=) - valor que desejamos (precisa estar de acordo com o tipo de dado)
        int y = 100; 


        
        // Anteriomente usamos aspas duplas pois queriamos printar STRINGS..
        // Mas agora, desejamos printar valores de variáveis, sendo assim, precisamos colocar fora das aspas.
        // Pois as aspas servem exclusivamente para strings.
        // Por exemplo, se utilizassemos aspas na linha abaixo, o CARACTER 'x' que seria printado, e não a variável.
        System.out.println(x);


        // O valor que colocamos na linha 17 é uma variável, sendo assim, estamos apenas nos referindo ao valor dela.
        /* Porém, em nosso terminal, o será retornado mesmo é uma string. Então mesmo que você coloque um valor inteiro,
        um valor quebrado ou qualquer outro, o que será retornado no terminal será STRING.  */

        // Para concatenar os valores em Java (juntar valores) podemos usar o caracter '+'.
        // Então por exemplo, para juntar o valor da nossa variável + uma string é algo bem simples:
        System.out.println("José tem " + x + " anos");
        // resultado (output): "José tem 50 anos"
        /* observe que no resultado o valor de x (5) está entre aspas também, ou seja, podemos ver que de fato  
        tudo colocado ali terá um retorno sendo string. Mas é importante saber que a nossa variável X continua com seu tipo de dado, o integer (int). */

    }
}