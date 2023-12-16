package Javacore.A_orientacaoAObjetos.ArquiteturaDeSoftware.Cohesion.dominios.coesao;

// Classe coesa. Ela é bem específica
public class Professor
{
    // propriedades
    public String nome;
    public int idade;
    public int id;
    public String disciplina;


    // métodos para imprimir os dados.
    // podemos ser ainda mais coesos, e criar uma classe específica para imprimir dados dos objetos criados a partir desta classe.
    public void imprimirDados()
    {
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Disciplina:" + disciplina);
    }
}
