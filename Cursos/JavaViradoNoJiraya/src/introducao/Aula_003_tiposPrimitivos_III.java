// CASTING  &  tipos-primitivos para decimais
/*
    O casting é uma conversão forçada entre valores numéricos.
    Isto é, temos um valor de determinado tipo e através do 'casting', forçamos ele
    a ser de outro tipo.

    Por exemplo, podemos forçar um valor quebrado, como por exemplo, '520.20' em um
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
        // um valor quebrado, mas através do casting, estamos transformando
        // aquele valor quebrado em um numero inteiro.
        int numInteiro = (int)num;


        // DOUBLE VS FLOAT
        /*
            O double e o float são a "mesma coisa", a diferença, é uma variável do tipo
            double utiliza mais bytes para armazenar valores.
            Isto é, ele é capaz de armazenar numeros decimais maiores.

            Por exemplo, uma variável do tipo double seria capaz de armazenar o seguinte valor:
            1.55505054050505054235053

            Mas uma variável do tipo 'float' não seria.
            A parte decimal precisaria ser menor.

            A questão é que, quando escrevemos o nosso valor quebrado, ele sempre
            será considerado do tipo 'double'.
        */
        // Por exemplo, aqui temos uma variável do tipo 'float' recebendo um valor quebrado:
        // >> float numQuebrado = 5.0;

        // O problema é que este '5.0' naturalmente é do tipo 'double'.
        // Então, o que estamos tentando fazer, é armazenar um tipo 'double' numa variável 'float'.

        // E o java retorna erro o seguinte erro: "possible lossy conversion from double to float".
        // O erro diz que possivelmente pode haver uma perda na hora de converter o double para float.

        // Pq a realidade é que o java não sabe qual o valor que temos, ele só sabe que aquele valor é 'double'.
        // E o double, como já sabemos, utiliza o dobro de bytes do 'float'.
        // Por consequência, estamos tentando armazenar muitos bytes onde não há espaço para tais.

        // Para definir um valor FLOAT é necessário utilizar o 'F' no final do valor.
        float numQuebradoFloat = 5.0F;
    }
}
