package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmMetodos;

public class Main
{
    public static void main(String[] args)
    {
        // método 'get' quando utilizamos um método estático
        Carro.getNumeroFixoDeRodaParaCarros();

        // método 'get' quando não utilizamos um método estático (precisamos criar um objeto)
        Carro carro = new Carro();
        System.out.println(carro.getNumeroFixoDeRodaParaCarros());
    }
}
