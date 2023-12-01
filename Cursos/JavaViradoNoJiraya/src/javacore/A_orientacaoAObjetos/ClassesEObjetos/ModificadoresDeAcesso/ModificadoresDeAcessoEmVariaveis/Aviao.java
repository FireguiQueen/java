// MODIFICADORES DE ACESSO EM VARIÁVEIS (propriedades)
/*
    Talvez você se pergunte:
    Mas quando criarmos um objeto a apartir desta classe, como vamos definir e retornar os valores dessas propriedades?
    Afinal, elas estão privadas, ou seja, nenhuma outra classe terá acesso a elas.

    Bem isto é verdade, nenhuma classe terá acesso as variáveis privadas de objetos criados a partir desta classe.
    E para isso, iremos definir métodos públicos.
    Eles são: get e set.

    O método 'set' tem o objetivo de definir um valor para a propriedade do objeto.
    Para isso, criaremos um parâmetro para ele, e quando o objeto for invocado em outra classe juntamente a este
    metodo, ele irá passar como argumento o valor que deseja atribruir a propriedade.

    O método 'get' tem o objetivo de pegar um valor de uma propriedade e retornar ele. 
*/
package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmVariaveis;

public class Aviao
{
    // Propriedades: a partir de agora, você sempre deve as deixar em "private"!
    private String modelo;
    private int ano;
    private
}
