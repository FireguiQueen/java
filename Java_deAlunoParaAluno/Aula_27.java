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
            


        }


    }
}
