# `For`
Assim como o `while`, nós utilizamos o `for` para criar estruturas
de repetição. 

## Sintaxe 
Começamos a estrutura com `for()`. Dentro dos parentesis, colocaremos 3 coisas:
1. Variável de controle. Geralmente começa em 0. 
2. Condição que determina se o bloco de instruções será executado ou não.
3. Alteração no valor da variável de controle. 

```java
    for(int i = 0; i < 10; i++)
    {
        System.out.print(i);        
    }
```

## Entendendo a estrutura passo-a-passo
Na primeira iteração (repetição), a variável `i` vale 0. Será perguntado: `i` é menor que 10? <br>
A resposta é `true`; pois 0 é menor que 10. Então as instruções do bloco de instruções é executado.

Na segunda iteração (repetição), `i` vale 1. Será perguntado: `i` é menor que 10? <br>
A resposta é `true`; pois 1 é menor que 10. Então as instruções do bloco de instruções é executado.

As repetições irão ocorrer até chegar a um ponto onde `i` vale 10. Então será perguntado: `i` é menor que 10? 
A resposta é `false`; pois 10 não é menor que 10 (é impossível um número ser menor do que ele mesmo). 
Então o loop é encerrado. Isto é, o loop só vai ocorrer de 0 a 9 (10 vezes).

