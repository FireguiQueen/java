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
    }
}