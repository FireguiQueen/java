// VARIÁVEIS II & Operações básicas de matemática

class Aula_05
{
    public static void main(String[] args){

        int x = 50;
        int y = 50;

        // Podemos atribuir a uma variável outras variáveis. 
        // Como neste caso, onde estamos dizendo "a variávei ¨total¨ RECEBE a variável ¨x¨ + ¨y¨"
        int total = x + y; 

        System.out.println(total);
        // output: 100;


        // Mas é claro, existem outros operadores, como o de subtração (-), divisão (/), multiplicação (*)... 
        int divisao = x / y;
        // output: 1

        int multiplicacao = x * y; 
        // output: 2500

        // Como printar x e y sem juntar seus valores? Por exemplo: "50 50"

        // NÃO FAÇA ISTO:
        System.out.println(x + y);
        // output: 100

        // Precisamos colocar uma string no meio 
        System.out.println(x + " " + y);
        // output: 50 50

        // Mas por qual motivo precisamos fazer isso?
        /*
            Ao fazer: System.out.println(x + y); 
            - significa que desejamos juntar os valores daquelas variáveis, e assim será retornado 100 (50 + 50).

            Quando colocamos as aspas no meio, basicamente estamos dizendo que o valor de X irá se juntar 
            a uma string, e esta string irá se juntar ao valor de y.
            Ou seja, na segunda abordagem, mandamos o valor de X para uma string e depois, adicionar o y a esta string.
        */

    }
}