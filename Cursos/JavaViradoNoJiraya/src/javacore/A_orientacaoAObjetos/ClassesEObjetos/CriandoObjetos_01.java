package javacore.A_orientacaoAObjetos.ClassesEObjetos;

import javacore.A_orientacaoAObjetos.ClassesEObjetos.dominios.Carro;

public class CriandoObjetos_01
{
    public static void main(String[] args)
    {
        // fazendo uma instância da classe "Carro". Esta instância cria um objeto.
        // Este objeto será alocado em algum lugar da memória e criará uma referência, esta variável 'carroDeLuxo' receberá esta referência.
        Carro carroDeLuxo = new Carro();

        carroDeLuxo.cor = "blue";
        carroDeLuxo.empresa = "BMW";
        carroDeLuxo.modelo = "X-nine";

        // Printando as informações do nosso objeto.
        System.out.println(carroDeLuxo.cor);
    }
}
