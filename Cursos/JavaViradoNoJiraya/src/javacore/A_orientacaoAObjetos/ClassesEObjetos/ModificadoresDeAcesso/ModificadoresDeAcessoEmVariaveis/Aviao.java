// MODIFICADORES DE ACESSO: PRIVATE EM VARIÁVEIS (propriedades/atributos)
/*
    Talvez você se pergunte:
        Quando criarmos um objeto a apartir desta classe, como vamos definir e retornar os valores dessas propriedades?
        Afinal, elas estão privadas, ou seja, nenhuma outra classe terá acesso a elas.

    Bem isto é verdade, nenhuma classe terá acesso as variáveis privadas dos objetos.
    E para isso, iremos definir métodos públicos.
    Eles são: get e set.

    O método 'set' tem o objetivo de definir um valor para a propriedade do objeto.
    Para isso, criaremos um parâmetro para ele, e quando o objeto for invocado em outra classe juntamente a este
    metodo, ele irá passar como argumento o valor que deseja atribruir a propriedade.

    O método 'get' tem apenas o objetivo de pegar um valor de uma propriedade e retornar ele.

    // /// / // /// / // /// / // /// / // /// / // /// / // /// / // /// / // /// / // /// /

    Por questões de arquiteura de software, é sempre recomendado que seus atributos estejam com o modificador
    "private". Isto está relacionado ao acoplamento.

    Uma classe que irá utilizar desta classe de domínio jamais deveria ter acesso DIRETO as propriedades daqui.
*/
package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmVariaveis;

public class Aviao
{
    private String modelo;
    private int ano;

    // método para definir um valor a propriedade "modelo".
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    // método para definir um valor a propriedade "ano".
    public void setAno(int ano)
    {
        this.ano = ano;
    }


    // método para pegar o valro da propriedade "modelo".
    public String getModelo()
    {
        return this.modelo;
    }

    // método para pegar o valro da propriedade "modelo".
    public int getAno()
    {
        return this.ano;
    }



}
