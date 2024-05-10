# `IF`
A palavra 'if', em português, significa "se". O intuito deste comando nas linguagens de programação é ser utilizado para avaliar condições. O `if` tem seu próprio escopo, isto é, seu próprio bloco. 

__Se__ a nossa condição que fica dentro dos parênteses for avaliada como __verdadeira__, nossas instruções dentro do bloco do `if` serão executadas.

```java
    if (50 > 10) // esta condição é avaliada como verdadeira pois 50 é maior que 10.
    {
      System.out.println("Sim, 50 é maior que 10.");          
    }
```

# `ELSE`
A palavra 'else', em português, significa "senão". Quando juntos o `if` e o `else`, podemos pensar na frase:
"Excute este bloco, senão, execute este aqui". 

Em suma, se condição do `if` for avaliada como falsa, o else __será__ executado. 
E caso a condição do `if` seja avalaida como 'verdadeira', o else __não será__ executado.

```java
    /** <h1>HII</h1> */
    if (10 > 20) // esta condição é avaliada como false pois 10 não é maior que 20.
    {
        System.out.println("Esta mensagem jamais será printada.");
    } else
    {
        System.out.println("10 não é maior que 20.");        
    }
```


