// VARIÁVEIS
/*
    Uma variável é uma forma inteligente de armazenar valores na memória RAM.
    Quando inserimos um valor na memória, é útil ter uma maneira de nos referirmos a ele para uso posterior, e é para isso que servem as variáveis.

    Em relação às variáveis, existem algumas nomenclaturas, incluindo:

    DECLARAÇÃO:
        Uma declaração de variável é simplesmente informar que uma variável existe.
        Para declarar uma variável, especifique o seu tipo de dado e o identificador (nome da variável).
        Isso reserva um local na memória exclusivamente para ela. Ao declarar uma variável, você pode ou não atribuir um valor a ela.

    TIPO DE DADO DA VARIÁVEL:
        O tipo de dado de uma variável é especificado na declaração e é escolhido com base no tipo de valor que será armazenado nela. Por exemplo, se você deseja armazenar um número inteiro, você usará uma variável do tipo 'int'. Se for um número decimal, usará uma variável do tipo 'double'.

    INICIALIZAÇÃO:
        Inicializar uma variável envolve atribuir um valor a uma variável que está vazia. Em outras palavras, é dar um valor à variável pela primeira vez. Se uma variável já tem um valor definido e você atribui um novo valor a ela, isso é chamado de reatribuição de valor, ou seja, você está redefinindo seu valor.
*/

public class Aula_04 {

    public static void main(String[] args) {

        // Esta é uma declaração de variável e observe que ela não foi inicializada.
        // A declaração inclui o tipo de dado e o identificador. Neste caso, o tipo de dado é 'int', que significa que esta variável aceita apenas números inteiros.
        int x;

        // Aqui estamos inicializando a variável, ou seja, atribuindo um valor a ela pela primeira vez.
        x = 50;

        // Podemos declarar e inicializar uma variável em uma única linha.
        int y = 100;

        // Variáveis são nomes prórios para valores, sejam eles primitivos ou não.
        int z = 50;

        // Portanto, não as colocamos entre aspas.
        // Se usássemos aspas na linha abaixo, o caractere 'z' seria impresso em vez do valor da variável.
        System.out.println("z");
        // Saída (output): "z"

        // Quando não usamos aspas, estamos imprimindo o valor da variável.
        System.out.println(z);
        // Saída (output): "50"

        /* Quando colocamos uma variável entre parênteses, estamos nos referindo ao valor que ela contém.
        No entanto, quando essa saída é exibida no terminal, ela é tratada como uma string.
        Portanto, independentemente do tipo de valor que a variável contenha, o que veremos no terminal é uma
        STRING. */

        // Para concatenar (juntar) valores em Java, usamos o operador '+'. Por exemplo, para juntar o valor da variável + uma string:
        System.out.println("José tem " + x + " anos");
        // Saída (output): "José tem 50 anos"

        /* Observe que no resultado, o valor de x (50) está entre aspas também. Isso acontece porque tudo o que é impresso no terminal é tratado como uma string, mas a variável x mantém seu tipo de dado, que é inteiro (int). */
    }
}
