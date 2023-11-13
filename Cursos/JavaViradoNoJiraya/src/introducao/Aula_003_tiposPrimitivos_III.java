// CASTING & valores tipos-primitivos e seus tipos
/*
    O casting é uma conversão forçada entre valores numéricos.
    Ou seja, temos um valor de um determinado tipo e, através do 'casting', forçamos
    a ser de outro tipo.

    Por exemplo, podemos forçar um valor quebrado, como '520.20', a ser um
    valor completamente inteiro: 520.
*/
package introducao;

public class Aula_003_tiposPrimitivos_III
{
    public static void main(String[] args)
    {
        // Definindo uma variável do tipo 'double'.
        double num = 500.20;

        // Em um contexto normal, uma variável do tipo 'int' JAMAIS aceitaria
        // um valor quebrado, mas através do 'casting', estamos transformando
        // aquele valor quebrado em um número inteiro.
        int numInteiro = (int) num;

        // Sem o casting, ocorreria erro:
        // >> int numInteiro = num;

        /* *  IMPORTANTE  * */
        // A coisa aqui ocorre da direita para a esquerda.
        // Primeiramente, o valor '500.20' é convertido para um número inteiro por meio do casting.
        // Assim, o valor resultante é armazenado na variável.


        // *** * * * * * * *** ** * * * * * * * ** * * * * * * *** * * * * * *

        // DOUBLE VS FLOAT
        /*
            O double e o float são semelhantes, mas a diferença está na quantidade de bytes utilizados para armazenar valores.
            Uma variável 'double' é capaz de armazenar números maiores.

            ->> Por exemplo, uma variável do tipo 'double' seria capaz de armazenar o seguinte valor:
            - 1000000000000000000000000000000000000000.0
            * Mas uma variável do tipo 'float' não seria capaz. Seria necessário diminuir aquele valor.
        */

        // Mas a questão principal é que, ao escrevermos nosso valor quebrado, ele sempre será considerado do tipo 'double'.
        // EXEMPLOS:

        // O valor contido entre parênteses é do tipo 'double'.
        System.out.println(500.0);

        // Aqui temos uma variável do tipo 'float' recebendo um valor quebrado:
        // >> float numQuebrado = 5.0;

        // O problema é que este '5.0' naturalmente é do tipo 'double'.
        // Então, o que estamos tentando fazer, é armazenar um valor do tipo 'double' numa variável 'float'.
        // E o Java retorna o erro: "possible lossy conversion from double to float".
        // O erro indica que pode haver perda na conversão de double para float.

        // A realidade é que o Java não sabe o valor que temos, ele apenas reconhece que é 'double'.
        // O double utiliza o dobro de bytes do 'float'. Portanto, estamos tentando armazenar muitos bytes onde não há espaço para eles.

        // Para definir um valor FLOAT é necessário utilizar 'F' no final do valor.
        float numQuebradoFloat = 5.0F;

        // **** * * ** *** * ***** * *** ******* * * ********* * * * *

        // INTEIROS: byte e int
        /*
            A mesma coisa vale para valores inteiros.
            Quando um número é digitado, e se ele for menor que 128, ele será considerado por padrão, do tipo byte.

            Caso o valor digitado seja 128 ou maior, ele será do tipo 'int'.
        */
        // EXEMPLO:
        // Dará erro pois o '5000000000000000' é consderado do tipo inteiro.
        // >> long numeroLongo = 5000000000000000;

        // Precisamos colocar o 'L' no final.
        long numeroLongo = 5000000000000000L;
    }
}
