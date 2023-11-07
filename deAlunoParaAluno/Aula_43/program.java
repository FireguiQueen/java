// Nesta pasta, podemos ver que há outro arquivo, chamado 'TV.java'
// Este arquivo é o nosso programa. Nele temos o método principal.
// No método principal, podemos colocar a nossa classe em uma variável, criando assim, um objeto. 

// Com este objeto, podemos definir nossos próprios valores. 
public class program
{
    public static void main(String[] args)
    {

        // Definimos que uma variável irá receber a nossa classe TV.
        // O 'new' é responsável por fazer a instância, por puxar todas as propriedades e métodos de determinada classe.
        // neste caso, dizemos que a variável recebe propriedades e métodos da classe TV.
        // Agora, 'minhaTelevisao' virou um objeto. 
        TV minhaTelevisao = new TV();

        minhaTelevisao.fabricante = "Lg"; 
        System.out.println(minhaTelevisao.ligada);
    }
}