// SYNTATIC SUGAR
/*
    wikipedia:
    um açúcar sintático é uma sintaxe dentro da linguagem de programação que tem
    por finalidade tornar suas construções mais fáceis de serem lidas e expressas.
    Ela faz com que o uso da linguagem se torne "mais doce" para o uso humano,
    permitindo que suas funcionalidades sejam expressas mais claramente,
    mais concisamente ou, ainda, como um estilo alternativo preferido por alguns.
*/

public class Aula_16{
    public static void main(String[] args)
    {
        // Definindo uma variável e um valor. 
        int x = 5; 

        // Reatribuindo os valores, vamos dizer que a variável X recebe ela mesma mais +10. 
        x = x + 10; 

        // Mas há um jeito mais prático, nos possibilitando de simplificar a sintaxe. 
        // Isto significa "Atribua +10 ao valor atual de X".
        x += 10; 


        // Outro exemplo:
        int y = 100; 
        y += 50;        // é a mesma coisa do que fazer "y = y + 50".
        // output: 150. 


        // PODEMOS TAMBÉM UTILIZAR OUTROS OPERADORES: 

        /* Multiplicação */  
        int z = 10; 
        z *= 2;         // z = z * 2
        // output: 20; 


        /* Divisão */
        int k = 100; 
        k /= 2;         // k = k / 2
        // output: 50; 


        // Há também os operadores de incremento e decremento, onde literalmente adicionam ou removem o valor inteiro de '1'.
        int j = 0;
        j--;            // j = j - 1
        // ouput: -1

        int n = 0; 
        n++;            // n = n + 1
        // output: 1



    }
}