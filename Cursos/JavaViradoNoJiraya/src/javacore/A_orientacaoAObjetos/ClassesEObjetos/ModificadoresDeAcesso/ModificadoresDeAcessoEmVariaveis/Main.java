package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmVariaveis;

public class Main
{
    public static void main(String[] args)
    {
        Aviao aviao001 = new Aviao();

        //> aviao.nome = "Air bus..."; (isto não funciona mais pois a propriedade "nome" é privada).
        //> aviao.ano = 1993;          (isto não funciona mais pois a propriedade "ano" é privada).
        aviao001.setModelo("Air bus A340-200");
        aviao001.setAno(1993);

        // Como os métodos estão privados, utilizaremos um método público que retorna o valor deles.
        System.out.println(aviao001.getModelo());
        System.out.println(aviao001.getAno());
    }

}
