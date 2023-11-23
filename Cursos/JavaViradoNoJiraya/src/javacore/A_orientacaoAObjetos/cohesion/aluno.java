// COHESION
/*
    Cohesion ou "coesão", é um conceito intimamente associado a garantir que uma classe seja projetada com um propósito
    único e bem focado. No design orientado a objetos, coesão se refere a como uma única classe é projetada.

    Nota: Quanto mais focada for uma classe, maior será a coesão dela.

    Por exemplo, temos a classe "aluno", e ela será a responsável por criarmos objetos, e cada objeto será um aluno
    diferente.
    Mas também temos a classe "professor", e ela será a responsável por criarmos objetos, cada um representando
    um professor diferente.

    Tecnicamente é totalmente possivel criar apenas UMA ÚNICA classe contendo as propriedades da classe
    'aluno' e da 'professor', mas fazer isto, não é nem um pouco coeso.
*/

package javacore.A_orientacaoAObjetos.cohesion;

// Veja o exemplo de algo NÃO-COESO
public class aluno
{
    public String nome;
    public int idade;
    public String cor;

    // A não-coesão começa aqui, pois essas propriedades deveriam estar em OUTRA CLASSE (a classe "professor").
    public String nomeProfessor;
    public int idadeProfessor;
    public String corProfessor;

}
