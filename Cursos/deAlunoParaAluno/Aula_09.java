// EXERCÍCIO DE MATEMÁTICA

public class Aula_09
{
    public static void main(String[] args)
    {
        double base = 50;
        double altura = 120;
        double trianguleArea = (base * altura) / 2;

        System.out.println("A área do triângulo de base " + base + ", e de altura " + high + " é igual a " + trianguleArea);
        // output: 3000.0 

        
        // A "ordem de operações" refere-se à convenção que indica a ordem pela qual devem ser realizadas as 
        // operações numa expressão. - Wikipedia 

        // Então por exemplo, na matemática, se tivermos a seguinte expressão: 
        // >>> 10 + 10 *2;
        // Será feito primeiramente: 10 * 2 e depois será somado +10.
        // O resultado então será '30'.
        
        // No java não é diferente, ele funciona da mesma maneira, e assim como na matemática, podemos colocar
        // os parentensis para sinalizar que determinada parte deve ser calculada primeiro. 
        
        int calc1 = 20 + 20 * 2; 
        // ouput: 60; 

        // Agora, primeiro é realizado a soma entre os "vintes" e depois é multiplicado.
        int calc2 = (20 + 20) * 2;
        // output: 80;
    }
}