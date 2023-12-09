// ATRIBUTOS STATIC
/*
    Quando uma variável é declarada como "static", ela se torna associada à classe em vez de pertencer
    a instâncias individuais da classe (objetos).

    Isso significa que, ao modificar o valor de uma variável estática, essa alteração será refletida
    em todos os objetos que foram instanciados a partir da mesma classe.

    Essa abordagem permite o acesso à variável (ou atributo) sem a necessidade de uma instância específica,
    utilizando apenas o nome da classe e o nome da variável. Por exemplo:
    >> Carro.qntCarrosCriados = 0;
*/
package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmPropriedades;

public class Carro
{
    private String nome;
    private int ano;

    // Variável estática para rastrear a quantidade total de carros criados.
    public static int qntCarrosCriados;

    // Construtor da classe Carro
    Carro(String nome, int ano)
    {
        // Sempre que um objeto é instanciado, incrementamos a variável estática
        qntCarrosCriados++;

        // Atribuição dos parâmetros ao objeto atual
        this.nome = nome;
        this.ano = ano;
    }
}
