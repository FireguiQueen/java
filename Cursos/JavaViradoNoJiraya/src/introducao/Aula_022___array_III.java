// ARRAY: iterando mais facilmente
/*
    Para iterar de uma maneira simplificada um array, podemos usar o conceito "for each".
    Teremos uma variável, e a cada ciclo, será atribuido um elemento do array para ela.
*/

package introducao;

public class Aula_022___array_III
{
    public static void main(String[] args)
    {
        int[] numerosInteiros = {100, 200, 300, 400};

        for (int num : numerosInteiros)
        {
            System.out.println(num);
        }

        // EXPLICANDO
        /*
            Na primeira vez:
            > 'num' recebe numerosInteiros[0]
            > System.out.println(num); // 100

            Na segunda vez:
            > 'num' recebe numerosInteiros[1]
            > System.out.println(num); // 200

            > 'num' recebe numerosInteiros[2]
            > System.out.println(num); // 300

            > 'num' recebe numerosInteiros[3]
            > System.out.println(num); // 400


            ** POR ISSO é importante definir corretamente o tipo da nossa variável do 'for each'.
            Se 'num' fosse do tipo 'boolean', estariamos tentando fazer:
            num = numerosInteiros[0] (num = 100);

            E valores booleanos não podem receber números.
        */

    }
}

