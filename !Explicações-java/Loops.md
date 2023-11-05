#### Sumário
[Loops](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#criando-um-array") &nbsp; | &nbsp;
[While](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#arrays-multidimensionais) &nbsp; | &nbsp;
[Do while](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#iterando-um-array) &nbsp; | &nbsp;
[For](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#iterando-um-array) 

# Loops
Os loops são repetições, e são de extrema importância para repetirmos instruções de maneira dinâmica e eficiente. Além disso, são eles que nos permitem percorrer em arrays, strings e etc. 

Para criar um loop temos três estruturas: `for`, `while` e `do while`.

### Utilidade
Para mostrar o quão útil um loop é, criaremos um programa onde seu papel é apenas printar a mensagem "hello" 10 vezes. Não se preocupe caso não entenda o código, quero que apenas pense qual parece mais eficiente. 

##### 1. Sem loop
```java
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
```

##### 2. Com loop
```java
    for (int i = 0; i < 4; i++)
    {
        System.out.println("Hello");
    }
```

Podemos dizer com certeza, que a segunda abordagem parece mais limpa e efeciente. Isto por que, caso surja a necessidade de printar a string "hello" 100 vezes, basta mudar um único número da estrutura `for`. Enquanto na primeira abordagem, seria necessário escrever a mão +90 vezes.  

Certo, entendemos __uma__ das utilidades de um laço de repetiçao. Mas como funciona? 

</br>

## Sintaxe: while
Podemos dizer que o `while` é o mais simples. Colocaremos ele e, em seguida, vamos abrir e fechar parentensis. 
Dentro deste parentensis, passaremos uma expressão, caso ela seja avaliada como verdadeira, o bloco do `while` será executado, e após a execução, voltaremos a mesma expressão, e caso ela seja avaliada como falsa, o laço será finalizado. 

Em português, 'while' significa "enquanto", ou seja, __enquanto__ determinada __expressão__ ser __verdadeira__ execute o bloco. </br> 
Em pseudo-código, o laço abaixo pode ser traduzido como: `Enquanto três for maior que dois, execute o bloco.`.
```java
    while (3 > 2)
    {
        System.out.println("Oi");
    }
```

O problema do laço acima é que a expressão _sempre será avaliada como verdadeira_, pois o número três (3) __sempre__ será maior do que o número dois (2). 
Para resolver este problema, usaremos variáveis e operadores de incremento. O bloco abaixo, em pseduo-código, pode ser traduzido como: 
```
Variável 'i' recebe 0. 
Enquanto 'i' (0) for menor do que 3, execute o bloco. 
    - Printe "oi" no terminal
    - Adicione +1 ao valor da variável 'i'
```
```java
    int i = 0;
    while (i < 3)
    {
        System.out.println("Oi");
        i++;
    }
```

##### Funcionamento passo-a-passo a execução do bloco `while`

- Assim que o "java" chegar na linha do laço `while`, ele ira avaliar se a condição é verdadeira (true) ou falsa (false). A nossa expressão é: `i (0) é menor do que 3?`. A expressão é avaliada como __verdadeira__, então o bloco é executado;

- Dentro do bloco, temos uma instrução de printar "hello" no terminal e uma instrução de incremento. Isto é, pegaremos a variável i, que vale 0 neste momento, e somaremos +1. _Após esta instrução, a variável 'i' vale '1'._

- Agora, será feito a mesma coisa, mas desta vez, a nossa expressão será: `i (1) é menor do que 3?`. Ela será avaliada como __verdadeira__, pois '1' é menor do que três. Então nosso bloco é executado, e logo, nossas instruções também são. Então será somado +1 ao valor de i (1). _Após esta instrução, a variável 'i' vale '2'._

- Novamente, será feito a mesma coisa, mas desta vez, a nossa expressão será: `i (2) é menor do que 3?`. Ela será avaliada como __verdadeira__, pois '2' é menor do que três. Então nosso bloco é executado, e logo, nossas instruções também são. Então será somado +1 ao valor de i (2). _Após esta instrução, a variável 'i' vale '3'._

- Novamente, será feito a mesma coisa, mas desta vez, a nossa expressão será: `i (3) é menor do que 3?`. Ela será avaliada como __falsa__, pois '3' __não__ é menor do que três. Então nosso bloco é não executado e o laço é finalizado. 
