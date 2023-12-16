// ATRIBUTOS ESTÁTICOS (static)
/*
    Quando uma variável é declarada como "static", ela se torna associada à classe em vez de pertencer
    a instâncias individuais da classe (objetos).
    Ou seja, ele deixa de ser uma variável de instância e se torna uma variável de classe.

    Ao modificar o valor de uma variável estática 'y', essa alteração será refletida em todas as variáveis
    'y' dos objetos que foram instanciados a partir da mesma classe.

    Essa abordagem permite o acesso à variável (ou atributo) sem a necessidade de uma instância específica,
    utilizando apenas o nome da classe e o nome da variável.
    Por exemplo:
    >> Carro.qntCarrosCriados = 0;

    Se ela não fosse "static", seria necessário instânciar (criar) um objeto para utilizar a variável.
    >> Carro carro001 = new Carro();
    >> caroo001.qntCarrosCriados = 0;
*/
package Javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmPropriedades;

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
