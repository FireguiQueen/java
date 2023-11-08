// DIFERENÇA ENTRE CLASSE E OBJETO
/*
    Isto será um resumo. Caso queira a explicação completa, vá para a aula 43. 

    Uma classe é um molde.
    Um objeto utiliza de uma classe para ter seus próprios valores.

    Em um contexto fora da programação, podemos pensar em uma cidade.
    Esta cidade possui escolas. A "escola" é uma classe.

    E as escolas desta cidade são objetos.: 
    - Thomas Jefferson High School
    - Academic Magnet High Schoo
    - Signature School

    Isto é, "escola" é classe, um molde, que traz consigo propriedades (características).
    Uma escola terá x funcionários, x alunos, x metros quadrados e assim por diante.
    Essas caracteristicas são conhecidas como "propriedades" de classe. 

    Quando criamos uma escola, por exemplo, vou criar uma escola chamada "Guilherme Pires High School Foundation" 
    Este escola será um objeto, e ela é uma instância da classe "escola".
    Isto é, minha escola, ou seja, meu objeto, herdou todas aquelas propriedades da classe "escola".
    Com isto, eu posso definir meus próprios valores, quantos alunos, professores e metros minha escola tem. 
    

    ------ -- - - - - - - - - - 
    Os objetos são instâncias de classes.
    --- - - - - -- -  - - - - -

*/ 

public class programação{
    public static void main(String[] args)
    {
        // A variável abaixo é responsável por armazenar uma instância da nossa classe.

        // 1. Definimos o tipo de dado: escola
        // 2. Definimos o nome do nosso objeto: Vladir_HighSchool 

        // 3. Fazemos a instância da nossa classe: new escola(); 
        escola Vladir_HighSchool = new escola();

        /* 
            Observe que, na etapa 3, existe o trecho "escola()"
            E podemos observar que é como se estivessemos executando um método.

            Este é um método especial, chamado de "construtor", ou "constructor" em inglês.
            Os construtores são os responsáveis por criar o objeto em memória, ou seja, 
            instanciar a classe que foi definida.
        */


        /* 
            O construtor também pode ser utilizado para receber argumentos. 
            Esses argumentos são enviados ao nosso construtor (que está na nossa classe) e como o construtor
            é o primeira coisa a ser executada quando criamos um objeto, temos a capacidade de alterar
            variáveis de instância, criando assim, um objeto com propriedades da classe que possuem valores
            diferentes.

            Isto é, a nossa classe "escola" conterá as propriedades: totalAlunos e totalProfessores.
            Quando criamos um objeto, ele herda essas propriedades da classe "escola" para ele.
            Agora, nosso objeto possui essas propriedades, e podemos definir nossos próprios valores.
        */

        // o construtor envia dois argumentos: 500 e 15;
        // na nossa classe, este construtor tem dois parâmetros: alunos e professores;
        // Ou seja, 500 é o argumento para o parâmetro 'alunos', e 15 é o argumento para o pâmetro 'professores'
        // Dentro do corpo do construtor, é dito que a variável 'totalAlunos' recebe o parametro 'alunos'
        // e a variável 'totalProfessores' recebe o parametro 'professores'
        escola Escola02 = new escola(500, 15);

        // aqui acessamos a variável "totalAlunos" do objeto "Escola02".
        // E como passamos os argumentos no construtor para este objeto, a linha abaixo retornará 500.        
        System.out.println(Escola02.totalAlunos);


    }
}
