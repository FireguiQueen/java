// LOOP.. Laço de repetição.. Ciclo.. (é tudo a mesma coisa): FOR 

public class Aula_24{
    public static void main(String[] args)
    {
        // O for consiste em três coisas 
        /*
            1. Declarar uma ou mais variáveis de controle. 
            2. Estabelecer uma condição. 
            3. Incrementar ou decrementar valores da nossa variável de controle. 
               (fazendo com que futuramente a segunda etapa se torne false, e assim parando nossa repetição)
        
            É importante saber que, a terceira etapa só ocorre depois da execução do bloco. 
            Então por exemplo, primeiro será analisada a condição. Ela é verdadeira?
            Sim? execute o bloco.
            Por fim, incremente/decremente o valor da nossa variável. 
        */

        // 1. int i = 0; 
        // 2. i < 10;
        // 3. i++
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i); 
        }   

        // O nosso 'for' irá fazer com que seja printado em nosso terminal:
        /*
        >>    0
        >>    1
        >>    2
        >>    3
        >>    4
        >>    5
        >>    6
        >>    7
        >>    8
        >>    9
        */
        /*
            Observe que não printou até o 10, isto porque, em determinado momento, nossa variável 'i' foi do
            valor 9 para o valor 10. Após isso, tivemos nossa condição, então foi perguntado: 
            10 < 10? 
            Obviamente, dez não é menor do que dez, então, é retornado false, e temos nosso loop finalizado.
        */ 
       
        // Para "corrigir" este problema, basta utilizar o operador "<=" (menor ou igual).
        // Então, quando nossa variável I atingir o valor de 10, será perguntado:
        // 10 é maior ou IGUAL a 10? 
        // 10 não é maior, mas é igual. Logo será retornado 'true' e nosso bloco será executado.
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i); 
        }   

    }   
}
