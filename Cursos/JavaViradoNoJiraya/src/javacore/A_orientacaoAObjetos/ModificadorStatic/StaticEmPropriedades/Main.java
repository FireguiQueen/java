package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmPropriedades;

public class Main
{
    public static void main(String[] args)
    {
        Carro bmw = new Carro("BMW XR", 2022);
        Carro audi = new Carro("Audi 9", 2018);
        Carro Tesla = new Carro("Tesla X", 2017);
        
        // Fazer isto é possível pois a variável 'qntCarrosCriados' é static. Ela pertecente a classe "Carro".
        // Para representar um carro em nosso programa, utilizamos um objeto, e toda vez que criamos um objeto, o constructor dele é executado.
        // Dentro do constructor, temos uma instrução para somar +1 a variável "qntCarrosCriados", e esta variável pertecente a classe Carro, e não ao objeto instanciado
        System.out.println(Carro.qntCarrosCriados);

    }
}
