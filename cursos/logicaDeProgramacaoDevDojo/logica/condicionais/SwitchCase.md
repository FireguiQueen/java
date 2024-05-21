# `Switch` `case`
Assim como o `if/else`, o `switch case` também é utilizado para 
se criar estruturas condicionais, mas há algumas nuances entre eles.

Na estrutura do `switch case`, nós definimos um valor, e depois perguntamos
se o valor de algum `case` é __igual__ ao valor especificado no `switch`.

# Por que se chama "switch case"?
A palavra "switch", vem da ideia de que o fluxo de controle "muda" de um caso para outro, dependendo do 
valor da expressão. É como se o programa "mudasse de trilha" ou "trocasse de direção" dependendo da condição 
encontrada. Já o termo "case" refere-se aos _casos_. "Caso seja o valor do `switch` seja 1, então execute isto.."  


## Estruturação
1. Especificar um valor entre parênteses após a palavra `switch`. Este valor será utilizado como base para comparações de igualdade;
2. Definir __casos__ utilizando a palavra-chave `case`. Os valores especificados nos casos serão comparados com a expressão fornecida no switch. Se houver correspondência entre o valor do caso e o valor do switch, as instruções associadas a esse caso serão executadas.
```java
    switch (3) // valor que será utilizado como base para comparações de igualdade. 
    {
        case 1: 
            System.out.print("Você tem 1 vida restante");
            break;
            
        case 2:
            System.out.print("Você tem 2 vidas restantes");
            break;
            
        case 3:
            System.out.print("Você tem 3 vidas restantes");
            break;
        
        default:
            System.out.print("Você tem 0 vidas restantes");
    }
```

A ideia do nosso algorítimo acima é simples: caso algum valor entre os `case` seja
__igual__ valor passado para o paretensis do `switch`, as linhas de instrução
daquele caso será executado. 

> A palavra "switch" vem da ideia de que o fluxo de controle "muda" de um caso para outro, dependendo do valor da expressão. É como se o programa "mudasse de trilha" ou "trocar de direção" dependendo da condição encontrada. Já o termo "case" (ou "caso", em português) refere-se a cada uma das opções que você pode definir dentro do switch, cada uma correspondendo a um valor possível da expressão avaliada.

_________________________________

## Qual a utilidade do `break` em cada bloco de `case`?
O break instrui o programa a sair do switch após a execução do bloco de código do case correspondente.

Se você não colocar o break ao final de um bloco de um case, o programa continuará executando os blocos de código subsequentes até encontrar um break ou alcançar o fim do switch.

## Qual a utilidade do `default`?
"Default" significa "padrão". O `default` é um _caso_ padrão que será executado quando nenhum dos `cases` anteriores corresponder ao valor da expressão passada para o `switch`.

Em teoria, o `default` é o **caso padrão**, ou seja, um caso que "sempre" será executado se nenhum outro caso corresponder. No entanto, o `default` não será executado se um `case` correspondente for encontrado e conter a palavra-chave `break`, que interrompe a execução do `switch`.

_________________________________

## Por que usar `switch case` se temos `if, else if e else`
A resposta é simples: **legibilidade**. O `switch case` foi criado **especificamente** para trabalhar com condições de igualdade; se um valor for igual a este, faça isto. Sim, também podemos utilizar o `if/else` para condições de igualdade, mas o código escrito fica bem menos legível.


