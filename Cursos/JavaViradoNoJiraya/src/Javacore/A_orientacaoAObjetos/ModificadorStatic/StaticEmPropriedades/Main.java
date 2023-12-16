package Javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmPropriedades;

public class Main
{
    public static void main(String[] args)
    {
        Carro bmw = new Carro("BMW XR", 2022);
        Carro audi = new Carro("Audi 9", 2018);
        Carro Tesla = new Carro("Tesla X", 2017);

        /*
            Fazer 'qntCarrosCriados' é possível pois esta variável é 'static'.
            Para representar um carro em nosso programa, utilizamos um objeto, e toda vez que criamos um
            objeto, o constructor dele é executado.
            Dentro do construtor, temos uma instrução para somar +1 a variável "qntCarrosCriados".
            E lembre-se, esta variável é static, ou seja, ela pertence a classe "Carro" e não aos objetos
            desta classe.
        */
        System.out.println(Carro.qntCarrosCriados);

        /*
            Se esta variável não fosse "static", seria necessário acessar ela por algum objeto, como
            por exemplo:
            bmw.qntCarrosCriados;

            E como ela não pertence a classe, esta variável sempre irá retornar '1', o que não está correto,
            afinal, 3 carros foram criados.
            Isto ocorre pois a 'qntCarrosCriados' pertence ao objeto.
        */
    }
}
