package Aula_43;

public class program
{
    public static void main(String[] args)
    {
        // Definimos que uma variável do tipo objeto irá receber a nossa classe TV.
        // O 'new' é responsável por fazer a instância, por puxar todas as propriedades e métodos de determinada classe.
        // neste caso, dizemos que a variável recebe propriedades e métodos da classe TV.
        TV minhaTelevisao = new TV();


        System.out.println(minhaTelevisao.ligada);
    }
}