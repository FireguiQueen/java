// BLOCO DE INICIALIZAÇÃO ESTÁTICO
/*
    Um bloco de inicialização normal, pertence aos objetos instanciados a partir da classe,
    logo, toda vez que criamos um novo objeto, o bloco de inic. é executado.

    Blocos de inicialização estáticos são blocos de alta prioridade que pertencem a classe.
    Quando acessarmos esta classe na classe principal, seja executando um método estático, chamando um
    atributo estático ou até mesmo instanciando um objeto, o bloco de inicia. estático é executado.

    Podemos pensar na seguinte ordem:
       1. Assim que a classe é chamada, as propriedades estáticas são inicializadas
       2. Blocos de inicialização estáticos são executados.
       3. É alocado espaço em memória para este objeto (caso haja);
       4. As propriedades são inicializadas com valores default (0, null..) ou valores definidos;
       6. O constructor é executado. Podendo reescrever os valores das propriedades.
*/


package javacore.A_orientacaoAObjetos.ModificadorStatic.StaticEmBlocosDeInicializacao;

public class Anime
{
    private static int oi = 5;

    // Bloco de inicialização estático.
    static
    {
        System.out.println("Olá! Este é um bloco de inicialização estático");
    }

    public static void melhorAnime()
    {
        System.out.println("Steins;Gate");
    }
}
