package javacore.introducaoClasses;

import javacore.introducaoClasses.classes.Carro; // importando a classe clarro.

public class criandoObjetos_02
{
    public static void main(String[] args)
    {
        Carro novoCarro = new Carro();

        // Note que no arquivo "Carro.java" (a nossa classe) não contém valores definidos as propriedades.
        // Mas como aquelas propriedades, que no fim acabam sendo variáveis da classe, estão no escopo global, elas já possuem valores pré-definidos.

        System.out.println(novoCarro.cor); // retorna 'null' pois a propriedade 'cor' é do tipo String (que é um objeto)
        System.out.println(novoCarro.totalRodas); // retorna '0' pois a propriedade 'totalRodas' é do tipo 'integer'
    }
}
