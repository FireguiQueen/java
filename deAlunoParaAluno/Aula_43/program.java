public class program
{
    public static void main(String[] args)
    {
        // Nesta pasta, podemos ver que há outro arquivo, chamado 'TV.java'
        // Este arquivo é o responsável por criar a nossa classe.

        // Definimos que uma variável irá receber a nossa classe TV.
        // O 'new' é responsável por fazer a instância, por puxar todas as propriedades e métodos de determinada classe.
        // neste caso, dizemos que a variável recebe propriedades e métodos da classe TV.
        TV minhaTelevisao = new TV();


        System.out.println(minhaTelevisao.ligada);
    }
}