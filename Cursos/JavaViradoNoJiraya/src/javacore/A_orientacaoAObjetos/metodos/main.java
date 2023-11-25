package javacore.A_orientacaoAObjetos.metodos;
import javacore.A_orientacaoAObjetos.metodos.Aviao;

public class main
{
    public static void main(String[] args)
    {
        Aviao boeing747 = new Aviao();

        // Podemos executar/inovocar nosso métodos agora.
        boeing747.abrirPortas();

        boeing747.fecharPortas();


        // Como o nosso método "quantidadePoltronas" faz um retorno, este retorno precisa ser colocado em algum lugar.
        int poltronas = boeing747.quantidadePoltronas(); // retorna o número 410 para a variável 'poltronas'.

        System.out.println(poltronas);
    }
}
