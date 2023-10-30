// CONDICIOANIS: IF & ELSE


public class Aula_18{
    public static void main(String[] args)
    {
        /* 
            -> 'if' significa 'se'. 
            -> SE determinada condinção for VERDADEIRA (true), EXCUTE o bloco. 
        
            As condições usam como base as expressões booleanas. 
            Uma expressão booleana é uma expressão que resulta em um valor booleano: 'true' ou 'false'.
            Se for 'true', a condição é verdadeira, logo o bloco é executado.
            Se for 'false', a condição é false, logo o bloco não é executado. 
        
            O operador de igualdade, ==, compara dois valores e produz um valor booleano de acordo com o fato 
            dos dois valores serem iguais ou não. Se eles forem iguais, o resultado é o valor boolean "TRUE".
            Se eles são falsos o resultado é o valor "FALSE".
        */
        
        // SE dez for maior do que zero, excute o bloco. 
        // Como a expressão boolean é verdadeira (pois dez é maior que zero), o bloco será executado.
        if (10 > 0)
        {
            System.out.println("Olá!");   
        }

        // Também podemos usar variáveis.
        int idade = 18; 
        if (idade < 18){
            System.out.println("Você é de menor.");
        }
        // No caso acima, nossa variável idade recebe 18. 
        // Então nossa condição se torna a expressão boolean "18 < 18?".
        // E isso obviamente retorna "false", pois 18 não é menor do que 18. Então aquele bloco do if não é executado.


        // Por outro lado, podemos colocar o sinal de " menor igual".
        // Neste caso, estamos perguntando: "18 é MENOR ou IGUAL a 18?"
        // E isto retorna "TRUE", mesmo que 18 não MENOR do que 18, 18 é igual a 18.
        if (idade <= 18){
            System.out.println("Você tem menos de 18 anos ou tem 18 anos.");
        }


        // Funcionamento do 'else'. 
        // O else é como: "caso todas as condicionais anteriores sejam falsas, execute este bloco"
        /* 
            Como a expressão do nosso IF abaixo retornará 'false', o nosso 'else' será executado.
            Detalhe que o 'else' não recebe NENHUMA expressão, pois ele não avalia condições.
        */
        idade = 18;
        if (idade >= 50)
        {
            System.out.println("A idade ultrapassou dos 50 anos!");
        } 
        else 
        {
            System.out.println("A idade não passou dos 50 anos!");
        }


        // Como fazer uma expressão booleana capaz de analisar se um valor é IGUAL ao outro? 
        // Em programação, o sinal '=' (quando colocado sozinho) é um sinal de ATRIBUIÇÃO, ou seja, não é de igualdade.
        // Ao utilizar o "=" estamos apenas atribuindo um valor a uma determinada variável por exemplo. 
        int conta01 = 500;
        int conta02 = 500; 

        // Para perguntar se um valor é IGUAL ao outro, utilize o "==". 
        // Neste caso, é retornado TRUE, então nosso bloco é executado.
        if (conta01 == conta02){
            System.out.println("Ambos as contas possuem o mesmo saldo.");
        } 


        // Sinal de "diferença" (!=). 
        // Ele é muito utilizado para perguntar se determinado valor é diferente do outro.
        // Se os valores são DIFERENTES é retornado TRUE. Se eles NÃO são DIFERENTES, é retornado "false".

        // Neste caso, é retornado FALSE, pois os valores são iguais. Nosso bloco abaixo não é executado.
        if (conta01 !== conta02){
            System.out.println("As contas possuem saldos diferentes.");
        }
    }
}