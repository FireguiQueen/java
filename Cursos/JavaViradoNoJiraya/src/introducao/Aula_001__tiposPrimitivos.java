// TIPOS PRIMITIVOS E VARIÁVEIS
/*
    Tipos primitivos se referem a valores simples;
    Por exemplo, o número '900.104.101' é valor grande, mas ele é bem simples, pois são
    apenas números, não há nenhuma estrutura envolvida.

    Por agora, usaremos os tipos de dados primitivos em variáveis.
    Uma variável é um conceito que engloba: tipo do valor, identificador e valor.

    Quanto definimos uma variável, seu valor será jogado em nossa memória RAM,
    e para acessá-lo, usaremos o seu identificador.
    Quando criamos uma variável, estamos guardando o valor em memória para podermos acessá-lo futuramente.

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

        // Por convenção, os nomes das variáveis devem sempre começar com letra minúscula.
        // Caso seja um nome composto, as próximas palavras devem começar com letra maíscula.
        int saldoDaConta = 900;
        boolean estaChovendo = true;



        // DECLARAÇÃO DE VARIÁVEL X INICIALIZAÇÃO DE VARIÁVEL

        // DECLARANDO: definimos um espaço na memória que armazenará um valor numérico
        int saldo;

        // INICIALIZAR: atribuir (dar) um valor a variável declarada anteriormente
        saldo = 900;

        // Mas em muitos dos casos, fazemos isto ao mesmo tempo: declarar e inicializar:
        int contaBancaria = 900;


        
        // VARIÁVEIS RESUMO:
        /*
            Quando criamos uma variável, estamos criando um espaço na memória.
            Quando inicializamos uma variável, isto é, atribuimos um valor a ela,
            estamos alocando este valor para este espaço em memória.
            Este espaço em memória irá armazenar o valor que colocamos na variável


         */

    }
}
