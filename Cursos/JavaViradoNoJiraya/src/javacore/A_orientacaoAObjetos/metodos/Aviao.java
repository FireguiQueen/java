// MÉTODOS
/*
    Enquanto as propriedades representam as características de uma entidade, os métodos representam as ações
    que podem ser executadas.

    Ao criar uma classe para representar um avião, podemos incluir propriedades e métodos.

    As propriedades (características) de um avião podem ser:
    - cor
    - tipoDeMotor
    - quantidadePoltronas
    - dificuldadePilotagem
    etc.

    Os métodos, ou seja, as ações, podem ser:
    - ligarMotor
    - ativarTremDePouso
    - recolherTremDePouso
    - buzinar
    - abrirPortas
    - fecharPortas
    etc.

    Um método nada mais é do que um agrupamento de instruções em um bloco, e caso queiramos executar essas instruções,
    basta invocar o método.
    Dito isso, podemos entender que os métodos são formas de executar ações.
    E claro, eles possuem muitas utilidades, uma delas é deixar um código claro e sem repetições.
*/

package javacore.A_orientacaoAObjetos.metodos;

// Classe de domínio:
public class Aviao {
    // Propriedades
    public String cor;
    public double largura;
    public double altura;

    // Métodos
    public void abrirPortas() {
        System.out.println("As portas foram abertas!");
    }

    public void fecharPortas() {
        System.out.println("As portas foram fechadas!");
    }
}