// VarArgs
/*
    Um método também pode receber um array através do parâmetro.
    E para isso, podemos fazer de duas formas.
*/
package javacore.A_orientacaoAObjetos.ClassesEObjetos.Varargs;

public class Main
{
    public static void main(String[] args)
    {
        // Este método espera receber um array de inteiros como argumento!
        int[] numeros = new int[]{50, 10, 49, 39};
        reciveList(numeros);

        // Este método NÃO espera receber um array como argumentos.
        // Passe os valores normalmente, e os separe por vírgula. No final, eles estarão dentro de um array.
        reciveList(5,4,3,2);
    }

    // Método que recebe um array da forma convencional
    public static void receberLista(int[] lista)
    {
        for (int num: lista)
        {
            System.out.println(num);
        }
    }

    // Este método irá receber diversos argumentos separados por vírgula, e depois, os agrupará criando um array.
    public static void reciveList(int... lista)
    {
        for (int numero: lista)
        {
            System.out.println(numero);
        }
    }


}
