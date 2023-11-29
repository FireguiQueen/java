// COESÃO
/*
    Coesão, um princípio fundamental no design orientado a objetos, refere-se à organização e foco de uma classe, garantindo que ela tenha um propósito único e bem definido.

    Em termos simples, quanto mais focada uma classe, maior será a sua coesão.

    Considere as classes "Aluno" e "Professor". Idealmente, cada classe deve ser responsável apenas pela criação e manipulação de objetos relacionados ao seu respectivo papel.
    Tecnicamente, seria possível ter uma única classe abrangendo propriedades tanto de "Aluno" quanto de "Professor". No entanto, essa abordagem não é coesa, pois mistura responsabilidades e torna o código menos claro.
*/

package javacore.A_orientacaoAObjetos.ClassesEObjetos.Cohesion;

// Exemplo de algo NÃO-COESO
public class Aluno
{
    public String nome;
    public int idade;
    public String cor;

    // A não-coesão começa aqui, pois essas propriedades deveriam estar em OUTRA CLASSE (a classe "professor").
    public String nomeProfessor;
    public int idadeProfessor;
    public String corProfessor;

}
