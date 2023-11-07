// Esta é a nossa classe, ela será responsável por conter as propriedades e métodos.

// Como o objetivo é "recriar" uma TV em nosso código java, criaremos uma classe com o nome 'TV'.
/*
    MAS AFINAL, O QUE É UMA CLASSE?

    Uma classe é um modelo, um protótipo. 
    Vamos pensar numa empresa que fabrica apenas um único tipo de carro.

    Obviamente, esta empresa já possui o molde deste carro. Vamos imaginá-lo sendo assim: 
    carro {
        cor: preto
        tipo_de_roda: estrada
        motor: 20 cavalos
    }
    Este MOLDE acima é a nossa CLASSE.
    Os valores "modelo", "cor", "tipo de roda".. São as propriedades desta classe. SÃO AS CARACTERÍSTICAS. 

    Quando este carro é vendido, seu motor, pintura e rodas podem ser trocadas. 
    E neste momento, o carro vira um objeto. 

    Ou seja, em java, a classe é um molde, e este molde traz consigo propriedades COM ou SEM valores.
    Neste caso, nossa classe possui propriedades que possuem valores, por exemplo:
    { cor: preto }. 
    Mas em muitos outros casos, criaremos classes que não possui valores para as suas propriedades.

    Já um objeto é aquela classe, só que modificada. Pegamos nossa classe (carro) e 
    trocamos os valores de suas propriedades. 
    meuCarro {
        cor: azul
        tipo_de_roda: flangeadas
        motor: 60 cavalos
    }
*/


// Esta é uma classe chamada TV.
// Quando colocarmos em nosso código e salvármos ela em uma variável, somos capazes de criarmos nossa própria TV
// Ou seja, um objeto. 
public class TV
{
    String fabricante = "Sony";
    boolean ligada = false;
    int volume = 0;

    public void ligarDesligar(){
        ligada = ligada == false? true : false; 
    }

    public void aumentarVolume(int volumeDesejado)
    {
        // caso o volume já seja 10, nossa função é finalizada.
        if (volume >= 10) return;

        for (int i = 0; i < volumeDesejado; i++)
        {
            if (i >= 10) break;
            volume++;
        }
    }

    public void diminuirVolume(int volumeDesejado)
    {
        // caso o volume já seja 0, nossa função é finalizada.
        if (volume <= 0) return;

        for (int i = 0; i < volumeDesejado; i++)
        {
            if (volume <= 0) break;
            volume--;
        }
    }
}