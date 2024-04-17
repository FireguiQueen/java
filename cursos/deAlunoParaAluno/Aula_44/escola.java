public class escola
{
    // ESSAS SÃO NOSSAS VARIÁVEIS DE INSTÂNCIA.
    // ELES PODERÃO SER ACESSADAS PELOS NOSSOS FUTUROS OBJETOS.
    // ISTO É: nossos objetos herderam essas variáveis. 

    int totalAlunos;
    int totalProfessores;

    // Mesmo que a gente NÃO defina. sempre haverá um construtor vazio.
    // Um construtor não deve conter palavras-chave de retorno: void, int, long.. 
    // Pois caso ele contenha, ele não será mais um CONSTRUTOR e sim um MÉTODO.
    public escola() {}

    // QUANDO CRIARMOS NOSSO OBJETO, O CONSTRUTOR ABAIXO SERÁ EXECUTADO.
    // NO CONSTRUTOR, COLOCAREMOS ARGUMENTOS, QUE POR SUA VEZ, SUBSTITUIRAM OS PARÂMETROS ABAIXO.
    public escola(int alunos, int prof)
    {
        totalAlunos = alunos;
        totalProfessores = prof;
    }
}