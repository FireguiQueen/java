// Variáveis globais e locais
/*
    A variável global é uma variável que pode ser acessada em qualquer lugar.
    Ela geralmente percente ao escopo principal, e por isso ela é GLOBAL.
    Afinal, qualquer escopo filho do escopo global, terá acesso a ela.

    Já as variáveis locais são definidas por exemplo, quando as colocamos em escopos dentro
    de escopos. 



    >> nesta explicação um escopo pode ser determinado com a abertura e fechamento das chaves {}.
    >> isto é um escopo dentro de um escopo: { {} }
    >> isto é um escopo dentro de um escopo dentro de um escopo: {   {  {}  }   }
*/
public class Exemplo{
    // NESTE MOMENTO, ESTAMOS NO ESCOPO DA NOSSA CLASSE 'EXEMPLO'


    // Esta é conhecida como uma variável global.
    // Pois em qualquer lugar do nosso código somos capazes de acessar ela.
    int x = 50;

    // Então mesmo que haja um método aqui, ele ainda pode acessar e modificar o valor dela.
    public void somar()
    {
        x += 10; 
    }

    // Uma variável local é uma variável que tem seu acesso limitado, pois ela foi criada em um escopo
    // que está dentro de outro escopo, o escopo principal: 'EXEMPLO'

    // Vamos criar um método, e ele será responsável por criar uma variável do tipo 'int'
    public void criarVar()
    {   
        // essa variável pertence somente a ESTE escopo (criarVar) e a escopos dentro deste escopo.
        int y = 50;

        // outro escopo. Mas ele possui acesso a variável criada no escopo 'pai'
        public void acessarVar()
        {
            y += 50;
        }
    }

    // NÃO PODEMOS FAZER ISSO POIS RETORNA ERRO. A variável 'Y' foi definida no escopo anterior.
    // System.out.println(y);


    // Por que não podemos fazer isto:
    /*
        int a = 50;
        for (int a = 0; a < 50; a++){}
    */

    // Mas podemos fazer isto:
    for (int a = 0; a < 50; a++){}
    int a = 50; 

    // A questão é que, no primeiro exemplo, declaramos uma variável de nome 'a'
    // e logo abaixo declaramos ela novamente pelo for, e não podemos redeclarar variáveis.

    // No segundo exemplo, o for é executado, e quando ele termina esta variável MORRE, ela não existe mais
    // e na proxima linha, ela é declarada, como se nunca houvesse sido declarada antes.


    

}