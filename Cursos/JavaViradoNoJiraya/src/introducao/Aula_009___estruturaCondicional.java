// ESTRUTURA CONDICIONAL: if
/*
        O 'if' em português significa "se".
        Se o valor contido dentro dos parênteses for "true", execute o bloco.

        ->> sintaxe:
        > if () {}
        - Dentro dos parênteses colocaremos um valor que deve ser do tipo boolean.. Ou uma expressão, e ela deve retornar 'true' ou 'false'.
        - Dentro das chaves, colocaremos as instruções que serão executadas caso a expressão dos parênteses seja avaliada como "true".
*/

package introducao;

public class Aula_009___estruturaCondicional
{
        public static void main(String[] args)
        {
                // O bloco abaixo será executado pois o valor contido entre parênteses é "true".
                if (true)
                {
                        System.out.println("Olá!");
                }

                // O bloco abaixo será executado pois o valor contido entre parênteses do IF é "true".
                boolean isRaining = true;
                if (isRaining)
                {
                        System.out.println("Fique em casa. Está chovendo.");
                }

                // Quando o bloco 'if' carrega consigo apenas uma instrução, podemos remover as chaves.
                if (isRaining) System.out.println("Fique em casa. Está chovendo. ");



                // EXEMPLO COM UMA EXPRESSÃO

                // Aqui usamos o operador lógico AND (&&) ele requer que ambos os valores/expressões ao seu lado sejam "TRUE".
                if (true && true)
                {
                        System.out.println(" Este bloco será executado! ");
                }

                // Novamente, usamos o operador AND (&&), mas o bloco não será executado, pois um dois valores/expressões ao seu lado foi "FALSE".
                if (true && false)
                {
                        System.out.println("Este bloco não será executado! ");
                }


                // Aqui usamos o operador lógico OR (||) ele requer que apenas um dos valores/expressões ao seu lado seja "TRUE".
                if (true || false)
                {
                        System.out.println("Este bloco será executado! ");
                }

                // Este bloco não será executado, pois nem um valor/expressão ao lado do operador é considerado 'true'.
                if (false || false)
                {
                        System.out.println("Este bloco será executado! ");
                }


                // Outros exemplos:
                int age = 18;
                boolean ehMaiorDeIdade = age >= 18;
                if (ehMaiorDeIdade)
                {
                        System.out.println("Você pode comprar bebidas alcoólicas")
                }
        }
}
