// METODOS
/*
    Enquanto as propriedades representam as caracteristicas de uma entidade, os métodos representam as ações
    que podem ser executadas.,

    Ao criar uma classe para representar um avião, podemos colocar propriedades e motodos.

    As propriedades (caracteristicas) de um avião podem ser:
    - cor
    - tipoDeMotor
    - quantidadePoltronas
    - dificuldadePilotagem
    etc..

    Os metodos, ou seja, as ações, podem ser
    - ligarMotor
    - ativarTremDePouso
    - recolherTremDePouso
    - buzinar
    - abrirPortas
    - fecharPortas
    etc..


    Dito isso, podemos entender que os metodos, são formas de se executar ações.
    E claro, eles possuem muitas utilidades, uma delas, é deixar um código claro e sem repetições.
*/


package javacore.A_orientacaoAObjetos.metodos;

// classe de dominio:
public class Aviao
{
    // propriedades
    public String cor;
    public double largura;
    public double altura;

    // métodos
    public void abrirPortas()
    {
        System.out.println("As portas foram abertas!");
    }

    public void fecharPortas()
    {
        System.out.println("As portas foram fechadas!");
    }

}

