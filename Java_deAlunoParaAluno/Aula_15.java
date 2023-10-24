// Unix time 

/*
    A hora Unix é uma forma de representar um carimbo de data/hora, representando a hora como o número 
    de segundos desde 1º de janeiro de 1970 às 00:00:00 UTC. 
    
    Um dos principais benefícios de usar o  horário Unix é que ele pode ser representado como um número inteiro, 
    facilitando a análise e o uso em diferentes sistemas.

    Resumidamente, é um valor inteiro em minutos ou segundos que representa o tempo passado desde jan 01, 1970 
    até hoje.
*/ 

public class Aula_15{
    public static void main(String[] args)
    {
        // Em java, podemos pegar os milisegundos através do método "currentTimeMillis()".
        // Como o retorno é em milisegundos, é um valor inteiro muito grande, então precisamos usar o 'long' 
        long totalMilisegundos = System.currentTimeMillis();
        System.out.println(totalMilisegundos);
    }
}