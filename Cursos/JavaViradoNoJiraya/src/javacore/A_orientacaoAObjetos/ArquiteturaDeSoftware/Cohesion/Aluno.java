// COESÃO
/*
    A coesão é um princípio fundamental no design orientado a objetos; ela se refere à organização e foco de uma classe,
    garantindo que ela tenha um propósito único e bem definido.
    Em termos simples, quanto mais específica uma classe, maior será a sua coesão.

    Crie classes de propósito único. Isto é, se você deseja criar uma classe responsável por instanciar objetos
    que representarão estudantes de uma faculdade, a única coisa que esta classe deve conter são as propriedades
    relacionadas aos alunos.

    ------------------------------------------------------------------

    Considere criar duas classes: "Aluno" e "Professor".
    A classe "Aluno" terá propriedades como "nome", "idade", "id", "anoDeEscolaridade" e etc.
    A classe "professor" terá "nome", "idade", "id", "disciplina" e etc.

    É totalmente possível criar apenas uma única classe representando tanto o 'aluno' quanto o 'professor'!
    No entanto, essa abordagem NÃO é coesa, pois mistura responsabilidades, o correto a se fazer é criar uma
    classe "Aluno" e uma classe "Professor".
*/

package javacore.A_orientacaoAObjetos.ArquiteturaDeSoftware.Cohesion;

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

// ** *** ** ** *** *** ** *** ** ** *** ***  ** *** ** ** *** ***
// NO PACOTE "DOMINIOS", você pode encontrar dois subpacotes: "coesao" e "nao_coesao".
// Sinta-se livre para observar com mais clareza este conceito.
// ** *** ** ** *** *** ** *** ** ** *** ***  ** *** ** ** *** ***

