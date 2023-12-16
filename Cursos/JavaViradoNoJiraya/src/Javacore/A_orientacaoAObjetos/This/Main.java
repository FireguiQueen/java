// THIS
/*
    A palavra-chave 'this' é comumente utilizada em métodos de classe-de-domínio.

    Quando o this é utilizado em um método por exemplo, ele se refere ao contexto atual. (não entendeu nada, né?)
    Para entender melhor, você pode acessar a classe "Aviao" no pacote "dominios" para ver a utilização do 'this'.
*/

package Javacore.A_orientacaoAObjetos.This;

public class Main
{
    public static void main(String[] args)
    {
        // Criando objetos e salvando o endeço de memória deles nas variáveis.
        Aviao boeing747 = new Aviao();
        Aviao boeing737 = new Aviao();
        Aviao boeing777 = new Aviao();

        boeing747.nome = "Boeing-747";
        boeing747.ano = 1969;
        boeing747.mostrarInformacoes();
    }
}
