// CONDICIOANIS: IF & ELSE


public class Aula_18{
    public static void main(String[] args)
    {
        // 'if' significa 'se'. SE determinada condinção for verdadeira (true), excute o bloco. 
        // o 'if' trabalha com expressões booleanas, então por exemplo: '1 > 2 (um maior do que dois? FALSE)'.
        
        
        // SE dez for maior do que zero, excute o bloco. Como a expressão é verdadeira, o bloco será executado.
        // Sendo assim, será printado "olá" no terminal.
        if (10 > 0)
        {
            System.out.println("Olá!");   
        }

        // Também podemos usar variáveis.
        int idade = 18; 
        if (idade < 18){
            System.out.println("Você é de menor.");
        }
        // No caso acima, nossa variável idade recebe 18. Então nossa condição booleana se retorna "18 < 18".
        // E isso obviamente retorna "false", pois 18 não é menor do que 18.

        // Por outro lado, podemos colocar o sinal de "igual".
        // Neste caso, estamos perguntando: "18 é MENOR ou IGUAL a 18?"
        // E isto retorna "TRUE", mesmo que 18 não MENOR do que 18, 18 é igual a 18.
        if (idade <= 18){
            System.out.println("Você tem menos de 18 anos ou tem 18 anos.");
        }

        // Funcionamento do 'else'. 
        // O else é como "caso o  seja falso, execute este bloco"
        if

    }
}