// CASTING 
// O casting é uma transformação aplicada em valores numéricos para modificar seu tipo de dado.
// É o ato de forçarmos uma determinada variável ou valor a ser de um determinado tipo.

public class Aula_12{

    public static void main(String[] args)
    {
        // Na aula 06 vimos que um número inteiro divido por outro número inteiro sempre resulturá em um valor inteiro.
        /*
            Isto é, 50 dividido por 3 é '16.6666..', ou seja, um valor quebrado. 
            Porém, no java, se realizarmos este cálculo (50/3), teremos como resultaod, um valor totalmente inteiro.
        */
        System.out.println(50 / 3); 
        // output: 16. 

        // E como vimos na aula 06, para obtermos o resultado correto, ou seja, o valor '16.6666..', um dos
        // números inteiros deve ser um número de ponto flutuante, e podemos fazer isto através do 'casting'.
        
        // Basta escolher um tipo de dado e colocar em paretensis ao lado do número que você deseja converter
        System.out.println(50 / (float) 3);
        // output: 16.6666

        // Mas como nessa situação estamos trabalhando sem variáveis, podemos simplesmente colocar um .0 ao lado 
        // de um número inteiro. Isto não é casting, estamos apenas dividindo um valor inteiro por um valor de ponto flutuante.
        System.out.println(50 / 3.0);
        // output: 16.6666


        // Por última análise, podemos ver que casting fazendo efeito.
        // Uma variável do tipo inteiro, só aceita valores inteiros, do contrarário, teremos erro. 
        // Porém, como forçamos o valor '5.5' a ser inteiro, este valor perdeu seu número decimal, ficando apenas 5.
        int num = (int)5.5;
    }
}