// CONDICIOANIS: IF & ELSE II 

public class Aula_19{
    public static void main(String[] args)
    {
        // Anteriormente, na aula 18, vimos e utilizamos apenas uma única condicional (IF). 
        // Mas e se precisássemos de mais condições? 

        /* 
            Por exemplo, utilizando apenas "if" e 'else' somos capazes de colocar uma mensagem para 
            maiores de 18 e para menores de 18 anos.                                        
        */ 
        byte idade = 18;

        if (idade >= 18){
            System.out.println("Você é de maior.");
        } else {
            System.out.println("Você é de menor.");
        }

        // Mas como vamos colocar uma mensagem especifica para quem colocar uma idade negativa? 
        // Afinal, idade negativa não existe.
        // Para isso, NÃO DEVEMOS ADICIONAR MAIS UM "IF" AO CODIGO, utilizaremos a junção de "else if".
        // O "else if" é como o 'if', porém, ele só é lido caso a condição anteior seja falsa. 

        byte age = 10;
        if (age < 1){
            System.out.println("Idade inserida não é válida.");
        } 
        else if (age <= 18){
            System.out.println("Você é menor de idade.");
        }
        else {
            System.out.println("Você é maior de idade.");
        }

        // Utilizar o 'else if' tem apenas o intuito de adicionar mais condicionais. 
        // Podemos ver outro exemplo abaixo:
        /*
            Primeiro, definimos a temperatura. 
            Depois, utilizando o if, perguntamos se a string é igual a "frio". 
            Caso este if acima seja falso, teremos a próxima condição: A string é igual a "normal"?
            Caso o else if acima seja falso, teremos a próxima condição: A string é igual a "quente"? 

            Caso este else if acima seja falso, só temos uma última hípotese, o dia está muito quente.
            Sendo assim, usamos apenas o 'else'. 
            O bloco 'else' será executado caso nenhuma condição acima seja verdadeira.
        */
        String temperatura = "frio";

        if (temperatura == "frio"){
            System.out.println("Está frio. Não vale a pena sair de casa. Durma ou estude :)");
        } 
        else if (temperatura == "normal"){
            System.out.println("A temperatura está normal.");
        }
        else if (temperatura == "quente"){
            System.out.println("A temperatura está alta, procure se hidratar mais.");
        }
        else {
            System.out.println("O dia está extremamente quente, se hidrate muito. Procure ficar na sombra ao sair de casa.");
        }


        // POR QUE UTILIZAR "ELSE IF" SE TEMOS O "IF"?
        /*
            Isto é verdade, a realidade é que, no exemplo dado acima, todos os 'else if' poderiam ser
            simplesmente 'if'
        */ 
        if (temperatura == "frio"){
            System.out.println("Está frio. Não vale a pena sair de casa. Durma ou estude :)");
        } 
        if (temperatura == "normal"){
            System.out.println("A temperatura está normal.");
        }
        if (temperatura == "quente"){
            System.out.println("A temperatura está alta, procure se hidratar mais.");
        } 

        /* Pois bem, porque não fazer assim? 
        De certa forma, o código tende a funcionar da mesma maneira, mas pode resultar em alguns problemas.
        Porém, fazer isto não é uma boa prática, eis a explicação:
        Quando colocamos IFs abaixo de IFs, estamos dizendo ao Java que todas essas condições DEVEM
        ser analisadas. Isso significa que mesmo se a primeira condição for verdadeira, o código 
        continuará a verificar todas as condições subsequentes, o que pode ser ineficiente.
        */ 

       // EXEMPLO:
       int valor = 10; 

       // Esta primeira condição é verdadeira. Sendo assim, nosso código deveria parar por aqui.
       // Mas como há outro 'if' logo abaixo, ele será lido (por mais que esta condição já foi considerada verdade). 
       if (valor > 2){
            System.out.println("O valor é maior do que dois.");
       } 
       if (valor < 2){
            System.out.println("O valor é menor do que dois.");
       }
    }

}