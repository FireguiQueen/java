// ESTRUTURA CONDICIONAL: SWITCH CASE
/*
    O switch case é utilizado como se fosse um 'if/else..', porém, apenas para condições de igualdade.

    Ao lado da palavra-chave "switch", colocaremos parênteses, e dentro deles, colocaremos algum valor, sendo ele:
    byte, short, int, long, char ou String

    Dentro da estrutura, usaremos a palavra-chave "case".
    Casso haja correspondencia entre algum caso em relação ao valor que foi passado para o switch, as instruções
    associadas a esse caso serão executadas.
*/
package introducao;

public class Aula_012___estruturaCondicional_IV
{
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

    }
}
