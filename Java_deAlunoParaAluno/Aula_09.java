// Matemática 

public class Aula_09
{

    public static void main(String[] args)
    {
        float base = 50; 
        float high = 120; 
        float trianguleArea = (base * high) / 2;

        System.out.println("A área do triângulo de base " + base + ", e de altura " + high + " é igual a " + trianguleArea);
        // output: 3000.0 

        
        // "ordem de operações" refere-se à convenção que indica a ordem pela qual devem ser realizadas as 
        // operações numa expressão.

        // Então por exemplo, na matemática, se tivermos a seguinte expressão: 
        int calculo = 10 + 10 *2;

        // será feito PRIMEIRO 10 VEZES dois e depois será somado o 10. 
        // No java não é diferente, ele funciona da mesma maneira, e assim como na matemática, podemos colocar
        // os parentensis para sinalizar que determinada parte deve ser calculada primeiro. 
        
        int calc1 = 20 + 20 * 2; 
        // ouput: 60; 

        // Agora, primeiro é realizado a soma entre os "vintes" e depois é multiplicado.
        int calc2 = (20 + 20) * 2;
        // output: 80;
    }
}