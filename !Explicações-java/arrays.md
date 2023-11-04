# Arrays 
Os arrays, também conhecidos como "vetores" são variáveis especiais, que são capazes de armazenar um ou mais valores. 

Os arrays são muito úteis quando você precisa trabalhar com coleções de dados, como armazenar uma lista de nomes, números, ou qualquer tipo de informação que possa ser representada como um conjunto de elementos do mesmo tipo.

Pense num array como uma lista, e nesta lista, você pode guardar diversos valores de um determinado tipo. 
Os valores armazenados nesta "lista" são chamados de elementos. Esses elementos podem ser acessados por um tipo de indicação, que chamamos de índice.
> Vale lembrar que um array é uma variável capaz de armazenar mais de um valor, e, portanto, você precisa definir o tipo de dado que esta variável irá conter. O array só poderá armazenar valores do tipo de dado indicado.

</br>

## Criando um array
Existem duas formas de criarmos um array. 

#### 1. Nesta forma, definimos um array e _diretamente_ colocamos seus valores.
- Definimos o tipo de dado (`String`) e ao lado colocamos os colchetes _[]_. 
- Colocamos um identificador ao nosso array. 
- E por fim, dizemos que será recebido uma coleção de dados. 
```java
    String[] listaDeNomes = {"João", "Paulo", "Guilherme"}; 
```

##### Acessando valores 
Para acessarmos valores, iremos trabalhar com os índices. O índice indica a posição do elemento dentro do nosso array. Resumidamente, _cada elemento dentro de um array terá seu indice_. O índice 0 (zero), ou 'posição' 0, indica nosso primeiro elemento do array, ou seja, nosso primeiro valor. O índice 1 (um) indica nosso segundo elemento do array, e assim por diante. 

Para acessar um elemento através de seu índice, iremos colocar o identificador do nosso array, e ao seu lado, será colocado colchetes _[]_. Dentro dos colchetes, colocaremos um índice.

Neste exemplo, estamos acessando o índice 0 do nosso array. O indice 0 se refere ao primeiro elemento. 
```java
    listaDeNomes[0]; // João
```

</br>

#### 2. Nesta forma, definos um array _vazio_ para atribuir seus valores futuramente. 
- Definimos o tipo de dado (`String`) e ao lado colocamos os colchetes _[ ]_. 
- Colocamos um identificador ao nosso array. 
- E por fim, fazemos uma instância do objeto `String`, colocando colchetes ao lado e informando quantos elementos poderão haver neste array. 
> Este jeito pode parecer um pouco mais confuso, pois é necessário entender alguns conceitos. Mas apenas saiba que foi criado um array vazio, e definido quantos elementos podem existir dentro deste array. Se tentarmos colocar mais elementos do permitido, teremos erros. 

```java
     String[] listaDeNomesVazia = new String[3];
```

##### Acessando e atribuindo valores
Já aprendemos como acessar os valores de um array. Mas este array que criamos acima, ainda não possui valores definidos. Então, o que precisamos fazer é, escolher um indice e atribuir um valor a ele. 

Iremos colocar o identificador do nosso array, e ao seu lado, será colocado colchetes _[ ]_. Dentro dos colchetes, colocaremos o índice que desejamos atribuir um valor. Por fim, basta colocar o sinal de atribuição (=) e colocar um valor. 
> Este valor precisa ser uma String, pois nosso vetor é um vetor de strings. 
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
 
