// MÉTODOS IV: parâmetros e vetores

public class Aula_40
{
    public static void main(String[] args)
    {
        int[] listaNumeros = {500, 200, 100};
        int numeroInteiro = 50;

        // Nosso array "listaNumeros" é passado como argumento para o parâmetro 'x'.
        // Agora, o parâmetro x no nosso método substituido pelo nosso array.
        receberArray(listaNumeros);

        
        // Nosso número inteiro é passado como argumento para o parâmetro 'x'.
        // Agora, o parâmetro x no nosso método é substituido pelo nosso número inteiro.
        receberUmInteiro(numeroInteiro);
    }


    // OBSERVE A DIFERENÇA NOS PARÂMETROS DOIS DOIS MÉTODOS ABAIXO:
    
    // Neste método é definido um parâmetro. Este parâmetro espera receber um ARRAY de inteiros.
    // Podemos ver isso pois foi colocado 'int[] x'. Os colchetes são usados para definir arrays, não se esqueça.
    public static void receberArray(int[] x)
    {
        System.out.println(x[0]);
    }

    // Neste método é definido um parâmetro. Este parâmetro espera receber um número inteiro.
    // Podemos ver isso pois foi colocado 'int x'. E é literalmente assim que definimos uma variável que recebe
    // números inteiros.  
    public static void receberUmInteiro(int x)
    {
        System.out.println(x);
    }
}