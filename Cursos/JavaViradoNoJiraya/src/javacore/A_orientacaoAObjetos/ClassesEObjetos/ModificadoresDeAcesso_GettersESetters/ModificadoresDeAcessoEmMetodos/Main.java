package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso_GettersESetters.ModificadoresDeAcessoEmMetodos;

import javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso_GettersESetters.ModificadoresDeAcessoEmClasses.Estudante;

public class Main
{
    public static void main(String[] args)
    {
        // Podemos fazer isto pois a classe "Funcionario" está pública.
        Funcionario funcionario001 = new Funcionario();

        // O método "mensagemBoasVindas" foi criado na classe "Funcionario", e ele é "public".
        // Por consequência, o objeto "funcionario001" também herdou este método.

        // Nós estamos na classe "Main", e estamos acessando um método de outra classe.
        // >> Só podemos acessar este método pois ele é PÚBLICO (PUBLIC).
        funcionario001.mensagemBoasVindas();


        // O método "historiaEmpresa" é privado, isto é, apenas instruções do objeto herdado poderão acessar ela.
        // Fazer isto retornará erro:
        // > funcionario001.historiaEmpresa();

        /*
            Para você poder acessa um método privado a partir de outra classe, você precisará ter um método público
            dentro do objeto que invoque (execute) o método privado).
        */
        // Isto é possível pois o nosos método "exibirHistoriaEmpresa" é um método público, sendo possível acessá-lo em qualquer classe.
        // Dentro deste método, há um chamado para o método privado "historiaEmpresa". 
        funcionario001.exibirHistoriaEmpresa();
    }
}
