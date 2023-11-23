# Classes
Todo arquivo feito em java é uma classe. Tanto é que em todo arquivo `.javca`, veremos o seguinte trecho:
```java
    public class nomeDoArquivo
    {
        // seu código aqui. . . 
    }
```

A classe que contém o trecho `public static void main(String[] args)` geralmente é a nossa classe principal, o nosso programa.
Será ela a responsável por executar este método "public static void main.." e executar as instruções do programa.
E claro, através deste método principal da classe, podemos chamar outros métodos e criar __objetos__.

# Objetos
Pense em objetos como objetos da vida real, por exemplo, uma caneca. A caneca terá diversas caracteristicas, das quais,
chamamos de "propriedades". Isto é, uma caneca pode ter a propriedade "cor", "altura", "largura" e etc. 

Os objetos são criados a partir de uma __classe de dominio__. Em geral, esse tipo de classe não terá um método principal.
Este tipo de classe será um molde para __criar objetos__. Então por exemplo, teremos uma classe chamada "caneca", esta 
classe irá conter as propriedades desta caneca:
```java
    public class Caneca
    {
        String cor;
        double altura; 
        double largura;
    }
```

Com a _classe de dominio_ criada, agora somos capazes de ir no nosso programa principal e criar nossos objetos. 
Agora podemos criar infinitas canecas, cada uma com propriedades diferentes.
```java
    import Caneca; // linha responsável por importar a classe 'caneca' para o nosso arquivo "programaPrincipal". Sem este import, não podemos usar este classe.

    public class programaPrincipal
    {
        public static void main(String[] args) 
        {
            Caneca canecaParaCriancas = new Caneca();  
            
            canecaParaCriancas.cor = "blue"; 
            canecaParaCriancas.altura = 2.0;
            canecaParaCriancas.largura = 1.7;


            Caneca canecaParaAdultos = new Caneca();
            canecaParaCriancas.cor = "black";
            canecaParaCriancas.altura = 4.0;
            canecaParaCriancas.largura = 2.3;

        }
    }
```

Talvez o código não esteja claro a você, mas note que, através da classe "Caneca", nós criamos duas canecas diferentes,
e elas possuem valores de propriedades diferentes uma da outra. E esta caneca gerada a partir da classe "Caneca" é
chamada de __objeto__. Tudo aquilo que é criado a partir de uam classe, é chamado de objeto. 


Aqui podemos ver uma imagem ilustrativa. Onde o "car" é a nossa classe, e ela seria um molde. Os carros: Maruti, Audi e BMW
são os objetos que foram criados a partir desta classe.

![classAndObjects](../../../others/classAndObjects.png)
