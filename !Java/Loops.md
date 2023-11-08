#### Sumário
[Loops](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#criando-um-array") &nbsp; | &nbsp;
[While](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#arrays-multidimensionais) &nbsp; | &nbsp;
[Do while](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#iterando-um-array) &nbsp; | &nbsp;
[For](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#iterando-um-array) 

# Loops
Os loops são repetições e são de extrema importância para executar instruções de maneira dinâmica e eficiente. Além disso, eles nos permitem percorrer arrays, strings e muito mais.

Para criar um loop, existem três estruturas: `for`, `while` e `do-while`.

### Utilidade
Para ilustrar a utilidade de um loop, vamos criar um programa simples que tem como objetivo imprimir a mensagem "hello" 10 vezes. Não se preocupe se não entender completamente o código neste momento. A ideia é demonstrar qual abordagem parece mais eficiente.

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

Podemos afirmar com confiança que a segunda abordagem parece mais limpa e eficiente. Isso ocorre porque, se surgir a necessidade de imprimir a string "hello" 100 vezes, basta modificar um único número na estrutura `for`. Na primeira abordagem, seria necessário escrever manualmente a mensagem mais 90 vezes.

Agora que entendemos uma das utilidades de um laço de repetição, vamos explorar como eles funcionam.

</br>

## Sintaxe: while
O `while` é a estrutura mais simples. Abrimos e fechamos parênteses após a palavra-chave while, e dentro desses parênteses, fornecemos uma expressão. Se a expressão for avaliada como _verdadeira_, o bloco do while _será _executado_. Após a execução do bloco, a expressão será reavaliada, e o laço continuará enquanto a expressão for verdadeira.

Em português, 'while' significa "enquanto", ou seja, __enquanto__ determinada __expressão__ ser __verdadeira__ execute o bloco. Em pseudo-código, o laço abaixo pode ser traduzido como: </br> 
`Enquanto três for maior que dois, execute o bloco`.
```java
    while (3 > 2)
    {
        System.out.println("Oi");
    }
```

O problema do laço mostrado acima é que a expressão será __sempre__ avaliada como verdadeira, pois o número três (3) será sempre maior que o número dois (2). Para resolver esse problema, usamos variáveis e operadores de incremento. Vamos criar um pseudo-código, e usando ele como base, criaremos nosso laço:

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

- Quando o programa encontra o laço `while`, ele avalia a condição. No primeiro ciclo de execução, ou seja, na primeira vez que o while é executado, a expressão é "i (0) é menor que 3?". E ela é avaliada como verdadeira, e o bloco é executado. Dentro do bloco, temos uma instrução para imprimir "Oi" no console e uma __instrução de incremento__. Isso significa que a variável 'i', que tem o valor 0 neste momento, é _incrementada em 1_. 
> Agora, a variável 'i' tem o valor 1.

- No próximo ciclo (2°), a expressão é reavaliada: `i (1) é menor que 3?`. </br> A expressão ainda é verdadeira, então o bloco é executado novamente, e a variável 'i' é incrementada para 2.
> Agora, a variável 'i' tem o valor 2.

- No terceiro ciclo, será feito a mesma coisa, mas desta vez, a nossa expressão será: `i (2) é menor do que 3?`. </br> E la será avaliada como __verdadeira__, pois '2' é menor do que três. Então o bloco é executado novamente, e a variável 'i' é incrementada para 3.

- Novamente, será feito a mesma coisa, mas desta vez, a nossa expressão será: `i (3) é menor do que 3?`. Ela será avaliada como __falsa__, pois '3' __não__ é menor do que três. Então nosso bloco é não executado e o laço é finalizado. 
