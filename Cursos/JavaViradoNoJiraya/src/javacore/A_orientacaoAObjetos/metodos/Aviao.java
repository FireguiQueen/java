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

package javacore.A_orientacaoAObjetos.metodos;


// Classe de domínio:
public class Aviao {

    // Propriedades
    public String cor;
    public double largura;
    public double altura;

    // Métodos
    // O 'void' é utilizado para representar o tipo de retorno do método.
    // Caso queiramos que determinado método apenas execute ações, usamos o tipo 'void', que significa 'vazio'.
    // Isto é, é um método sem retorno.
    public void abrirPortas() {
        System.out.println("As portas foram abertas!");
    }

    public void fecharPortas() {
        System.out.println("As portas foram fechadas!");
    }

    // O 'return' é utilizado para os métodos retornarem valores. Quando invocarmos o método no programa principal,
    // o valor do 'return' aparecerá. E por isso, métodos com retornos podem ser colocados em variáveis.
    // Se a gente quiser que o método retorne um número inteiro, precisamos definir o tipo como 'int' ou 'long'.
    public int quantidadePoltronas()
    {
        return 410;
    }

    // Se a gente precisar que o método retorne uma String, então, o tipo precisa ser 'String'.
    public String fraseDoDia()
    {
        return "Olá passageiros, um bom dia a todos. Agradecemos por estarem voando conosco. Será uma viagem rápida e tranquila";
    }


    // PARÂMETROS
    // O parâmetro é utilizado para os métodos serem capazes de receber inputs (entradas de informação)
    // Os parâmetros são variáveis locais do método, e essas variáveis terão valores atribuidos quando invocarmos o método.
    public void ativarMotor(boolean portasEstaoFechadas)
    {
        System.out.println(portasEstaoFechadas? "Motor ligado" : "As portas não estão fechadas!");
    }
}
