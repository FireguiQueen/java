// ESTRUTURAS DE REPETIÇÃO: BREAK
/*
    A palavra-chave 'break' significa "encerrar", 'quebrar', "interromper".
    O 'break' é frequentemente utilizado em loops para interrompê-los. Em outras palavras,
    quando encontramos a instrução 'break' dentro de um loop, o ciclo é encerrado imediatamente.

    A utilidade do 'break' torna-se evidente ao combiná-lo com estruturas condicionais.
    Ao estabelecer uma condição específica, caso seja avaliada como verdadeira,
    a execução do 'break' ocorre, interrompendo as próximas iterações do loop.
*/
package introducao.f_EstruturasDeRepeticao;

public class Aula_016___estruturasDeRepeticao_III
{
    public static void main(String[] args)
    {

        // Aqui temos um loop que será executado 51 vezes (de 0 até 50).
        for (int i = 0; i <= 50; i++)
        {
            if (i > 25) // Se 'i' for maior que 25, o bloco 'if' será executado.
            {
                break; // caso esse 'break' seja executado, o loop é quebrado.
            }
            System.out.println("O valor de i é: " + i);
        }

        // EXPLICANDO
        /*
            No primeiro ciclo a variável 'i' será 0.
            Será verificado: 0 <= 50, o que é VERDADEIRO. O bloco 'for' será executado.
            --> Dentro deste bloco, temos um 'if', que pergunta se a variável i (0) é maior que 25.
            ----- Isto é falso, pois i (0) não é maior que 25.

            Isso continuará até 'i' valer 25.
            Será verificado se 25 <= 50, o que é VERDADEIRO.
            - O bloco 'for' será executado.
            --> Dentro deste bloco, temos um 'if' que pergunta se a variável i (25) é maior que 25.
            ----- Isso é falso, pois i (25) não é maior que 25.

            Agora, 'i' vale 26.
            Será verificado se 26 <= 50, o que é VERDADEIRO. O bloco 'for' será executado.
            --> Dentro deste bloco, temos um 'if' que pergunta se a variável i (26) é maior que 25.
            ----- Isso é VERDADEIRO, pois i (26) é maior que 25.
            ------ A instrução 'break' é executada, e o loop é finalizado.
        */
    }
}
