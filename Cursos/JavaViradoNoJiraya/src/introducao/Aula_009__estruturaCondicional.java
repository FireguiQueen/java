// ESTRUTURA CONDICIONAL: if
/*
        O 'if' em português significa "se".
        Se o valor contido dentro dos parênteses for "true", execute o bloco.

        ->> sintaxe
        > if () {}
        - Dentro dos parênteses colocaremos um valor que deve ser boolean. Ou uma expressão, e ela deve retornar 'true' ou 'false'.
        - Dentro das chaves colocaremos as instruções que serão executadas caso a expressão dos parênteses seja avaliada como "true".
*/

package introducao;

public class Aula_009__estruturaCondicional
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


                // EXEMPLOS
                /*
                        Abaixo temos um sistema simples, onde ele determina o quão velho você é com as seguintes palavras:
                        - Bebê
                        - Criança
                        - Adolescente
                        - Adulto
                        - Velho
                */
                int age = 55;

                if(age >= 0 && age <= 13) System.out.println("Você é NOVO");

        }
}
