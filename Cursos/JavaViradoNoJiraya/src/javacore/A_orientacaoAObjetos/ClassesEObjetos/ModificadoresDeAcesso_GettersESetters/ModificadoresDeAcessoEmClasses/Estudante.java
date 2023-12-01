// MODIFICADORES DE ACESSO:
/*
    Podemos ver que sempre quando definimos uma classe, um método, ou até mesmo uma variável, nós utilizamos
    um dos modificadores de acesso, o "public".

    Quando definimos uma classe pública, como no exemplo abaixo, estamos dizendo que outras classes do nosso programa
    podem acessar ela.
    Esta nossa classe ("estudante") é uma classe-de-domínio, isto é, ela é uma classe que será utilizada para instanciar
    objetos que representarão estudantes.
    E para isso, ela PRECISA ser pública, pois se ela fosse "private" (privada) não teríamos acesso a ela em outras
    classes.

    Veja bem, quando você for utilizar esta classe na sua classe principal, você dará a seguinte instrução:
    > Estudante aluno001 = new Estudante();

    E fazer isto só é possível pois nossa classe está publica.
*/

package javacore.A_orientacaoAObjetos.ClassesEObjetos.ModificadoresDeAcesso_GettersESetters.ModificadoresDeAcessoEmClasses;

public class Estudante
{
}
