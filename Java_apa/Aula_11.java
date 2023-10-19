// Interação com o usuário: INPUTS 

public class Aula_11 {
    public static void main(String[] args)
    {
        // Essa linha certamente está um pouco confusa a você, mas ignore ela por enquanto. 
        // Apenas entenda que esse é um jeito para você herdar comandos que irão trazer novas funcionalidades
        // ao nosso programa.
        Scanner entradaDeInformacao = new Scanner(System.in);

        // Por exemplo, no aula 09 fizemos um programa que calcula a área de um triângulo. Mas todos os valores,
        // como base e altura, foram definidos por nós (os programadores). 

        // Mas agora através dessa classe "Scanner", podemos receber valores do usuária via terminal. 

        float base = entradaDeInformacao.nextFloat(); 
        float high = 120; 
        float trianguleArea = (base * high) / 2;
    }
}