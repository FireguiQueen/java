// MODIFICADORES DE ACESSO:
/*
    Podemos ver que sempre quando definimos uma classe, um método, ou até mesmo uma variável, nós utilizamos
    um dos modificadores de acesso: o "public".

    Quando definimos uma classe pública, estamos dizendo que outras classes do nosso programa
    podem fazer uso dela, ou seja, criar objetos.

    /// /// /// ////// ////// ////// ////// ////// ////// ////// ////// ////// ///

    A classe 'Estudante' é uma classe-de-domínio, isto é, ela é uma classe que será utilizada para instanciar
    objetos que representarão estudantes.
    Para isso, ela precisa ser pública, pois se ela fosse "private" (privada) não teríamos acesso a ela em outras
    classes, consequentemencia, seria impossível criar objetos atraves desta classe.

    /// /// /// ////// ////// ////// ////// ////// ////// ////// ////// ////// ///

    Quando você for utilizar esta classe na sua classe 'Main', você dará a seguinte instrução:
    > Estudante aluno001 = new Estudante();

    E fazer isto só é possível pois nossa classe está pública.
*/

package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmClasses;

public class Estudante
{
    // ... 
}
