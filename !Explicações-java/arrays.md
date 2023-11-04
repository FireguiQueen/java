# Arrays 
Os arrays, também conhecidos como "vetores" são variáveis especiais, que são capazes de armazenar um ou mais valores. 

Os arrays são muito úteis quando você precisa trabalhar com coleções de dados, como armazenar uma lista de nomes, números, ou qualquer tipo de informação que possa ser representada como um conjunto de elementos do mesmo tipo.

Pense num array como uma lista, e nesta lista, você pode guardar diversos valores de um determinado tipo. 
Os valores armazenados nesta "lista" são chamados de elementos. Esses elementos podem ser acessados por um tipo de indicação, que chamamos de índice.
> Vale lembrar que um array é uma variável capaz de armazenar mais de um valor, e, portanto, você precisa definir o tipo de dado que esta variável irá conter. O array só poderá armazenar valores do tipo de dado indicado.

</br>

## Criando um array
Existem duas formas de criarmos um array. 

#### Nesta forma, definimos um array e _diretamente_ colocamos seus valores.
- Definimos o tipo de dado (`String`) e ao lado colocamos os colchetes _[]_. 
- Colocamos um identificador ao nosso array. 
- E por fim, dizemos que será recebido uma coleção de dados. 
```java
    String[] listaDeNomes = {"João", "Paulo", "Guilherme"}; 
```

</br>

#### Nesta forma, definos um array _vazio_ para atribuir seus valores futuramente. 
- Definimos o tipo de dado (`String`) e ao lado colocamos os colchetes _[]_. 
- Colocamos um identificador ao nosso array. 
- E por fim, fazemos uma instância do objeto `String`, colocando colchetes ao lado e informando quantos elementos poderão haver neste array. 
> Este jeito pode parecer um pouco mais confuso, pois é necessário entender alguns conceitos. Mas apenas saiba que foi criado um array vazio, e definido quantos, através dos colchetes, quantos elementos podem existir dentro deste array. Se tentarmos colocar mais elementos do permitido, teremos erros. 

```java
    String[] listaDeNomesVazia = new String[3];
```