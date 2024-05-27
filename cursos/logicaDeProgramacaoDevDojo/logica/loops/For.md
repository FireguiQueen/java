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

Na primeira iteração (repetição), `i` vale 0. Será perguntando: `i` é menor que 10? 
A resposta é `true`, então as instruçõs do bloco são executadas. 

Na segunda iteração, `i` vale 1. Será perguntando: `i` (1) é menor que 10?
A resposta é `true`, então as instruçõs do bloco são executadas.