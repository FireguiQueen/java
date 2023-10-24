// ATALHOS DE OPERADORES

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
        z *= 2;         // z = z * 2;
        // output: 20; 


        /* Divisão */
        int k = 100; 
        k /= 2;         // k = k / 2
        // output: 50; 



    }
}