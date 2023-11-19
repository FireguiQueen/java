// ESTRUTURAS DE REPETIÇÃO: BREAK
/*
    A palavra-chave 'break' significa "encerrar", 'quebrar', "interromper". O 'break' é muito utilizado em
    loops para quebrá-los, isto é, quando estamos em uma repetição, ao chegar na instrução 'break', o loop
    é encerrado.

    A utilidade chega quando usamos estruturas condicionais, colocando determinada condição, e caso ela seja true,
    o 'break' será executado, interrompendo as proximas repetições.
*/
package introducao;

public class Aula_016___estruturasDeRepeticao_III
{
    public static void main(String[] args)
    {

        // Aqui temos um loop que vai ser executado 51 vezes. (de 0 até 50)
        for (int i = 0; i <= 50; i++)
        {
            if (i > 25) // se 'i' for maior que 25 o bloco 'if' será executado.
            {
                break;
            }
            System.out.println("O valor de i é: " + i);
        }

        // EXPLICANDO
        /*
            No primeiro ciclo por exemplo, i será 0.
            Será perguntado: 0 <= 50? TRUE (pois 0 é menor que 50)
            O bloco 'for' será executado.
            --> Dentro deste bloco, temos um 'if', e ele pergunta se a variável i (0) é maior que 25
            ----- Isto é falso, pois i (0) não é maior que 25.

            E isso vai até 'i' valer 25.
            Será perguntado: 25 <= 50? TRUE (pois 25 é menor que 50)
            - O bloco 'for' será executado.
            --> Dentro deste bloco, temos um 'if', e ele pergunta se a variável i (25) é maior que 25
            ----- Isto é falso, pois i (25) não é maior que 25.

            Agora 'i' vale 26.
            Será perguntado: 26 <= 50? TRUE
            - O bloco 'for' será executado.
            --> Dentro deste bloco, temos um 'if', e ele pergunta se a variável i (26) é maior que 25
            ----- Isto é VERDADEIRO, pois i (26) é maior que 25.
            ------ A instrução 'break' é executada, e o loop é finalizado.
        */
    }


}
