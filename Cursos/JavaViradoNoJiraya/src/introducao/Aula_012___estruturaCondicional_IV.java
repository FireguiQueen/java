// ESTRUTURA CONDICIONAL: SWITCH CASE
/*
    O switch case é utilizado como se fosse um 'if/else..', porém, apenas para condições de igualdade.

    Ao lado da palavra-chave "switch", colocaremos parênteses, e dentro deles, colocaremos algum valor, sendo ele:
    byte, short, int, long, char ou String (vemos que não é aceito valores booleanos)

    Dentro da estrutura, usaremos a palavra-chave "case".
    Caso haja correspondência entre algum CASE em relação ao valor que foi passado para o switch, as instruções
    associadas a esse caso serão executadas.
*/
package introducao;

public class Aula_012___estruturaCondicional_IV {
    public static void main(String[] args) {

        // Aqui definimos o valor que será usado pelos "cases"
        switch ("João") {
            // caso este "case" tenha o mesmo valor colocado lá em cima, essas instruções serão executadas
            case "Maria":
                System.out.println("Seu apelido pode ser 'Ma' ");
                break;

            case "João":
                System.out.println("Seu apelido pode ser Jojo");
                break;
        }

        // POR QUE USAMOS O BREAK?
        /*
            O "break" significa "quebrar", "interromper". Isto é, se não colocássemos ele nas instruções dos nossos "cases",
            as próximas instruções, de outros cases, seriam executadas também. O "break" define
            que não haverá mais instruções para aquele caso.
        */
        // EXEMPLO
        switch ("Julia") {
            case "Maria":
                System.out.println("Seu apelido pode ser 'Ma' ");

            case "João":
                System.out.println("Seu apelido pode ser Jo");

            case "Julia":
                System.out.println("Seu apelido pode ser Ju");

            case "Roberta":
                System.out.println("Seu apelido pode ser Betinha");
        }
        // OUTPUT:
        // "Seu apelido pode ser Ju"
        // "Sey apelido pode ser Betinha"

        // A primeira string faz total sentido ser printada, pois o caso "Julia" correspondeu com o valor do switch "Julia".
        // Mas a segunda não faz. O problema é que, como não foi colocado o "break" no 'case "Julia": ..',
        // os próximos casos são considerados instruções do 'case julia'.


        // ** ***** ** ***** ** ***** ** ***** ** ***** ** ***** ** ***** ** *****


        // Mas e se nenhum caso corresponder ao valor do switch?
        // Neste caso, temos o 'default' que se equivale ao "else".

        int num = 3;
        switch(num) {
            case 1:
                System.out.println(" =) ");
                break;

            case 2:
                System.out.println(" (= ");
                break;

            default:
                System.out.println("Nenhum caso anterior correspondeu ao valor do switch (num) =( ");
        }
        // output: "Nenhum caso anterior correspondeu ao valor do switch (num) =( "
    }
}
