// CONSTRUTORES
/*
    O construtor é um método especial com a responsabilidade de criar e inicializar objetos.
    Ele é o primeiro "método" a ser executado quando criamos o nosso objeto. 

    Ele compartilha semelhanças com métodos, mas apresenta duas distinções essenciais:
       * O nome é idêntico ao nome da classe.
       * Ausência de um tipo de retorno explícito.

    Por padrão, caso não haja um construtor em sua classe, o construtor é gerado automaticamente durante a compilação.

    Com os construtores, podemos realizar a inicialização OBRIGATÓRIA das propriedades de um objeto.
    Em contraste aos métodos "setters", que são comumente utilizados para atribuir valores APÓS a criação do objeto,
    os construtores possibilitam que os valores sejam passados diretamente no momento da instância.

    Nesta classe, 'Estudante', o construtor dela é definido para aceitar dois parâmetros: nome e idade.
    Quando um objeto Estudante é criado, esses valores são fornecidos no ato da instanciação.
    Se esses argumentos não forem providenciados, a compilação resultará em erro, pois o construtor espera
    receber esses valores durante a criação do objeto.

    E através dos argumentos passados a esses parâmetros, podemos dar valor a nossas propriedades.

    Essa abordagem garante que os objetos da classe Estudante sejam sempre criados com valores para nome e idade,
    promovendo uma inicialização consistente.
*/

package javacore.A_orientacaoAObjetos.Constructor;

public class Estudante
{
    private String nome;
    private int idade;

    // Construtor. Ele exige dois argumentos (nome e idade) durante a criação do objeto
    Estudante(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
}
