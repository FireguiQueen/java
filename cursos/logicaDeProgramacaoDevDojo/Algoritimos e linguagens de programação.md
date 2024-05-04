# Algoritmos e Linguagens de Programação

## Algoritimos
Algoritmos são utilizados para resolver problemas de forma eficiente e prática. Um algoritimo Pode ser definido como um conjunto de instruções para resolver um problema específico.

Algoritmos frequentemente são relacionados diretamente à computação, onde o código de um software é formado por um ou mais algoritimos. Cada um desempenhando um papel crucial para o funcionamento do programa.

Mas a realidade é que os algoritmos não são exclusivos da computação e também estão presentes em nossa vida cotidiana, como, por exemplo, atravessar uma rua. Para isso, geralmente seguimos um algoritmo simples:

1. Olhar para os dois lados: direita e esquerda.
2. Se houver carros vindo, esperar. Se não houver carros, atravessar a rua.

No entanto, é importante notar que os algoritmos em nossos programas podem ser muito mais complexos. Por exemplo, o algoritmo mencionado anteriormente poderia ser expandido da seguinte forma:

1. Olhar para os dois lados: __direita e esquerda__.
2. Há carros vindo?
+ __NÃO__: atravessar a rua.
+ __SIM__: Eles estão longe?
+ + __SIM__: Atravessar a rua.
+ + __NÃO__: Aguardar os carros passarem para atravessar a rua.

<br>

____________________

## Linguagem de máquina
A linguagem de máquina nada mais é do que uma sequência de bits (dígitos binários), ou seja, zeros e uns (representando estados de desligado e ligado). Essa é a única linguagem que nossos computadores são capazes de __compreender__. No entanto, seria extremamente difícil e nada prático para nós, desenvolvedores, utilizá-la. Por isso, criamos as linguagens de programação de alto nível.

Nos "primórdios" da computação, foi criado o assembly, uma linguagem de programação. A ideia por trás do assembly era trabalhar com uma linguagem um pouco mais compreensível e menos verbosa do que zeros e uns. E para criar um programa final, o código feito nesta linguagem seria __compilado__ para linguagem de máquina.

Como podemos observar na imagem abaixo, as linguagens "high-level" (de alto nível) contêm palavras do vocabulário inglês. A linguagem assembly também as possui, mas em termos de complexidade na compreensão do código, ela é consideravelmente mais desafiadora. 
   
![csexamples](https://github.com/FireguiQueen/Java/assets/98475125/4b9fe8ff-543b-4054-8e57-43e3e34e51d3)

### Diferentes formas de programar: Uma única forma de compreender.
Para criar um software nós podemos optar por linguagens de alto nível, como Java, C e C++ (...), ou adentrar o mundo das linguagens de baixo nível, como o Assembly. Até mesmo a linguagem de máquina está ao nosso alcance para expressar nossas ideias em código.

Porém, independente da linguagem escolhida, todas compartilham um propósito singular: passar por um processo de compilação para se traduzir em uma sequência de zeros e uns, a __única__ linguagem que nossas máquinas conseguem compreender.

Alguns podem argumentar que esta afirmação não se aplica às linguagens interpretadas, como o JavaScript, onde o código não é compilado diretamente para binário. Em vez disso, ele é interpretado por um motor, como o V8 do Google. No entanto, mesmo nesses casos, o código é eventualmente traduzido para linguagem de montagem para que a máquina possa compreendê-lo.

