# Operadores de comparação 
Operadores de comparação têm um único objetivo: responder "__true__" ou "__false__".

Os operadores de comparação na computação funcionam exatamente como na vida real. Quando escrevem
em um quadro branco a seguinte expressão `10 > 5` e te perguntam a resposta objetiva, você só
poderá responder com "sim" ou "não". Neste caso, a resposta correta é __sim__, pois esta expressão pergunta
se 10 é maior que 5. 

Desta forma, ao utilizarmos esses operadores, a única forma de salvar este output será
colocando uma variável do __tipo boolean__.

__________________

## `==` (igualdade)
Operador de igualdade. Serve para perguntarmos se o valor a esquerda é __igual__ ao valor a direita.
```java
    System.out.print(5 == 5);   // TRUE.
    System.out.print(99 == 99); // TRUE.    
    System.out.print(1 == 5);   // FALSE. 
```

<br>

## `!=` (diferente)
Operador de diferença. Serve para perguntarmos se o valor a esquerda é __diferente__ ao valor a direita.
```java
    System.out.print(5 != 5);    // FALSE. (5 não é diferente de 5. Pense que você tem a mesma altura de uma pessoa, suas alturas são diferentes? não)
    System.out.print(10 != 100); // TRUE.    
    System.out.print(-1 != 1);   // TRUE. 
```

<br>

## `>` (maior)
Operador de "maior". Serve para perguntamos se o valor a esquerda é __maior__ que o valor a direita.
```java
    System.out.print(4 > 1);  // TRUE
    System.out.print(5 > 10); // FALSE
    System.out.print(5 > 5);  // FALSE. (5 não é maior que 5. Pense que você tenha a mesma altura que uma pessoa, você é maior que ela? não)
```

<br>

## `<` (menor)
Operador de "menor". Serve para perguntamos se o valor a esquerda é __menor__ que o valor a direita.
```java
    System.out.print(4 > 1);  // FALSE
    System.out.print(5 > 10); // TRUE
    System.out.print(5 > 5);  // FALSE. (5 não é menor que 5. Pense que você tenha a mesma altura que uma pessoa, você é menor que ela? não)
````

<br>

## Mesclando operadores: `>=` e `<=` 
Podemos também perguntar se o número a esquerda é __maior__ _ou_ __igual__ ao operador a direita.
```java
    System.out.print(4 >= 4);  // TRUE. (pois 4 é igual a 4)
    System.out.print(5 >= 3);  // TRUE. (pois 5 é maior que 3)
    System.out.print(5 >= 10); // FALSE.
````

E claro, também podemos fazer a mesma coisa com o operador de "menor".
```java
    System.out.print(4 <= 4);  // TRUE. (pois 4 é igual a 4)
    System.out.print(4 <= 10); // TRUE. (pois 4 é menor que 10)
    System.out.print(5 <= 3);  // FALSE. 
````