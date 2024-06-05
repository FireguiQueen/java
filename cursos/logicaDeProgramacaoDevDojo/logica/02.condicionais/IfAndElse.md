# `IF`
A palavra 'if', em português, significa "se". O intuito deste comando nas linguagens de programação é ser utilizado para avaliar condições. O `if` tem seu próprio escopo, isto é, seu próprio bloco. 

__Se__ a nossa condição que fica dentro dos parênteses for avaliada como __verdadeira__, nossas instruções dentro do bloco do `if` serão executadas.

```java
    if (50 > 10) // esta condição é avaliada como verdadeira pois 50 é maior que 10.
    {
      System.out.println("Sim, 50 é maior que 10.");          
    }
```

_________________

# `ELSE`
A palavra 'else', em português, significa "senão". Quando juntos o `if` e o `else`, podemos pensar na frase:
"Excute este bloco, senão, execute este aqui". 

Em suma, se condição do `if` for avaliada como falsa, o else __será__ executado. 
E caso a condição do `if` seja avalaida como 'verdadeira', o else __não será__ executado.

```java
    if (10 > 20) // esta condição é avaliada como false pois 10 não é maior que 20.
    {
        System.out.println("Esta mensagem jamais será printada.");
    } else
    {
        System.out.println("10 não é maior que 20.");        
    }
```

_________________

# `ELSE IF` 
Até agora, parece que só sabemos fazer duas coisas em um programa: executar uma ação se uma condição for verdadeira, ou executar outra ação se for falsa. Em outras palavras, temos apenas duas possibilidades: faça isso ou faça aquilo.

O propósito do else if é adicionar mais condições dentro de uma estrutura condicional. O termo 'else if' pode ser traduzido como "senão se". Embora possa parecer confuso à primeira vista, é simplesmente uma combinação de 'else' e 'if'. O 'else' é usado para indicar o que deve ser feito se a condição anterior for falsa, enquanto o 'if' especifica uma nova condição. Se essa nova condição também for falsa, passamos para o próximo 'else if' ou 'else', e assim por diante.

```java
    short idade = 30;

    if (idade < 18)
    {
        System.out.print("Menor de idade");
    }
    else if (idade >= 18 && idade < 60)
    {
        System.out.print("Adulto");
    }
    else if (idade >= 60)
    {
        System.out.print("Idoso");
    } else {
        System.out.print("Idade inválida!");
    }
```

> Podemos observar que utilzamos o `if` para definir a estrutura condicional. O `else if` foi para definir outras condições, e caso nenhuma delas seja executada, o nosso `else` será executado. 



