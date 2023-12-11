// MÉTODOS ESTÁTICOS (static)
/*
    Quando os métodos são declarados como "static", estamos dizendo que este método pertence a classe,
    e não aos objetos instânciados.

    Um método estático não pode utilizar a palavra "this".
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


        -> Porém, quando há um método "static", não há necessidade de criar um objeto para invocá-lo, afinal
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

        
*/
package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmMetodos;

public class Carro
{

    public static void setCarro()
    {
        this.
    }
}
