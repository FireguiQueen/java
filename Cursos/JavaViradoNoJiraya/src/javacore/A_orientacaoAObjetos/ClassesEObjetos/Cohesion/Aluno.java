// COESÃO
/*
    Coesão, um princípio fundamental no design orientado a objetos, refere-se à organização e foco de uma classe, garantindo que ela tenha um propósito único e bem definido.
    Em termos simples, quanto mais focada uma classe, maior será a sua coesão.

    Considere criar duas classes: "Aluno" e "Professor". A classe "Aluno" terá propriedades como "nome", "idade", "id",
    "anoDeEscolaridade" e etc. A classe "professor" terá "nome", "idade", "id", "disciplina" e etc.

    Tecnicamente, é totalmente possível criar apenas uma única classe representando tanto o 'aluno' quanto o 'professor',
    No entanto, essa abordagem NÃO é coesa, pois mistura responsabilidades e torna o código menos claro.
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

// NO PACOTE "DOMINIOS" você pode encontrar dois pacotes: "coesao" e "nao_coesao", sinta-se livre para observar com mais clareza este conceito.