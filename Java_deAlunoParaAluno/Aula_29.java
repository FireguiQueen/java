// Pré e pós incremento e decremento 

/*
    Pré incremento e decremento:
    ++i;
    --i;

    Pós incremento e decremento
    i++;
    i--;

    Existe alguma diferença entre o pós e o pré? SIM.
    Mas em muitos casos, não haverá diferença.
*/

public class Aula_29{
    public static void main(String[] args)
    {
        int a = 10; 
        int b = a++; // Pós incremento.

        System.out.println(a); // 11 
        System.out.println(b); // 10

        // Mas por que o resultado foi: "11" para a variável 'a' & "10" para a variável 'b'?
        /*
            Quando utiliamos o pós-incremento, singifica que estamos:
            -> PRIMEIRO atribuindo a variável 'a' a nossa variável 'b'. 
            -> Por consequência, a variável 'b' recebe o valor de 'a' (10).  
            -> Logo após essa atribuição, é somado +1 a variável 'a'

            -> Por consquência, a variável 'b' vai manter o valor anteior da variável 'a'
            -> E a variável 'a' vai receber +1. 
        */
    }
}
