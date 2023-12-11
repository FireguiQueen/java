// MÉTODOS ESTÁTICOS (static)
/*
    Quando os métodos são declarados como "static", estamos dizendo que este método pertence a classe,
    e não aos objetos instânciados.

    ** MÉTODOS ESTÁTICOS NÃO PODEM UTILIZAR A PALAVRA-CHAVE "THIS" **

    Eis o motivo:
        -> Quando invocamos um método, o 'this' dentro deste método fará referência ao objeto em que
        executou o método.

            Carro audi = new Carro();
            audi.getNumeroDeRodas();

            -- método --
            public void getInf()
            {
                // esta instrução acaba se tornando: 'return audi.rodas;'
                return this.rodas;
            }


        -> Porém, quando há     um método "static", não há necessidade de criar um objeto para invocá-lo, afinal
        o método pertence a classe, e por isso, podemos chamá-lo pela própria classe:
            >> Carro.getInf();

            -- método --
            public static void getInf()
            {
                return this.rodas; (?)
            }

        Como você pode ver, o método foi chamado sem nenhum objeto, então o "this" estaria referenciando qual
        objeto?
        Exatamente, nenhum.
        Por isso não podemos utilizar a palavra "this" em métodos não-estáticos.


        //////////////////////////////////////////////////////////////////////////////////////////

        ** MÉTODOS ESTÁTICOS NÃO PODEM CHAMAR VARIÁVEIS NÃO-ESTÁTICAS **

        Eis o motivo:
            Em uma classe de domínio, variáveis não-estáticas são variáveis de instância.

            Um método estático (um método que pertence a classe) não pode acessar uma variável
            de instância, pois ela só irá existir em objetos instânciados pela classe.

*/
package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmMetodos;

public class Carro
{
    // DEFININDO GET E SETTERS PARA VARIÁVEIS ESTÁTICAS PRIVADAS
    /*
        Posso criar um método get/set não-estático para pegar/definir o valor de uma variável estática?
        --> Sim, você pode, mas você não deveria.

        Se sua variável é estática, significa que ela pertence a classe.
        Logo, os métodos getters e seterrs deveriam ser acessíveis diretamente pela classe, e não por um objeto.
    */
    private static int numeroFixoDeRodaParaCarros = 4;

    // Boa prática
    public static int getNumeroFixoDeRodaParaCarros()
    {
        return Carro.numeroFixoDeRodaParaCarros;
    }

    // Má prática
    public int getNumeroFixoDeRodaParaCarross()
    {
        return Carro.numeroFixoDeRodaParaCarros;
    }
}
