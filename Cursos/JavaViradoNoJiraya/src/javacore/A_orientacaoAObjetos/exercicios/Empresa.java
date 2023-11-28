package javacore.A_orientacaoAObjetos.exercicios;
import javacore.A_orientacaoAObjetos.exercicios.dominios.Funcionario;
import javacore.A_orientacaoAObjetos.exercicios.dominios.EmpresaRelatorio;

public class Empresa
{
    public static void main(String[] args)
    {
        EmpresaRelatorio relatorio = new EmpresaRelatorio();

        Funcionario funcionario_001 = new Funcionario();
        funcionario_001.name = "Joaquim";
        funcionario_001.age = 32;
        funcionario_001.salary = new double[]{500, 200, 300};

        relatorio.dadosDoFuncionario(funcionario_001);
        System.out.println(relatorio.mediaSalarial(funcionario_001));


    }
}
