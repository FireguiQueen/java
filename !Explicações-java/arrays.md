# Arrays 
Os arrays, também conhecidos como "vetores", são variáveis especiais capazes de armazenar um ou mais valores.

Os arrays são extremamente úteis quando você precisa lidar com coleções de dados, como armazenar uma lista de nomes, números ou qualquer tipo de informação que possa ser representada como um conjunto de elementos do mesmo tipo.

Pense em um array como uma lista, onde você pode armazenar diversos valores de um determinado tipo. Os valores armazenados nessa "lista" são chamados de elementos. Esses elementos podem ser acessados por meio de uma indicação específica, que chamamos de índice.
> É importante lembrar que um array é uma variável capaz de armazenar mais de um valor, e, portanto, é necessário definir o tipo de dado que essa variável irá conter. O array só pode armazenar valores do tipo de dado indicado.

</br>

## Criando um array
Existem duas formas de criarmos um array. 

#### 1. Nesta abordagem, definimos um array e preenchemos _diretamente_ com seus valores.
- Começamos especificando o tipo de dado (`String`) e, ao lado, colocamos colchetes `[]`.
- Colocamos um identificador ao nosso array. 
- Em seguida, definimos os valores que ele conterá.     
```java
    String[] listaDeNomes = {"João", "Paulo", "Guilherme"}; 
```

##### Acessando valores 
Para acessar os valores de um vetor, utilizamos os índices. O índice indica a posição do elemento dentro do nosso array. Em resumo, _cada elemento dentro de um array possui um índice_. O índice 0 (zero), ou "posição" 0, representa o primeiro elemento do array, ou seja, o primeiro valor. O índice 1 (um) representa o segundo elemento do array, e assim por diante.

Para acessar um elemento por meio do seu índice, devemos usar o identificador do nosso array, seguido de colchetes `[]`. Dentro dos colchetes, especificamos o índice desejado.

Neste exemplo, estamos acessando o índice 0 do nosso array. O índice 0 corresponde ao primeiro elemento.
```java
    listaDeNomes[0]; // João
```

</br>

#### 2. Nesta abordagem, criamos um array _vazio_ para posteriormente atribuir valores.
- Começamos especificando o tipo de dado (`String`) e, ao lado, colocamos colchetes `[]`.
- Colocamos um identificador ao nosso array. 
- Em seguida, realizamos uma instância do objeto `String`, adicionando colchetes ao lado e especificando quantos elementos poderão ser armazenados neste array.
> Este método pode parecer um pouco mais complexo, pois envolve a compreensão de alguns conceitos. No entanto, podemos dizer que estamos apenas criando um array vazio e definindo o limite de elementos que ele pode conter. Se tentarmos adicionar mais elementos do que o permitido, ocorrerão erros.

```java
     String[] listaDeNomesVazia = new String[3];
```

##### Acessando e atribuindo valores
Aprendemos como acessar os valores de um array. No entanto, o array que criamos ainda não possui valores definidos. Portanto, precisamos escolher um índice e atribuir um valor a ele.

Para isso, utilizamos o identificador do nosso array, seguido por colchetes `[]`. Dentro dos colchetes, especificamos o índice ao qual desejamos atribuir um valor. Em seguida, usamos o operador de atribuição (=) para associar um valor.
> É importante notar que, como nosso vetor é um vetor de strings, o valor atribuído __deve__ ser uma string.
```java
    listaDeNomesVazia[0] = "Paulão"; // atribuindo o valor "Paulão" ao indice 0. 
    listaDeNomesVazia[1] = "Julia";  // atribuindo o valor "Julia" ao indice 1.
    listaDeNomesVazia[2] = "Pedro";  // atribuindo o valor "Pedro" ao indice 2. 
```

Pronto, agora nossos valores já forão atribuidos aos indices que estavam vázios. 
E também, podemos observar que, nosso array está armazenando três elementos: `"Paulão", "Julia" e "Pedro"`.
Isto significa que, não podemos colocar mais elementos, afinal, foi definido que nosso array iria conter no __máximo__ três elementos. 

Sabendo-se disso, sabemos que não poderíamos fazer isso: 
```java
    // RETORNA ERRO. 

    // atribuindo o valor "Rodrigo" ao indice 3, mas este indice não existe. 
    listaDeNomesVazia[3] = "Rodrigo"; 
```

Agora podemos acessar os valores que definimos. 
```java
    listaDeNomesVazia[0]; // Paulão
    listaDeNomesVazia[1]; // Julia
    listaDeNomesVazia[2]; // Pedro
```


### Definir um array e tentando acessar seus valores
O que acontece se definirmos um array e não definirmos seus elementos? A resposta pode mudar um pouco de acordo com o tipo de dado definido. 
- Se criarmos um array do tipo `byte`, `short`, `int`, `long`, `double` ou`float` sem definir seus elementos, o valor padrão será '0' caso a gente tente acessar o valor;
- Se criarmos um array do tipo `boolean` sem definir seus elementos, o valor padrão será 'false';
- Se criarmos um array de Strings sem definir seus elementos, o valor padrão será o caracter nulo. 

Neste exemplo, usaremos o `int`, ou seja, é um vetor que armazena apenas números inteiros.
- Foi definido que este array pode conter no máximo dois elementos.  
```java
    int[] listaNumeros = new int[2];  

    // acessa o indice 1 do array (segundo elemento). 
    listaNumeros[0]; // retorna 0 
```

Neste exemplo, usaremos o `boolean`, ou seja, é um vetor que armazena apenas valores booleanos (false ou true).
```java
    boolean[] listaNumeros = new boolean[2];  

    // acessa o indice 0 do array (primeiro elemento). 
    listaNumeros[0]; // retorna false 
```

_______________________________________________________________

# Iterando um array
Iterar um array nada mais é do que _percorrer um array_, ou seja, ser capaz de ir de elemento por elemento. 

