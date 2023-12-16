package Javacore.A_orientacaoAObjetos.VariaveisDeReferencia;

public class Main {

    public static void main(String[] args) {
        // É crucial lembrar que variáveis que "armazenam objetos" na verdade guardam suas referências.


        // No exemplo abaixo, primeiro é criado um objeto: "new Estudante()"
        // Esse objeto recebe um endereço de memória, que é então atribuído à variável 'aluno'.
        Estudante aluno = new Estudante();

        // Agora, o valor da variável 'aluno' é, na verdade, um endereço de memória daquele objeto.
        System.out.println(aluno); // 5acf9800 (endereço onde o objeto criado está alocado)

        // Por consequência, se criarmos uma nova variável e atribuirmos a variável 'aluno':
        // Ambas as variáveis irão apontar para o mesmo objeto criado.
        Estudante mesmoAluno = aluno;
        System.out.println(mesmoAluno); // 5acf9800.


        // Se a gente atribuir a variável 'aluno' uma nova referência, a refereência antiga será perdida, e nunca mais seremos capazes de acessar o objeto criado.
        // Por consequência, este objeto perdido tende a ser excluido pela JVM para o programa utilizar menos recursos.
        aluno = new Estudante(); // agora a variável 'aluno' está armazenando outro endereço.
        System.out.println(aluno); // 4617c264
    }
}
