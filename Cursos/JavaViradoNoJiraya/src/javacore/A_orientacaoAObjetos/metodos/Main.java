package javacore.A_orientacaoAObjetos.metodos;

public class Main
{
    public static void main(String[] args)
    {
        // Criando um objeto utilizando a classe-de-domínio 'Aviao'.
        // O objeto é criado e sua referência é armazenada na variável "boeing747".
        Aviao boeing747 = new Aviao();

        // Podemos invocar (executar) nossos métodos agora.
        boeing747.abrirPortas();
        boeing747.fecharPortas();

        // O nosso método "quantidadePoltronas" faz um retorno.
        // Este retorno precisa ser colocado em algum lugar.
        int poltronas = boeing747.quantidadePoltronas(); // retorna o número 410 para a variável 'poltronas'.
        System.out.println(poltronas);

        // Mas não somos obrigados a colocá-los numa variável, podemos fazer isto:
        System.out.println(boeing747.quantidadePoltronas());

        /* ** ** ***** **** ***** ** ** ***** **** ***** ***** *** ** * ************ ***** *** ** * ************ */

        // Aqui estamos usando uma função que possui parâmetros, sendo assim, ela precisa receber argumentos.
        // Os parâmetros são variáveis locais do método, os argumentos são os valores que aquelas variáveis irão receber.
        boeing747.ativarMotor(true);
    }
}
