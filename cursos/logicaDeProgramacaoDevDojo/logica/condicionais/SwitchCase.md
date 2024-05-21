# Switch case
Assim como o `if.. else if.. else`, o `switch case` também é utilizado para 
se criar estruturas condicionais, mas há algumas nuances entre eles.

O `switch case` é utilizado para especificar um valor, e perguntar se alguns dos casos
é __igual__ ao valor especificado no `switch`.

## Estruturação
1. Especificar um valor entre parênteses após a palavra switch. Este valor será utilizado como base para comparações de igualdade;
2. Definir casos utilizando a palavra-chave case. Os valores especificados nos casos serão comparados com a expressão fornecida no switch. Se houver correspondência entre algum caso e a expressão, as instruções associadas a esse caso serão executadas.
```java
    switch (5) // valor que será utilizado como base para comparações de igualdade. 
    {
        case 1: 
            System.out.print("Você tem");
    }
```

<br>

