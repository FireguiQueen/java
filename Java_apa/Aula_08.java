// PALAVRAS-CHAVES e Quebras de linha

public class Aula_08{

    public static void main(String[] args){

        // Como qualquer outral linguagem de programação, o Java também precisa de palavras para poder definir
        // como as coisas vão funcionar na linguagem. 
        /*
            Por exemplo, em java precisamos definir o tipo de dado de nossa variável, sendo assim, o java precisa
            de algumas palavras-chaves para isso, entre elas temos o int, float, double.. 
        */

        // Observe que NÃO podemos usar as palavras-chave do java para nós como bem entendermos.
        // Como no exemplo abaixo, onde tentamos definir que o nome da variável é 'false', mas o 'false' já é
        // uma palavra-chave do java. 
        int false = 5; 


        /*  ******************************  */

        // Existem duas formas de printar uma string no console.: 
        System.out.println("Oi"); 
        System.out.print("Oi");

        // Elas são bem parecidas, e desempenham a mesma função. A diferença é que a 'println' faz com que a linha
        // seja quebrada, ou seja, ela cria uma NOVA linha após sua string. Inclusive, podemos compreender como
        // "print line new" (apesar de estar gramaticalmente incorreto em inglês). 

        // Já o print (sem o 'ln') continua na mesma linha.

        System.out.print("Oi");
        System.out.print("Oi");
        // output: OiOi

        System.out.println("Oi");
        System.out.print("Oi");
        // output: Oi
        //         Oi


        System.out.println("Oi");
        System.out.print("Oi");
        System.out.print("Oi");
        // output: Oi
        //         OiOi
    }
}