// TIPOS PRIMITIVOS E VARIÁVEIS
/*
    Tipos primitivos se referem a valores simples;
    Por exemplo, o número '900.104.101' é valor grande, mas ele é bem simples, pois são
    apenas números, não há nenhuma estrutura envolvida.

    Por agora, usaremos os tipos de dados primitivos em variáveis. Uma variável é um conceito que engloba:
    tipo do valor, identificador e valor.

    Quanto definimos uma variável, seu valor será jogado em nossa memória RAM,
    e para acessá-lo, usaremos o seu identificador.

    Os tipos primitivos em variáveis determinam qual tipo de dado ela irá armazenar.
    Os tipos primitivos são:

    byte    - para valores numéricos extremamente baixos
    short   - para valores numéricos baixos
    int     - para valores numéricos médios
    long    - para valores numéricos longos

    float   - para valores numéricos que possuem números quebrados
    double  - para valores numéricos que possuem muitos números quebrados

    char    - para caracteres
    boolean - para valores booleanos (true ou false)
 */

package introducao;

public class Aula_001__tiposPrimitivos {
    public static void main(String[] args) {

        // Criamos uma variável do tipo primitivo "int".
        // O tipo 'int' é capaz de armazenar, APROXIDAMENTE, valores entre -2.600.000.00 até +2.600.000.000
        int numero = 500;

        // Para ter acesso daquele valor, usaremos o identificador dele.
        System.out.println(numero);


        // Podemos criar variáveis de outros tipos também, com diferentes valores.
        char letra = 'a';
        System.out.println(letra);


    }
}
