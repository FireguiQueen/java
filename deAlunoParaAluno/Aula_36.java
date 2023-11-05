// MÉTODOS 
/*
    Antes de falar sobre os métodos, podemos lembrar que na aula 02 é dito que a "public static void main(..)"
    é o nosso método principal. Então, desde o inicio de nossa aprendizagem, estamos usando métodos. 

    Nós podemos criar vários métodos em nosso programa, e cada um pode desempenhar um papel diferente para 
    o funcionamento do mesmo. Mas assim que o nosso programa Java é executado, ele busca sempre pelo método 
    principal, que é denominado pela palavra-chave "main". Isto é, sem um método principal, não será possível
    executar nenhum outro método. 

    Pense em um método como um bloco. Neste bloco haverá diversas instruções sobre o que fazer. 
*/

public class Aula_36
{
    // Método principal. Ele é o único método que o java executa. 
    // Mas através do método principal, somos capazes de invocar (chamar) outros métodos do programa.
    public static void main(String[] args)
    {
        digaOi(); 
    }

    // este método está sendo chamado na função principal
    public static void digaOi()
    {
        System.out.println("Oi!");
    }
}


/* Você pode se perguntar, porque usar métodos e podemos simplesmente colocar todas as instruções dele
em nosso método principal? Bem, NESTE caso é verdade, poderíamos simplesmente colocar o nosso "System.out.println()"
no método principal. Mas e se o método digaOi() fosse mais complexo? E se ele tivesse mais instruções
sobre o que realizar no programa? E se estas mesmas instruções serão reutilizadas no código posteriormente?
Por isso, usamos os métodos.
*/ 
