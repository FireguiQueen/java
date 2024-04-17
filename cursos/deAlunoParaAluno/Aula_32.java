// ARRAYS II: elementos não definidos & iteração 

public class Aula_32{
    public static void main(String[] args)
    {
        // Definimos uma variável que pode conter até 5 elementos.
        int[] x = new int[5];

        // Observe que ainda não definimos os elementos. 

        // E o que aconteceria se printarmos um elemento que não foi definido?
        System.out.println(x[0]); 

        // Mas o primeiro elemento não foi definido. 
        // Então, o output será: 0.

        // Quando não definimos o elemento, o valor, por padrão, será sempre 0. 
        // O output será 0 a tipos de dados números: byte, short, int, long, float, double.

        // Se definissemos um array de caracteres, sem definir seus elementos, o output seria o caracter nulo.
        char[] xt= new char[5];
        System.out.println(x[0]);  


        // *************************************************************8
        

        // ITERANDO (PERCORRENDO) UM ARRAY DE FORMA INTELIGENTE.
        /*
            Para iterar um array, usamos um laço de repetição. 
            E nossa condição sempre se baseia no numero de elementos do array
        */
        
        int[] numeros = {500, 250, 125}; // contem 3 elementos. Logo, contém 2 índices (0, 1 e 2)

        // enquanto a variável 'i' ser menor do que 3 (elementos), execute o bloco. 
        for (int i = 0; i < 3; i++)
        {
            System.out.println(numeros[i]);
        }


        // Mas e se criarmos um array com uma quantidade enorme de elementos? Teriamos que contar um por um?
        // Não. Podemos usar o '.length' para saber o comprimento deste array.

        int[] numeros01 = {242, 24121, 3467, 42, 22, -256, 234523, 23564, 63, 634, 89, 1, 6734, 25, 623};
        int comprimentoArray = numeros01.length; 
        
        for (int i = 0; i < comprimentoArray; i++)
        {
            System.out.println(numeros01[i]);
        }








    }
}


