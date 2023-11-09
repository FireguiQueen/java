// SYNTATIC SUGAR
/*
    Wikipedia:
    O 'açúcar sintático' é uma sintaxe dentro da linguagem de programação que tem
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

        // Reatribuindo os valores com a sintaxe padrão
        // -->> Vamos dizer que a variável 'x' recebe ela mesma mais +10.
        // > em outras palavras: x = 5 + 10;
        x = x + 10; 

        // Mas há um jeito mais prático, mais "doce", nos possibilitando de simplificar a sintaxe.
        // Isto significa "Atribua +10 ao valor atual de X".
        x += 10; 

        // Outro exemplo:
        int y = 100;
        y += 50;
        // output: 150.
        // Neste exemplo acima, seria a mesma coisa do que fazer "y = y + 50".


        // PODEMOS TAMBÉM UTILIZAR OUTROS OPERADORES:

        /* Multiplicação */  
        int z = 10;
        z *= 2; // z = z * 2

        /* Divisão */
        int k = 100;
        k /= 2; // k = k / 2

        // Há também os operadores de incremento e decremento.
        // Onde literalmente adicionam ou removem '1' do nosso valor.
        int j = 0;
        j--; // equivalente: j = j - 1
        // ouput: -1

        int n = 0;
        n++; // n = n + 1
        // output: 1
    }
}