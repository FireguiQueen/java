// THIS
/*
    Quando um objeto é criado a partir desta classe, ele herda os métodos contidos aqui.
    Os métodos utilizam a palavra-chave 'this', onde 'this' se refere ao contexto em que está localizado.

    Por exemplo, se você criar um objeto chamado "aviao", ele herdará o método "mostrarInformacoes()".
    Dentro desse método, temos a seguinte instrução:
    - System.out.println(this.nome);
    O "this" faz referência ao seu contexto, e neste contexto, estamos no objeto "aviao".
*/

package javacore.A_orientacaoAObjetos.This;

public class Aviao
{
    // propriedades
    public String nome;
    public int ano;
    public boolean motores;

    // Métodos
    public void mostrarInformacoes() {
        System.out.println(this.nome);
        System.out.println(this.ano);
    }

    public void ligarMotor() {
        this.motores = true;
        System.out.println("Motores ligados!");
    }

    // Você pode se perguntar por que usar o 'this', sendo que poderíamos simplesmente chamar a variável diretamente:
    public void showInformations() {
        System.out.println(nome);
    }
    // Bem, isso é verdade, para este CASO o 'this' realmente não é necessário.
    // O problema surge quando o método possui o mesmo nome de parâmetro que a propriedade.
    // E para sermos capazes de acessar as propriedades do objeto, precisamos do 'this'.

    // Este método espera que seja passado um argumento do tipo "string", o valor será salvo no parâmetro "nome".
    public void showInf(String nome)
    {
        System.out.println(nome);       // imprime o valor passado como argumento ao parâmetro "nome".
        System.out.println(this.nome);  // imprime a propriedade "nome" do objeto instanciado a partir desta classe.
    }
}
