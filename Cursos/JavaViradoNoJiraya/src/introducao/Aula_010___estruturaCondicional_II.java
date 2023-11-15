// ESTRUTURA CONDICIONAL: ELSE IF / ELSE
/*
    A palavra-chave 'if' define a primeira condição para a nossa estrutura como um todo.
    Mas e se a expressão do bloco 'if' for avaliada como 'false'? Precisamos colocar mais condinções.

    Por exemplo,
    SE - pessoa tem mais de 30 anos: "pode beber cerveja"
    SENÃO (se o if anterior for avaliada como false) - pessoa é meno
*/

package introducao;

public class Aula_010___estruturaCondicional_II
{
    public static void main(String[] args)
    {
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

        if(age <= 3) System.out.println("Você é um bebê");
    }
}
