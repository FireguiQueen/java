// SWITCH CASE

/*
    O switch case é bem parecido com o "if", porém, o propósito do switch é bem mais simples.
    Por exemplo, na condicional 'if' nós usamos expressões booleanas, para determinar se o bloco 'if'
    será executado ou não.

    // OBSERVAMOS A EXPRESSÃO BOOLEANA DENTRO DOS PARETENSIS DO IF. E ELA IRÁ RETORNAR 'TRUE' ou 'FALSE'.
    // SE RETORNAR 'TRUE' NOSSO BLOCO É EXECUTADO, SE FOR 'FALSE', NOSSO BLOCO NÃO SERÁ EXECUTADO.
    int x = 5;
    if (x > 0){

    }

    // Já no switch as coisas são diferentes, pois ele não trabalha com expressões booleanas.
    // O switch usa apenas um sistema bem simples de comparação. 
    
*/

public class Aula_27{
    public static void main(String[] args)
    {
        int x = 1;

        // Vamos começar definindo qual valor será analisado. Neste caso, será o X. 
        switch(x)
        {
            // Aqui iremos colocar os "casos". 

            // Caso o valor colocado anteriormente seja IGUAL a 3, execute o bloco.
            case 3: 
                System.out.println("oi");
                break;

            // Caso o valor colocado anteriormente seja IGUAL a 1, execute o bloco.
            case 1:
                System.out.println("oi");
                break;
        }


        // Observe que o 'break' foi utilizado. Ele precisa ser colocado em cada 'case', pois se não fosse
        // a instrução do próximo caso seria executada. 


        // Mas e se não houver um 'case' para o valor analisado?
        // Basta utilizar o 'default'. 

        int z = 0;
        switch(z){
            case 50:
                System.out.println("Olá");
                System.out.println("Este bloco será executado caso o valor seja IGUAL a 50");
                break;

            case 30:
                System.out.println("Olá");
                System.out.println("Este bloco será executado caso o valor seja IGUAL a 30");
                break;
                
            // Como nenhum dos casos anteriores forem executados, o nosso 'default' será.
            // ele é como se fosse o "else" da estrutura "if".

            default:
                System.out.println("Este bloco foi executado pois nenhum caso anterior tem o valor desejado");
        }
            

        // CONSEQUÊNCIAS DE NÃO UTILIZAR O BREAK:
        int y = 100;
        switch(y)
        {   
            // o bloco abaixo será executado, pois o nosso valor analisado (y) é 100. 
            case 100: 
                System.out.println("Valor 100");
                // como o break não está aqui, as linhas abaixo serão consideradas como parte deste bloco.

            // Por isso, este bloco também será executado.  
            case 200:
                System.out.println("Valor 200");
        }

        // OUTPUT:
        /*
            Valor 100
            Valor 200
        */


        // MULTIPLOS CASOS
        /*
            E se por exemplo, para que um bloco seja executado, pode ser qualquer valor que seja
            200, 300 ou 400?
        */
        int j = 100; 
        switch(j){

            /* a ideia de montar desta maneira, é que, caso a variável seja 100 por exemplo, o nosso primeiro
            'case' será executado, mas observe que como não houve um 'break', tudo ali faz parte dele.
            Então nossa string é printada.
            Caso o valor seja 200 por exemplo, o nosso segundo 'case' será executado, mas novamente, não há
            o 'break', então toda as instruções abaixo serão executadas..*/
            case 100:
            case 200:
            case 300:
                System.out.println("O valor da variável pode ser 100, 200 ou 300.");
                break;
        }
    }
}
