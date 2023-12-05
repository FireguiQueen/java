// MÉTODOS
/*
    Enquanto as propriedades representam as características de uma entidade, os métodos representam as ações
    que podem ser executadas.

    Ao criar uma classe para representar um avião, podemos incluir propriedades e métodos.

    As propriedades (características) de um avião podem ser:
    - cor
    - tipoDeMotor
    - quantidadePoltronas
    - dificuldadePilotagem
    etc.

    Os métodos, ou seja, as ações, podem ser:
    - ligarMotor
    - ativarTremDePouso
    - recolherTremDePouso
    - buzinar
    - abrirPortas
    - fecharPortas
    etc.

    Um método nada mais é do que um agrupamento de instruções em um bloco, e caso queiramos executar essas instruções,
    basta invocar este "bloco" pelo seu nome.
    Dito isso, podemos entender que os métodos são formas de executar ações.
    E claro, eles possuem muitas utilidades, uma delas é deixar um código claro e sem repetições.
*/

package javacore.A_orientacaoAObjetos.IntroducaoMetodos;

// --> classe de domínio:
public class Aviao
{
    // Propriedades
    public String empresa;
    public String cor;
    public double velMaxima;


    // Métodos
    /*
        A palavra-chave 'void' é utilizada para representar o TIPO DE RETORNO do método.
        Caso queiramos que determinado método apenas execute instruções, usamos o tipo 'void', que significa 'vazio'.
        Isto é, é um método sem retorno.
    */
    public void abrirPortas()
    {
        System.out.println("As portas foram abertas!");
    }

    public void fecharPortas()
    {
        System.out.println("As portas foram fechadas!");
    }

    // O 'return' é utilizado para os métodos retornarem valores.
    // Quando invocarmos o método no programa principal, o valor do 'return' aparecerá.
    // E por isso, métodos com retornos podem ser colocados em variáveis.
    // Se a gente quiser que o método retorne um número inteiro, precisamos definir o tipo como 'int' ou 'long'.
    public int quantidadePoltronas()
    {
        return 410;
    }

    // Se a gente precisar que o método retorne uma String, então, o tipo precisa ser 'String'.
    public String fraseDoDia()
    {
        return "Olá passageiros, bom dia a todos. Agradecemos por estarem voando conosco. Será uma viagem rápida e tranquila";
    }

    // Assim que o método lê a instrução "return", ele faz o retorno e finaliza sua execução.
    // Métodos do tipo 'void' podem fazer retorno contanto que sejam retornos vazios.
    public void retorno() {
        if (true)
        {
            return;
        }
        System.out.println("olá!"); // esta instrução não será lida, pois a função já fez um retorno.
    }


    /* ** ** ***** **** ***** ** ** ***** **** ***** ***** *** ** * ************ ***** *** ** * ************ */


    // PARÂMETROS
    // O parâmetro é utilizado para os métodos serem capazes de receber inputs (entradas de informação)
    // Os parâmetros são variáveis locais do método, e essas variáveis terão valores atribuídos quando invocarmos o método.
    public void ativarMotor(boolean portasEstaoFechadas)
    {
        System.out.println(portasEstaoFechadas ? "Motor ligado" : "As portas não estão fechadas!");
    }


    // Através dos parâmetros, nós podemos receber tipos primitivos e tipos não-primitivos.
    /*
        Quando invocamos o método na classe principal e passamos uma variável do tipo primitivo,
        nós estamos passando o valor dela diretamente, é como se fosse uma cópia.
        Por exemplo:

        int num = 40;

        // isto:
        metodoAleatorio(num);

        // seria a mesma coisa que isto:
        metodoAleatorio(40);
    */
    // Independente do caso, este valor será salvo no parâmetro 'numero'.
    public void metodoAleatorio(int numero)
    {
        // variável 'numero' vale 40.
        System.out.println(numero);

        // Agora ela irá valer 10.
        numero = 10;
        System.out.println(10);
    }
    // E por motivos óbvios, isto não irá alterar a variável da classe principal, a 'num'.


    // A situação muda quando passamos um valor não-primitivo como argumento.
    /*
        int[] listaNumeros = {10, 50, 100};
        metodoAleatorio02(listaNumeros);
    */
    public void metodoAleatorio02(int[] arrayDeNumeros)
    {
        // Através da instrução 'metodoAleatorio02(listaNumeros);', o array é passado ao parâmetro "arrayDeNumeros".
        // Mas lembre-se, o parâmetro 'arrayDeNumeros' não irá receber o array, e sim sua referência, ou seja, onde ele este localizado em memória.

        // Então se a gente fizer isto, o nosso array principal será afetado. Afinal, estamos utilizando sua referência.
        arrayDeNumeros[0] = 30;
    }


    /* ** ** ***** **** ***** ** ** ***** **** ***** ***** *** ** * ************ ***** *** ** * ************ */

    // THIS
    /*
        A palavra-chave 'this' é muito utilizada em métodos de classe de domínio.
        Veja bem, quando criamos um objeto, sabemos que o mesmo foi instanciado a partir de uma classe.

        E claro, este objeto herda as propriedades e métodos da classe.
        O 'this' que se encontra em um método da classe também será herdado, e ele faz referência ao contexto atual.

        Por exemplo, quando criamos um objeto chamado 'aluno_Guilherme', o 'this' apontará para o objeto 'aluno_Guilherme'.
        Quando criamos um objeto chamado 'boeing747', o 'this' fará referência ao objeto 'boeing747'.
    */
    public void printInformacoes()
    {
        System.out.println(this.empresa);
        System.out.println(this.velMaxima);
        System.out.println(this.cor);
    }

}
