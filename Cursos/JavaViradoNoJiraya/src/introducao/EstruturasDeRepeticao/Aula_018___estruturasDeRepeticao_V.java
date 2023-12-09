// ESTRUTURAS DE REPETIÇÃO: CONTINUE
/*
    A palavra-chave 'continue' é utilizada para pular para a próxima iteração
    de um loop, ignorando as instruções restantes dentro do bloco do loop.

    Quando o 'continue' é encontrado, o loop não é encerrado; em vez disso,
    ele passa para a próxima iteração, ignorando as instruções subsequentes.

    Vamos analisar alguns exemplos para entender melhor como o 'continue' funciona.
*/

package introducao.EstruturasDeRepeticao;

public class Aula_018___estruturasDeRepeticao_V {
    public static void main(String[] args) {

        // Exemplo 1: Utilizando 'continue' para pular iterações em um intervalo específico.
        for (int i = 0; i < 10; i++) {
            if (i <= 5) {
                continue; // Pula para a próxima iteração se 'i' for menor ou igual a 5.
            }
            System.out.println("O valor de i é: " + i);
        }

        /*
            No exemplo acima, o 'for' é executado 10 vezes. Se 'i' for menor ou igual a 5,
            a instrução 'continue' faz com que o loop vá diretamente para a próxima iteração,
            ignorando o restante do bloco de código dentro do loop. A impressão só ocorre
            quando 'i' é maior que 5.
        */

        // Exemplo 2: Utilizando 'continue' para ignorar números ímpares.
        int range = 25;
        for (int i = 0; i <= range; i++) {
            if (i % 2 != 0) {
                continue; // Pula para a próxima iteração se 'i' for ímpar.
            }
            System.out.println("É par: " + i);
        }

        /*
            Neste exemplo, o 'continue' é usado para fazer o loop ignorar números pares.
            Se o resto da divisão de 'i' por 2 for igual a 0, indica que 'i' é par, e
            o 'continue' faz o loop pular para a próxima iteração sem imprimir números pares.
        */
    }
}
