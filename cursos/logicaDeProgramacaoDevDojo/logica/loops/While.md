# `While`
"While", em português, significa "enquanto". A proposta do `while` é ser utilizado para criar laços de repetição, isto é, instruções que são executadas até que sua expressão se torne `false`.

O `while` continuará a executar as instruções __enquanto__ a expressão for verdadeira. Neste exemplo, nossa instrução se executará __infinitamente__ pois a expressão passada para o `while` sempre será verdadeira.

```java
    while (true) // true sempre será true.
    {
        System.out.println("Olá!");
    }
```

## Definindo limites de repetição
Podemos definir quantas vezes nossa instrução será executada.
Para isso, criaremos uma variável chamada `contador` que recebe o valor de __0__. Na expressão do `while`, será perguntado
"contador é menor que 10?"; a questão é que a variável contador sempre será menor que 10, pois o valor desta 
variável está travado em 0. Para solucionar este problema, sempre que as intruções do `while` forem
executadas, este contador receberá +1 ao seu valor. 

```java
    byte contador = 0;
    while (contador < 10)
    {
        System.out.println(contador);
        contador = contador + 1; // contador recebe ele mesmo + 1. 
    }
```
> Com isso, nosso algoritimo acima printará no terminal: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. 

___________________

# `Do-while`
O `do while` é bem parecido com o `while`, mas há uma pequena diferença: o `do while` executará
nossas instruções e depois verificará se a expressão é verdadeira.

Então, mesmo que nossa expressão seja `false`, nossas instruções serão executadas ao menos uma vez.

```java
    do 
    {
        System.out.print("A expressão é falsa, mas eu serei executado!");
    } while (false);
```