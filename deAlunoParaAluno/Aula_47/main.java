// VALOR PADRÃO DE INICIALIZAÇÃO
/*
    Quando declaramos uma variável GLOBAL:
    int x;

    Por padrão, ela receberá um valor.
    Nesta aula, veremos o valor padrão para cada tipo de dado
*/ 

public class exemplo
{
    // valores inteiros são inicializados com: 0
    byte x;
    short z;
    int y; 
    long c; 

    // possui o valor 0 como padrão. Se tentarmos printar uma delas, será retornado 0.
    System.out.println(x);

    // valores decimais são inicializados com: 0.0
    float j;
    double u; 


    // o caracter é inicializado com o valor 'blank' (em branco): \u000
    char g; 


    // boolean é inicializado com o valor: false
    boolean t; 


    // objetos acessados por referencia são inicializados com: null
    String e;


    // VALE LEMBRAR QUE ISSO OCORRE APENAS PARA VARIAVEIS GLOBAIS.
    // OU SEJA, VARIÁVEIS LOCAIS, AQUELAS QUE NAO ESTAO NO ESCOPO PRINCIPAL PRECISARÃO DE UM VALOR DE INICIALIZAÇÃO.
    public void criarVar(){
        int x; // não possuir nenhum valor.

        // dará erro caso tente printar.
        // System.out.println(x);
    } 
}