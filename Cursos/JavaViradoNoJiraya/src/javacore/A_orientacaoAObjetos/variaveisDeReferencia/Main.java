package javacore.A_orientacaoAObjetos.variaveisDeReferencia;

public class Main {

    public static void main(String[] args) {
        // É crucial lembrar que variáveis que "armazenam objetos" na verdade guardam suas referências.


        // No exemplo abaixo, primeiro é criado um objeto: "new Estudante()"
        // Esse objeto recebe um endereço de memória, que é então atribuído à variável 'aluno'.
        Estudante aluno = new Estudante();

        // Agora, o valor da variável 'aluno' é, na verdade, um endereço de memória daquele objeto.
        System.out.println(aluno); // Exibe o endereço onde o objeto criado está alocado, por exemplo, '5acf9800'.

        // Por consequência, se criarmos uma nova variável e atribuirmos a variável 'aluno':
        // Ambas as variáveis irão apontar para o mesmo objeto criado.
        Estudante mesmoAluno = aluno;
        System.out.println(mesmoAluno); // 5acf9800.
    }
}
