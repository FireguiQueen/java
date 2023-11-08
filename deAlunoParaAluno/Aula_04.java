// VARIÁVEIS
/*
    Uma variável é uma forma inteligente de se armazenar valores na memória RAM.
    Quando jogamos um valor para a memória, seria bom ter uma forma de se referir
    a ele, para podermos utilizá-lo posteriormente, e para isto servem as variáveis.

    Em relação as variáveis, temos algumas nomenclaturas, entre elas:

    DECLARAÇÃO:
        Uma declaração de variável nada mais é do que simplesmente dizer que uma variável existe.
        Para declarar uma, coloque seu tipo de dado e o identificador (nome da variável).
        Isto faz com que determinado local da memória seja guardado exclusivamente para ela.
        Ao declarar uma variável, podemos colocar ou não o seu valor.

    TIPO DE DADO DA VARIÁVEL:
        O tipo de dado da variável é colocado na declaração da variável. O tipo de dado é
        escolhido com base no que precisamos armazenar nela.
        Por exemplo, se precisarmos armazenar um número inteiro, utilizaremos
        uma variável do tipo 'int'.
        Se precisarmos armazenar um número decimal, utilizaremos uma variável do
        tipo 'double'.

    INICIALIZAÇÃO:
        Inicializar uma variável consiste em atribuir um valor a uma variável vazia.
        Ou seja, atribuir pela PRIMEIRA vez um valor à nossa variável.
        Caso a nossa variável já tenha um valor definido, e for adicionado
        um novo valor a ela, isto se chamará reatribuição de valor, ou seja, estamos redefinindo seu valor.
*/

public class Aula_04{
    
    public static void main(String[] args){
        
        // Esta é uma declaração, e observe que ela não foi inicializada.
        // Para fazer a declaração foi informado seu tipo de dado e identificador.
        // O seu tipo de dado é 'int', ou seja, esta variável aceita somente números INTEIROS!
        int x;
        
        // Aqui estamos inicializando ela. Ou seja, definindo um valor pela primeira vez a ela.
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