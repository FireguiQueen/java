package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmPropriedades;

public class Main
{
    public static void main(String[] args)
    {
        // Fazer isto é possível pois a variável 'qntCarrosCriados' é static. Ela pertecente a classe "Carro".
        System.out.println(Carro.qntCarrosCriados);

    }
}
