// LOOP.. Laço de repetição.. Ciclo.. (é tudo a mesma coisa)

public class Aula_22 {
    public static void main(String[] args) {

        // While (enquanto)
        // Assim como o "if", o while também precisa de uma expressão booleana.
        /*
            Uma expressão booleana é responsável por retornar o valor 'true' ou 'false'.

            Enquanto a expressão for verdadeira, o loop irá continuar. Assim que ela for "false", o while
            não será mais executado.
        */

        // Geralmente, iremos trabalhar com variáveis, e elas terão seus valores alterados dentro do próprio bloco do while.
        // Neste caso, é perguntado: "A variável X (10) é maior do que 5? Sim? Execute o código".
        /*
            Observe que no próprio bloco do while temos um decremento da variável X, fazendo com que toda vez
            que o bloco seja executado, a variável X perca 1 do seu valor.
            Isso continua até chegar a um ponto onde o valor de 'X' valerá 5. E será perguntado:
            "A variável X (5) é maior do que 5?"..
            Como '5' não é maior que '5', obviamente será 'false', e o while irá parar.
         */

        int x = 10;
        while (x > 5) {
            System.out.println(x);
            x--;
        }

        /*
            A situação seria um pouco diferente se usassemso o operador '>='.
            Após algumas execuções do nosso bloco 'while', a variável Y valerá
            5 devido ao decremento ocorrido durantes as execuções.

            Será perguntado:
            "A variável Y (5) é MAIOR ou IGUAL a '5'?..
            Apesar de '5' NÃO ser maior que '5', '5' é IGUAL a '5', e isto faz com que
            seja retornado 'true', executando o nosso bloco 'while'.
        */
        int y = 10;
        while (x >= 5) {
            System.out.println(x);
            x--;
        }

    }
}
