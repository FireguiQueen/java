// VARIÁVEIS

public class Aula_04{
    
    public static void main(String[] args){
        
        // Esta é uma declaração (declaramos uma variável).
        // Para fazer uma declaração, especificamos o seu tipo de dado (int) e o seu nome (x).
        // Como é do tipo "int", a variável aceita somente números INTEIROS!
        int x;

        // Agora, podemos atribuir um valor inteiro a ela;
        // Esse processo é chamado de inicialização da variável e ocorre quando atribuímos um valor a ela.
        // Usamos o seu nome, um sinal de atribuição (=) e um valor.
        x = 50;


        // Mas também podemos fazer isto em uma única linha. Estamos declarando e inicializando ao mesmo tempo.
        // SINTAXE: tipo de dado - nomeDaVariavel - sinal de atribuição(=) - valor que desejamos (precisa estar de acordo com o tipo de dado)
        int y = 100; 


        // Usamos aspas duplas para imprimir STRINGS anteriormente.
        // Agora, queremos imprimir variáveis. As variáveis são nomes para valores, sejam eles primitivos ou não.
        // Portanto, colocamos as variáveis fora das aspas, já que as aspas são exclusivamente para strings.


        int zz = 50;
        // Por exemplo, se utilizássemos aspas na linha abaixo, o CARACTER 'z' seria impresso e não a variável.        
        System.out.println("z");
        // resposta (output): "z"

        // Sem aspas, estamos dizendo para printar a variável, ou seja, para o valor que ela aponta.
        System.out.println(z);
        // output: "50"

        /* Quando colocamos uma variável entre parênteses, estamos referindo-se ao valor que ela contém.
        No entanto, quando essa saída é exibida em nosso terminal, ela será tratada como uma string.
        Portanto, independentemente do tipo de valor que a variável contenha, o que veremos no terminal é uma 
        STRING. */


        // Para concatenar (juntar) os valores em Java, podemos usar o caractere '+'.
        // Então, por exemplo, para juntar o valor da nossa variável + uma string, é algo bem simples:
        System.out.println("José tem " + x + " anos");
        // resultado (output): "José tem 50 anos"
        
        /* observe que no resultado o valor de x (5) está entre aspas também, ou seja, podemos ver que de fato  
        tudo colocado ali terá um retorno sendo string. Mas é importante saber que a nossa variável X continua com seu tipo de dado, o integer (int). */

    }
}