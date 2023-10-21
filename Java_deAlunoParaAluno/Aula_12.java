// CASTING 
// O casting é uma transformação aplicada em valores numéricos para modificar seu tipo de dado.

public class Aula_12{

    public static void main(String[] args)
    {
        // Na aula 06 vimos que um número inteiro divido por outro número inteiro sempre resulturá em um valor inteiro.
        /*
            Isto é, 50 dividido por 3 é '16.6666..', ou seja, um valor quebrado. 
            Porém, no java, se dividirmos normalmente, teremos um resultado inesperado 
        */
        System.out.println(50 / 3); 
        // output: 16. 

        // E como vimos na aula 06, para obtermos o resultado correto, ou seja, o valor '16.6666..', um dos
        // números inteiros precisa ser 
        
        int x = 10;
        double y = 10.5;

        System.out.print(10 + 10.5);
    }
}