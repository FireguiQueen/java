// VARIÁVEIS II & Operações Básicas de Matemática

public class Aula_05 {
    public static void main(String[] args) {

        int x = 50;
        int y = 50;

        // Podemos atribuir uma variável a outra variável.
        // Neste caso, estamos dizendo "a variável 'total' RECEBE a soma das variáveis 'x' e 'y'."
        int total = x + y;

        System.out.println(total);
        // Saída (output): 100

        // Além da adição (+), existem outros operadores, como subtração (-), divisão (/) e multiplicação (*).
        int divisao = x / y;
        // Saída (output): 1

        int multiplicacao = x * y;
        // Saída (output): 2500

        // Como imprimir os valores de 'x' e 'y' separados por espaço, por exemplo, "50 50"?

        // NÃO FAÇA ISSO:
        System.out.println(x + y);
        // Saída (output): 100

        // Para fazer isso, é necessário concatenar uma string no meio.
        System.out.println(x + " " + y);
        // Saída (output): "50 50"

        // Mas por que precisamos fazer isso?
        /*
        Quando usamos System.out.println(x + y), estamos pedindo para juntar (somar) os valores das variáveis, resultando em 100 (50 + 50).
        Quando inserimos as aspas no meio (System.out.println(x + " " + y)), estamos informando que o valor de 'x' deve ser unido a uma string e, em seguida, o valor de 'y' será anexado a essa string. Portanto, na segunda abordagem, convertemos o valor de 'x' em uma string e depois acrescentamos o valor de 'y' a essa string.
        */
    }
}
