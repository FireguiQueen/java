// VARIÁVEIS II & Operações básicas de matemática

class Aula_05
{

    public static void main(String[] args){

        // Podemos atribuir a uma variável outras variáveis. 
        int x = 50;
        int y = 50;

        // Como neste caso, onde estamos dizendo "a variávei ¨total¨ RECEBE a variável ¨x¨ + ¨y¨"
        int total = x + y; 

        System.out.println(total);
        // resposta (output): 100;  


        // Mas é claro, existem outros operadores, como o de subtração (-), divisão (/), multiplicação (*)... 
        int divisao = x / y;
        int multiplicacao = x * y; 
        

        // Como printar x e y sem juntá-los? Por exemplo: "50 50"

        System.out.println(x + y);
        // output: 100 

        // Precisamos colocar uma string no meio 
        System.out.println(x + " " + y);

        // Mas por qual motivo precisamos fazer isso?
        /*
            A resposta é bem simples. Ao fazer: System.out.println(x + y); 
            significa que desejamos juntar os valores daquelas variáveis, e assim será retornado 100 (50 + 50).

            Quando colocamos as aspas no meio, basicamente estamos dizendo que o valor de X irá se juntar 
            a uma string e a string irá se juntar ao valor de y. 
        */

    }
}