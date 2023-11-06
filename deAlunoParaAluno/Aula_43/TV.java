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