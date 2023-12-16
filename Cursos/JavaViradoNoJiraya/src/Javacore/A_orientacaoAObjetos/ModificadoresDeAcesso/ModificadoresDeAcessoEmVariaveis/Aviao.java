// MODIFICADORES DE ACESSO EM VARIÁVEIS (propriedades/atributos)
/*
    É bastante comum designarmos nossas variáveis de instância (propriedades associadas a uma classe
    de domínio) com o modificador "private".

    A utilização do "private" confere a essas variáveis um caráter privado, restringindo o acesso
    exclusivamente ao objeto que as contém.

    Você pode se questionar:
     Ao criar um objeto a partir desta classe que contém atributos privados, como podemos definir e ler os
     valores desses atributos? Afinal, eles são privadas, o que significa que nenhuma outra classe terá
     permissão para acessar diretamente essas variáveis.

    É verdade que, por padrão, essas variáveis são inacessíveis de fora do objeto.
    No entanto, para possibilitar a manipulação dessas propriedades, definimos métodos públicos,
    geralmente métodos 'get' e 'set', que permitem a leitura e modificação controlada dessas
    variáveis privadas.

    - O método 'set' tem o objetivo de definir um valor para o atributo do objeto.
    Para isso, criaremos um parâmetro para ele, e quando o objeto for invocado em outra classe juntamente a este
    metodo, ele irá passar como argumento o valor que deseja atribruir a propriedade.

    - O método 'get' tem apenas o objetivo de pegar um valor de uma propriedade e retornar ele.

    // /// / // /// / // /// / // /// / // /// / // /// / // /// / // /// / // /// / // /// /

    Por questões de arquiteura de software, é sempre recomendado que seus atributos estejam com o modificador
    "private". Isto está relacionado ao acoplamento.

    Uma classe que irá utilizar desta classe de domínio jamais deveria ter acesso DIRETO as propriedades daqui.
*/
package Javacore.A_orientacaoAObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmVariaveis;

public class Aviao
{
    // atributos privados da classe:
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


    
    // método para pegar o valor da propriedade "modelo".
    public String getModelo()
    {
        return this.modelo;
    }

    // método para pegar o valor da propriedade "ano".
    public int getAno()
    {
        return this.ano;
    }
}
