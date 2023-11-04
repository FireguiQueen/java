#### Sumário
[Arrays](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#criando-um-array") &nbsp; | &nbsp;
[Arrays multidimensionais](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#arrays-multidimensionais) &nbsp; | &nbsp;
[Iterando arrays](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#iterando-um-array) 

______________________________________________


# Arrays 
Os _arrays_, também conhecidos como _"vetores"_, são variáveis especiais capazes de armazenar um ou mais valores.

Os arrays são extremamente úteis quando você precisa lidar com coleções de dados, como armazenar uma lista de nomes, números ou qualquer tipo de informação que possa ser representada como um conjunto de elementos do mesmo tipo.

Pense em um array como uma lista, onde você pode armazenar diversos valores de um determinado tipo. Os valores armazenados nessa "lista" são chamados de __elementos__. Esses elementos podem ser acessados por meio de uma indicação específica, que chamamos de índice.
> É importante lembrar que um array é uma variável capaz de armazenar mais de um valor, e, portanto, é necessário definir o tipo de dado que essa variável irá conter. O array só pode armazenar valores do tipo de dado indicado.

</br>

## Sintaxe
Existem duas formas de criarmos um array. 

#### 1. Nesta abordagem, definimos um array e preenchemos _diretamente_ com seus valores.
- Começamos especificando o tipo de dado (`String`) e, ao lado, colocamos colchetes `[]`.
- Colocamos um identificador `(listaDeNomes)` ao nosso array. 
- Em seguida, definimos os valores que ele conterá.     
```java
    String[] listaDeNomes = {"João", "Paulo", "Guilherme"}; 
```

##### Acessando valores 
Para acessar os valores de um vetor, utilizamos os índices. O índice indica a posição de um determinado elemento dentro do nosso array. Em resumo, _cada elemento dentro de um array possui um índice_. O índice 0 (zero), ou "posição" 0, representa o primeiro elemento do array, ou seja, o primeiro valor. O índice 1 (um) representa o segundo elemento do array, e assim por diante.

Para acessar um elemento por meio do seu índice, devemos usar o identificador do nosso array, seguido de colchetes `[]`. Dentro dos colchetes, especificamos o índice desejado.

Neste exemplo, estamos acessando o índice 0 do nosso array. O índice 0 corresponde ao primeiro elemento.
```java
    listaDeNomes[0]; // João
```

</br>

#### 2. Nesta abordagem, criamos um array _vazio_ para posteriormente atribuir valores.
- Começamos especificando o tipo de dado (`String`) e, ao lado, colocamos colchetes `[]`.
- Colocamos um identificador `(listaDeNomesVazia)` ao nosso array. 
- Em seguida, realizamos uma instância do objeto `String`, adicionando colchetes ao lado e especificando quantos elementos poderão ser armazenados neste array.
> Este método pode parecer um pouco mais complexo, pois envolve a compreensão de alguns conceitos. No entanto, podemos dizer que estamos apenas criando um array vazio e definindo o limite de elementos que ele pode conter. Se tentarmos adicionar mais elementos do que o permitido, ocorrerão erros.

```java
     String[] listaDeNomesVazia = new String[3];
```

##### Acessando e atribuindo valores
Já aprendemos como acessar os valores de um array. No entanto, o array que criamos logo acima ainda não possui valores definidos. Portanto, precisamos escolher um índice e atribuir um valor a ele.

Para isso, utilizamos o identificador do nosso array `(listaDeNomesVazia)`, seguido por colchetes `[]`. Dentro dos colchetes, especificamos o índice ao qual desejamos atribuir um valor. Em seguida, usamos o operador de atribuição (=) para associar um valor.
> É importante notar que, como nosso vetor é um vetor de strings, o valor atribuído __deve__ ser uma string.
```java
    listaDeNomesVazia[0] = "Paulão"; // atribuindo o valor "Paulão" ao indice 0. 
    listaDeNomesVazia[1] = "Julia";  // atribuindo o valor "Julia" ao indice 1.
    listaDeNomesVazia[2] = "Pedro";  // atribuindo o valor "Pedro" ao indice 2. 
```

Agora podemos acessar os valores que definimos.
```java
    listaDeNomesVazia[0]; // Paulão
    listaDeNomesVazia[1]; // Julia
    listaDeNomesVazia[2]; // Pedro
```

</br>

Agora, nossos valores foram atribuídos aos índices previamente vazios. Observamos que nosso array está armazenando três elementos: "Paulão", "Julia" e "Pedro". Isso significa que não podemos adicionar mais elementos, já que definimos que nosso array pode conter no __máximo__ três elementos (`new String[3]`).

Consequentemente, não podemos realizar a seguinte ação:
```java
    // RETORNA ERRO. 

    // atribuindo o valor "Rodrigo" ao índice 3, mas este índice não existe.
    listaDeNomesVazia[3] = "Rodrigo";
```

</br>
</br>

## Acessando elementos que não foram definidos
O que ocorre se definirmos um array e não atribuirmos valores a seus elementos? _A resposta pode variar de acordo com o tipo de dado definido._

- __Se criarmos um array do tipo `byte`, `short`, `int`, `long`, `double` ou `float` sem atribuir valores a seus elementos, o valor padrão será '0' se tentarmos acessá-lo.__
```java
    int[] listaNumeros = new int[2];  

    // acessa o indice 1 do array (segundo elemento). 
    listaNumeros[1]; // retorna 0 
```

- __Se criarmos um array do tipo `boolean` sem atribuir valores a seus elementos, o valor padrão será 'false'.__
```java
    boolean[] listaNumeros = new boolean[2];  

    // acessa o indice 0 do array (primeiro elemento). 
    listaNumeros[0]; // retorna false 
```


</br>
</br>


# Iterando um array
- Leitura recomendada: <a href="https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/loops.md">loops</a> 

Iterar um array nada mais é do que _percorrer um array_, ou seja, ser capaz de ir de elemento por elemento. 
Para fazer a iteração, vamos precisar de um laço de repetição. Para esta explicação, usaremos o `for loop`. 

Para iterar um array, obviamente precisamos de um array. Então vamos definir um: 
```java
String[] listaNomes = {"João", "Pedro", "Paulo"};
```

Outra coisa extremamente importante é criar uma variável que armazene a quantidade de elementos que o nosso array contém.
> Claro, é possível fazer isso manualmente, mas não é uma _boa prática_, uma vez que o nosso código __não__ seria dinâmico."
```java
int quantidadeElementos = listaNomes.length; // retorna 3, pois há 3 elementos no vetor "listaNomes". 
```

Vamos criar um laço de repetição onde a variável de controle se inicia com o valor '0', e a cada execução do laço, adicionamos +1 à nossa variável. </br>
Agora, vem o segundo passo, que é definir uma condição para o nosso laço. A ideia é que enquanto a nossa variável de controle (i) for menor do que a quantidade de elementos do array, o laço deve continuar sendo executado. Nossa condição em pseudo-código é a seguinte: 
- `Variável i é menor do que quantidadeElementos?` `Sim? (true)`  > `execute o bloco` | `Não? (false)` > `saia do laço de repetição`

```java 
    for (int i = 0; i < quantidadeElementos; i++)
    {
        System.out.println(listaNomes[i]);
    }
```

##### Entendendo passo-a-passo. 
No primeiro ciclo de execução, ou seja, a primeira vez que o `for loop` ser executado, é criado uma variável de controle (i), e é definido e seu valor (0) 

Agora, chegamos à condição, onde a pergunta é: `i (0) é menor do que quantidadeDeElementos (3)?` </br>
Esta condição é avaliada como "verdadeira" porque i (0) é menor do que a quantidade de elementos do array (3). 
```java
    System.out.println(listaNomes[0]); // retorna "João", pois é o valor do índice 0. 
``` 
> Após a execução de todas as linhas do laço, a nossa variável de controle (i) é __incrementada__ em +1. Sendo assim, após este primeiro ciclo de execução, nossa variável terá o valor de '1'.


Novamente, chegamos à condição, onde a pergunta é: `i (1) é menor do que quantidadeDeElementos (3)?` </br>
Esta condição é avaliada como "verdadeira" porque i (1) é menor do que a quantidade de elementos do array (3).
```java
    System.out.println(listaNomes[1]); // retorna "Pedro", pois é o valor do índice 1. 
``` 
> Após a execução de todas as linhas do laço, a nossa variável de controle (i) é __incrementada__ em +1. Sendo assim, após este segundo ciclo de execução, nossa variável terá o valor de '2'.


Novamente, chegamos à condição, onde a pergunta é: `i (2) é menor do que quantidadeDeElementos (3)?` </br>
Esta condição é avaliada como "verdadeira" porque i (2) é menor do que a quantidade de elementos do array (3).
```java
    System.out.println(listaNomes[2]); // retorna "Paulo", pois é o valor do índice 2. 
``` 
> Após a execução de todas as linhas do laço, a nossa variável de controle (i) é __incrementada__ em +1. Sendo assim, após este bloco ser executado, nossa variável terá o valor de '3'.

</br>
</br>

Novamente, chegamos à condição, onde a pergunta é: `i (3) é menor do que quantidadeDeElementos (3)?`
Esta condição é avaliada como "falsa" porque i (3) não é menor do que a quantidade de elementos do array (3).

Esta última parte é importante, porque se tivéssemos utilizado o operador <= em vez de "<", o valor 3 seria igual a 3, e o bloco seria executado, resultando em:
```java
    System.out.println(listaNomes[3]); // retornaria um erro, já que esse índice não existe.
```
> Ao usar o operador < (menor que) na condição (i < quantidadeDeElementos), você garante que o loop for para quando a variável de controle "i" atingir o último elemento válido do array, evitando acessar índices que não existem.

> Se você usasse o operador <= (menor ou igual a), o loop continuaria mesmo quando "i" fosse igual ao número de elementos, o que levaria a tentativas de acesso a índices inexistentes, resultando em erros. Portanto, a escolha do operador < é importante para evitar erros de índice fora dos limites.


</br>

_______________________________________________________________

# Arrays multidimensionais
Um array multidimensional é semelhante a um array normal, mas com uma diferença crucial. Enquanto um array normal contém elementos do tipo de dado especificado, um array multidimensional possui outros arrays como seus elementos.

### Arrays normais x multidimensionais

- Se definirmos um array normal do tipo `int`. Os elementos deste array serão números inteiros.
```java
    int[] listaNumero = {500, 200, 100, 25};
```

- No entanto, se definirmos um array de arrays, os elementos do array principal serão outros arrays. Dentro desses arrays secundários, encontraremos os valores do tipo de dado especificado.
```java
    int[][] listaNumero = { {200, 300, 400}, {500, 900, 1200}, {9000, 1000} };
```

### Sintaxe
Podemos criar um array multidimensional de duas formas. 

#### 1. Nesta abordagem, definimos um array e preenchemos _diretamente_ com seus valores.
- Tipo de dado: int; 
- Quantidade de elementos do array pricipal: _se baseia na quantidade de arrays que colocamos na hora._
- Quantidade de elementos do array secundário: _se baseia na quantidade de arrays que colocamos na hora._
```java
    int[][] listaNumero = { {200, 300, 400}, {500, 900, 1200}, {9000, 1000} };
```

#### 2. Nesta abordagem, criamos um array _vazio_ para posteriormente atribuir valores.
- Tipo de dado: int; 
- Quantidade de elementos do array principal: 2 _(só pode conter no máximo dois vetores)_
- Quantidade de elementos do array secundário: 3 _(só pode conter no máximo três elementos)_
```java
    int[][] listaNumero = new int[2][3];
```


##### Acessando e atribuindo valores
Como já vimos anteriormente, esta segunda abordagem não define nossos elementos, apenas define quantos vetores podem haver dentro do vetor principal, e quantos elementos podem haver dentro do vetor secundário. 

- Neste caso, acessamos o índice 0 (zero), que se refere ao _primeiro vetor_ do nosso vetor principal. Após isso, entramos no índice 0, que se refere ao primeiro elemento do array secundário. 
```java
    int[0][0] = 500;
```

- Aqui nós acessamos o índice 1 (um), que se refere ao _segundo vetor_ do nosso vetor principal. Após isso, entramos no índice 4, que se refere ao _quinto elemento_ do array secundário. 
```java
    int[1][4] = 300;
```

Com a junção de ambos os blocos acima, poderia ser feito a seguinte linha: 
> Lembre-se, elementos que não foram definidos, por padrão, serão 0. 
```java
    int[][] = { {500, 0, 0, 0, 0}, {0, 0, 0, 0, 300} };
```
