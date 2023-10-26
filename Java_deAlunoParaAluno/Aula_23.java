// LOOP.. Laço de repetição.. Ciclo.. (é tudo a mesma coisa): DO WHILE 

public class Aula_23{
    public static void main(String[] args)
    {
        // DO WHILE (faça.. Enquanto.. )
        /* 
            O 'do while' é bem parecido com o 'while', a diferença é que no 'do while' sempre iremos começar
            executando o bloco do 'do', independentemente se a condição for falsa ou verdadeira. 

            no 'while', primeiro é analisado a condição, se ela for true, execute o bloco, se for false, 
            não execute. 
        */


       // Exemplo:
       int x = 1;
       int y = 1; 

        // observe que nossa condição é "faça isso enquanto X (1) for maior do que 10". 
        // o X não é maior do que 10, mas como estamos usando o 'do while', o bloco será executado 
        // independente da condição ser false ou verdadeira. 
        // Após o bloco do 'do' ser executado, teremos uma condição, se ela for verdadeira, o bloco 'do' será
        // executado, se for falsa, sairemos deste laço de repetição. 
        do{
            System.out.println("Olá!!");
        } while (x > 10);


        // no 'while' a situação é diferente. É imposto uma condição, se ela for verdadeira, o bloco
        // será executado, se for falsa, sairemos do laço. 
        while (x > 10){
            System.out.println("Olá!!");
        }

        // RESULTADO:
        // Apenas o bloco do "do while" será executado. E será executado apenas uma vez.
        // O bloco do laço 'while' não será executado, pois a condição é falsa. 


        // Conclusão:
        /*
            No 'do while', independentemente da condição, o nosso bloco sempre será executado AO MENOS
            uma vez. Já que primeiro é executado e depois perguntado.
            A famosa frase "Atirar e depois perguntar"

            No while, a frase fica: "Perguntar e depois atirar". 
        */ 

       
        // Quando o 'do while' pode ser utilizado ao invés do 'while'? 
        /*
            Imagine um programa bem simples que utiliza do terminal.
            A ideia é o usuário digitar um número positivo e será retornado se o número é ímpar ou pár. 
            Para isso, precisamos utilizar a classe "scanner" do java. 

            Detalhe, queremos APENAS números POSITIVOS, então, podemos montar o seguinte algoritomo:

            do {
                int x = user.nextInt();
            } while (x < 0)

            Ou seja, primeiro aparecerá um campo para o usuário digitar um número inteiro.
            Caso ele digite um número negativo, o input aparecerá novamente: pois o X será menor do que zero.

            Caso ele digite um número positivo, terminaremos este laço de repetição: 
            pois X será maior do que zero.

        */
}