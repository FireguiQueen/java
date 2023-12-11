// MODIFICADORES DE ACESSO EM CLASSES
/*
    Podemos observar que, ao definirmos uma classe, utilizamos a palavra-chave 'public'.
    O 'public' é um modificador de acesso que, quando aplicado a uma classe, determina a visibilidade dela
    para outras classes.

    Ao declararmos uma classe como pública, estamos indicando que outras classes dentro do nosso programa
    têm permissão para utilizá-la.

    /// /// /// ////// ////// ////// ////// ////// ////// ////// ////// ////// ///

    A classe 'Estudante' é uma classe de domínio, ou seja, ela é projetada para instanciar (criar) objetos que
    representam estudantes. Para cumprir essa função, é necessário que ela seja pública.
    Se fosse declarada como "private" (privada), não teríamos acesso a ela em outras classes, tornando impossível
    a criação de objetos por meio desta classe.

    /// /// /// ////// ////// ////// ////// ////// ////// ////// ////// ////// ///

    Quando você for utilizar a classe "Estudante" na sua classe 'Main' para criar um objeto,
    você dará a seguinte instrução:
    > Estudante aluno001 = new Estudante();

    E fazer isto só é possível pois nossa classe está pública.
*/

package javacore.A_orientacaoAObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmClasses;

// CLASSE PÚBLICA.
public class Estudante
{
    public String nome;
    public int idade;
}
