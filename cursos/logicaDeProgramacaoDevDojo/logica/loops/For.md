# `For`
Assim como o `while`, nós utilizamos o `for` para criar estruturas
de repetição. 

## Sintaxe 
Começamos a estrutura com `for()`. Dentro dos parentesis, colocaremos 3 coisas:
1. Variável de controle. Geralmente começa com 0. 
2. Condição que determinada se a estrutura vai ser executada ou não.
3. Alteraçõa no valor da variável de controle. 

```java
    for(int i = 0; i < 10; i++)
    {
        System.out.print(i);        
    }
```
Na primeira iteração (repetição), `i` vale 0. Será perguntado: `i` é menor que 10?
A resposta é `true`, então as instruções do bloco são executadas.

Na segunda iteração, `i` vale 1. Será perguntado: `i` (1) é menor que 10?
A resposta é `true`, então as instruções do bloco são executadas.

Essa iteração vai ocorrer até chegar a um ponto onde `i` vale 10. Então será perguntado:
i (10) é menor que 10? A resposta é false, então o loop é encerrado. Isto é, o loop só vai ocorrer de 0 a 9 (10 vezes.)

