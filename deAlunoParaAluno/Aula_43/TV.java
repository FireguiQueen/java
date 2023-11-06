// Esta é a nossa classe, ela será responsável apenas por carregar propriedades e métodos.
// Como o objetivo é "recriar" uma TV em nosso código java, criaremos uma classe com o nome 'TV'.

/*
    MAS AFINAL, O QUE É UMA CLASSE?

    Uma classe é um modelo, um protótipo. 
    Vamos pensar numa empresa que fabrica apenas um único tipo de carro. 
    Obviamente, esta empresa já possui o molde do carro definido, podemos pensar nele como: 
    carro {
        carro: HBL
        cor: preto
        tipo_de_roda: estrada
        motor: 20 cavalos
    } 
    E este molde é o nossa classe.

    Quando este carro é vendido, sua pintura, rodas, e motores podem ser trocados. 
    E neste momento, o carro vira um objeto. 

    Ou seja, em java, a classe é um molde, e este molde traz consigo propriedades COM ou SEM valores.
    Esta classe 

    Tanto as propriedades quanto os métodos desta classe, estão relacionados a ela. 
    Por exemplo, foi criado a classe TV. Uma TV possui cor, fabricante, opções para ligar/desligar
    e assim por diante. E tudo que está dentro desta classe, está relacionado a ela. 

*/
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