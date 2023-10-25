// CONDICIOANIS: IF & ELSE


public class Aula_18{
    public static void main(String[] args)
    {
        // 'if' significa 'se'. SE determinada condinção for verdadeira (true), excute o bloco. 
        // o 'if' trabalha com expressões booleanas, então por exemplo: '1 > 2 (um maior do que dois? FALSE)'.

        
        // SE dez for maior do que zero, excute o bloco. 
        // Como a expressão é verdadeira, o bloco será executado.
        if (10 > 0)
        {
            System.out.println("Olá!");   
        }

        // Também podemos usar variáveis.
        int idade = 18; 
        if (idade < 18){
            System.out.println("Você é de menor.");
        }
        // No caso acima, nossa variável idade recebe 18. Então nossa condição booleana é "18 < 18?".
        // E isso obviamente retorna "false", pois 18 não é menor do que 18.


        // Por outro lado, podemos colocar o sinal de "igual".
        // Neste caso, estamos perguntando: "18 é MENOR ou IGUAL a 18?"
        // E isto retorna "TRUE", mesmo que 18 não MENOR do que 18, 18 é igual a 18.
        if (idade <= 18){
            System.out.println("Você tem menos de 18 anos ou tem 18 anos.");
        }


        // Funcionamento do 'else'. 
        // O else é como: "caso todas as condicionais anteriores sejam falsas, execute este bloco"
        /* 
            Como a expressão do nosso IF retornará 'false', o nosso 'else' será executado.
            Detalhe que o 'else' não recebe NENHUMA expressão, pois ele não avalia condições.
        */
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
        // Estamos apenas atribuindo um valor a determinada variável por exemplo. 
        // Para perguntar se um número é igual a outro numa condicional, utilize o "==". 
        int conta01 = 500;
        int conta02 = 500; 

        if (conta01 == conta02){
            System.out.println("Ambos as contas possuem o mesmo saldo.");
        } 


        // Sinal de "diferença" (!==). Ele é muito utilizado para perguntar se determinado valor é diferente do outro.
        if (conta01 !== conta02){
            System.out.println("As contas possuem saldos diferentes.");
        }
    }
}