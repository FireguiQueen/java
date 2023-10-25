// LOOP.. Laço de repetição.. Ciclo.. (é tudo a mesma coisa)

public class Aula_22.java{
    public static void main(String[] args){

        // While (enquanto)
        // Assim como o "if", o while também precisa de uma expressão booleana. 
        /* 
            Enquanto a expressão for verdade, o loop irá continuar, assim que ela for "false", o while 
            não será mais executado.
        */ 

        // Geralmente iremos trabalhar com variáveis que terão seus valores alterados dentro do próprio bloco do while.
        // Neste caso é perguntado: "A variável X (10) é maior do que 5? Sim? Execute o código".
        // E observe que no próprio bloco do while temos um decremento da variável X, fazendo com que toda vez
        // que o bloco seja executado, a variável X perca 1 do seu valor. 
        // Isto até chegar num ponto onde será perguntando "A variável X (5) é maior do que 5?".. E obviamente será
        // 'false', e o while irá parar. 

        int x = 10;
        while (x > 5){
        System.out.println(x);
        x--; 
        }
        
    }
}