// ARRAY: iterando um array multidimensional mais facilmente
/*
    O conceito de "for each" que aprendemos na aula "array_III" também pode se aplicar
    para arrays multidimensionais.
*/
package introducao.g_Array;

public class Aula_024___array_V
{
    public static void main(String[] args)
    {
        int[][] lista = { {50, 20}, {10, 20} };

        // cada iteração deste 'for' a variável "mainArr" recebe um array.
        // como a variável "mainArr" irá receber um array de arrays, ela precisa conter os "[]"
        for (int mainArr[]: lista)
        {
            // cada iteração deste 'for' a variável "num" recebe um elemento do array contido na variável "mainArr"
            for (int num: mainArr){
                System.out.println(num);
            }
        }


        // EXPLICANDO
        /*
            No primeiro ciclo:
                mainArr[] = lista[0] // {50, 20}
                        num = mainArr[0]
                        num = mainArr[1]

            No segundo ciclo:
                mainArr[] = lista[1] // {10, 20}
                        num = mainArr[0]
                        num = mainArr[1]
        */
    }
}
