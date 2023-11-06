# Introdução
Não haverá explicações sobre a estrutura das coisas, apenas regras de sintaxe.

</br>

## Variáveis
- Escolha um tipo de dado;
- Defina um identificador (nome do array);
- Defina um valor. Este valor precisa ser do mesmo tipo de dado que foi definido na etapa 1.
> Este valor da variável pode ser tanto um valor normal quanto uma expressão. Uma expressão é a junção de números e operadores. Por exemplo: '5 > 5'. Esta é uma expressão, e como estamos usando um operador de comparação, ele retornará para nós um valor boolean: 'true' ou 'false'. Não se engane, variáveis normais __não__ podem armazenar mais um valor, o que elas podem fazer é possuir uma expressão, e esta expressão retornará um valor único para elas. 
```java
    int x = 50; // variável x recebe 50.
    int z = 100 - 50 // variável z recebe uma expressão. Esta expressão retorna 50 a variável. 
    boolean y = 50 > 50 // variável y recebe uma expressão. Esta expressão retorna 'false' a variável.
``` 

</br>

## Array

#### 1.
1. Defina o tipo de dado do vetor, e ao lado, coloque colchetes para especificar que estamos criando um array;
2. Defina um identificador (o nome para o nosso vetor);
3. Defina seus valores. Eles precisam ser do mesmo tipo de dado que foi definido na etapa 1.
```java
    int[] identificador = {500, 200, 100};
```

#### 2.
1. Defina o tipo de dado do vetor, e ao lado, coloque colchetes para especificar que estamos criando um array;
2. Defina um identificador (o nome para o nosso vetor);
3. Defina uma instância, e ao lado, coleque colchetes. Dentro deles, coloque o número máximo de elementos que o array pode conter.
```java
    int[] identificador = new int[10]; 
```