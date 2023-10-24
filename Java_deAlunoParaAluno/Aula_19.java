// CONDICIOANIS: IF & ELSE II 

public class Aula_19{
    public static void main(String[] args)
    {
        // Anteriormente, na aula 18, vimos e utilizamos apenas uma única condicional (IF). 
        // Mas e se precisássemos de mais condições? 

        /* 
            Por exemplo, utilizando apenas "if" e 'else' somos capazes de colocar uma mensagem para 
            maiores de 18 e para menores de 18 anos.                                        */ 
        byte idade = 18;
        if(idade >= 18){
            System.out.println("Você é de maior.");
        } else {
            System.out.println("Você é de menor.");
        }


        // Mas como vamos colocar uma mensagem especifica para quem colocar uma idade negativa? 
    }
}