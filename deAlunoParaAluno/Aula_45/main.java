// VARIÁVEIS DE CLASSE X VARIÁVEIS DE INSTÂNCIA
/*
    As variáveis de instância são aquelas que podem ser acessadas pelo nosso objeto criado.
    Se criarmos uma variável de instância numa classe, o objeto herdará esta variável, 
    logo, os objetos criados a partir da mesma classe, terão as mesmas variáveis, 
    mas CADA objeto terá seu PROPRIO valor para aquela variável.

    Enquanto as variáveis de classe possuem um valor compartilhado.
    Isto é, se eu for num objeto e acessar sua variável de classe e modificar ela
    e depois ir num outro objeto e printar esta variável, eu verei o valor que coloquei no
    outro objeto. 
    
    >> Variáveis de classe compartilham o valor, o valor pertence a classe.
    >> Variáveis de instância pertencem ao objeto, são as mesmas variáveis, mas com valores individuais
*/


public class exemplo
{
    public static void main(String[] args)
    {   
        // --- Criando um objeto da classe 'exemplo' ---- 
        // Este objeto herderá as variáveis de INSTÂNCIA e variáveis de CLASSE.

        // Este objeto herderá a variável de instância (x) e a variável de classe (y)
        exemplo meuObj_01 = new exemplo();
        // modificando ela variáveis de instância.
        meuObj_01.x = 50; 

        // Este objeto herderá a variável de instância (x) e a variável de classe (y)
        exemplo meuObj_02 = new exemplo();
        meuObj_02.x = 100;

        // Os valores abaixos só são diferentes pois fomos capazes de acessar de maneira individual.
        // Entramos no objeto 01 na variavel 'x' e definimos o valor de 50.
        // Entramos no objeto 02 na variável 'x' dele e definimos o valor de 100.
        System.out.println(meuObj_01.x); // retorna 50
        System.out.println(meuObj_02.x); // retorna 100.


        // Agora, com as 
    

    

    }
}