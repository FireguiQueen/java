# Array
Como foi explicado anteriormente, "Variávei é um conceito, essencialmente, abstrato. Utilizamos a palavra 
"variávei" para dizer que determinado identificador está armazenando um valor. Mas o que realmente ocorre, 
é que, é pego um espaço em memória RAM, e este espaço possui um endereço. Para nos referimos a este 
endereço, utilizamos o identifificador definido anteriormente. E após isto, atribuimos um valor a este 
identificador, que por sua vez, se refere ao endereço em memória RAM."

Disto isto, array é uma variável especial. Um __único__ espaço em memória RAM capaz de armazenar uma __coleção (conjunto) de dados__. Em suma, podemos pensar em um array como uma lista.

## Sinxtaxe 
Os valores de um array são conhecidos como __elementos__, e suas posições
são chamadas de __índices__. Os indices começam em 0, isto é, caso o array possua 10 elementos, ele terá 9 indices.
```
Como podemos ver, são 9 indicies, e 10 elementos. 

[indice 0] = 1º elemento. 
[indice 1] = 2º elemento. 
[indice 2] = 3º elemento. 
[indice 3] = 4º elemento. 
[indice 4] = 5º elemento. 
[indice 5] = 6º elemento. 
[indice 6] = 7º elemento. 
[indice 7] = 8º elemento. 
[indice 8] = 9º elemento. 
[indice 9] = 10º elemento. 
```

### Array normal
Utilizando uma forma básica de definir um array, basta criar uma variável comum, e colocar os colchetes ao lado do tipo de dado.
E após isto, podemos colocar nossa coleção de dados naqueel espaço em memória. 
```java
    int[] numeros = {0, 1, 2};
```
> Arrays do tipo `int` só podem armazenar um valor que seja inteiro. A mesma coisa vale para variáveis. Neste caso, ela é do tipo `int`, nossa coleção de dados só pode ser numeros inteiros. 

### Array multidimensional
Um array multidimensional se trata de um array que contém outros arrays. É um array de arrays, como se fosse uma lista, e cada elemento desta lista, representa uma nova lista.
```java
    int[][] numeros = { {10, 20, 30}, {40, 50, 50}, {70, 70, 80}}
```

## Acessando seus elementos
Para acessar o elemento de um array, basta colocar o identificador do array e o indice do elemento.
```java
    char[] letras = {'a', 'b', 'c'}; // criando um array.
    letras[0]; // acessando o indice 0 do array. Retorna o primeiro elemento, a letra 'a'.
```

No caso de um array bidimensional, você precisa colocar o identificador do array, escolher um de seus arrays e seu elemento.
```java
    char[][] letras = { {'a', 'e', 'i', 'o', 'u'}, {'b', 'c', 'd', 'f'}}; // criando um array. Seus elementos apontam para outros arrays.
    letras[0][2]; // acessando o indice 0 do array, retorna um endereço de outro array. Agora, [2], retorna o segundo indice deste array, que é 'i'.
```
___

# Iterando um array 
Iterar (percorrer) um array de forma inteligente é bem simples, basta definir um array.
```java
    int[] notas = {10, 8, 7, 9};
```

Nós já sabemos quantos elementos existem, basta observar e você contará 4. Mas, isto não é uma forma muito eficiente, pois se existissem muitos elementos, teriamos que contar. 
Para isto, podemos utilizar uma propriedade chamada `length`, "comprimento", em português.
```java
    int comprimentoDoArray = notas.length; 
```

E utilizar uma estrutura de repetição, fazendo com que ela comece em 0 e vá até o numero total de elementos. 
```java
    for (int i = 0; i <= comprimentoDOArray; i++)
    {
        System.out.print(notas[i]);
    }
```

