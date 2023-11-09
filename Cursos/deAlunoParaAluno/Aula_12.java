// CASTING 
/*
    O casting é uma transformação aplicada em valores numéricos para modificar seu tipo de dado.
    É o ato de forçarmos uma determinada variável ou valor a ser de um determinado tipo.
 */

public class Aula_12{
    public static void main(String[] args)
    {
        // Na aula 06, vimos que a divisão de um número inteiro por outro número inteiro resulta em um valor inteiro.        /*
        /*
            Por exemplo, 50 dividido por 3 é igual a '16.6666...', um valor com casas decimais.
            No entanto, em Java, se realizarmos esse cálculo (50/3), o resultado será um valor inteiro,
            que não contém partes decimais.
        */
        System.out.println(50 / 3); 
        // output: 16. 

        // Como vimos na aula 06, para obter o resultado correto, ou seja, o valor '16.6666...', um dos
        // números deve ser um número de ponto flutuante, e podemos fazer isso usando o "casting".

        // Basta escolher um tipo de dado e colocá-lo entre parênteses ao lado do número que você deseja converter.
        System.out.println(50 / (float) 3);
        // output: 16.6666

        // Nessa situação, como estamos trabalhando com valores literais, podemos simplesmente colocar um ".0" ao lado
        // de um número inteiro. Isso não é casting, estamos apenas dividindo um valor inteiro por um valor de ponto flutuante.
        System.out.println(50 / 3.0);
        // output: 16.6666
        


        // Por última análise, podemos ver que casting fazendo efeito.
        // Uma variável do tipo inteiro, só aceita valores inteiros, do contrarário, teremos erro. 
        // Porém, como forçamos o valor '5.5' a ser inteiro, este valor perdeu seu número decimal, ficando apenas 5.
        int num = (int)5.5;
    }
}