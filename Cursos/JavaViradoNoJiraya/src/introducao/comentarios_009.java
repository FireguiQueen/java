// COMENTÁRIOS
/*
    Os comentários são textos que não fazem parte do programa em sí.
    Eles não interferem no funcionamento do mesmo.
    Quando o nosso arquivo '.java' passa pelo compilador, os comentários são removidos.
    Tanto é que, em arquivos '.class', não vemos os comentários feitos no arquivo '.java'.

    Comentar trechos de código pode ser necessário, mas em geral, a necessidade de comentar
    pode sugerir que o código pode ser mal elaborado. O ideal é ter um código autoexplicativo.
    Por isso, em muitos casos, fazer comentários NÃO é uma boa prática.

    Mas a situação muda um pouco a depender da situação.
    Por exemplo, para se fazer um comentário, temos três opções em java: linha, bloco & doc.

    Os comentários de linha e bloco tendem a ser evitados, pois, como mencionado,
    se precisar explicar pequenos trechos, talvez o código precise de melhorias.

    Mas o java doc possui uma extrema importância, pois ele é utilizado para comentar MÉTODOS e
    CLASSES. Isto é, quando você desenvolve uma classe, é importante dizer o que ela faz.
    A mesma coisa vale para métodos complexos, é importante dizer como ele funciona.
    Além disso, o javadoc aceita formatação HTML, tornando os comentários mais legíveis
    e compreensíveis.
*/

package introducao;

public class comentarios_009 {

    /**
        Isto é um comentário <b>em java doc</b>
     */
    public static void main(String[] args)
    {
        // Isto é um comentário de linha.

        /*
            Isto é um comentário de bloco.
            Tudo que está entre o: barra asterísco e asterísco barra;
            ficará em forma de comentário.
         */
    }
}
