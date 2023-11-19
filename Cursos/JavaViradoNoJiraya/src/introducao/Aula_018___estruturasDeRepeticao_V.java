// ESTRUTURAS DE REPETIÇÃO: CONTINUE
/*
    "continua" significa "continuar.
    Quando é encontrado o 'break' o loop se encerra, não executa mais.
    Já o 'continue' fez com que o loop vá para a próxima iteração.
*/
package introducao;

public class Aula_018___estruturasDeRepeticao_V
{
    public static void main(String[] args) {

        // Irá ser executado 10 vezes.
        for (int i = 0; i < 10; i++)
        {

            // caso 'i' seja menor ou igual a 5, o for irá ir para o próximo ciclo de execução.
            if (i <= 5){
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }

        // EXPLICANDO
        /*
            Na primeira vez, o 'i' vale 0.
            Será perguntado: 0 < 10? (true).
            O bloco é executado.
            -> dentro do bloco há uma condição perguntando: i (0) <= 5? (true)
            ---> dentro deste bloco 'if', há uma instrução de 'continue', ou seja, o for será executado novamente.

            E este 'continue' só vai parar quando chegar no 6.
            -> dentro do bloco há uma condição perguntando: i (6) <= 5? (false)
            >> Como o 'continue' não foi executado, agora, as próximas instruções serão lidas. e o valor de 'i' será printado.
        */


    }
}
