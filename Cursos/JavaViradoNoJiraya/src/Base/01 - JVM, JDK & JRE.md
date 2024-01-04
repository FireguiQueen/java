# Introdução ao Java

<br>

## Sistemas operacionais
Um sistema operacional, seja ele o Windows 11, Windows 10, macOS, Ubuntu, etc., é apenas um software. Podemos afirmar que ele é o principal programa do nosso computador.

O sistema operacional é responsável por realizar diversas tarefas, incluindo:
- Estabelecer comunicação entre os softwares de nossas máquinas e os hardwares conectados a ela.
- Gerenciar recursos para nossos softwares (ex: quanto de RAM determinado programa pode utilizar)
- Estabelecer limites de acesso, segurança e etc.

Cada sistema operacional é desenvolvido de maneira específica, e cada um possui sua própria forma de compreender e executar ações. E isso é crucial para a computação em geral, pois possibilita o desenvolvimento de sistemas adaptados a necessidades particulares.

Indivíduos com computadores mais antigos podem optar pelo Lubuntu, um sistema operacional projetado para proporcionar desempenho eficiente em máquinas com recursos limitados.
Pessoas que estudam ou trabalham com cibersegurança podem usar um sistema operacional chamado "Kali Linux", que é
voltado para atender a essas necessidades, pois ele possui diversas ferramentas específicas para hacking. 

Podemos concluir que cada sistema tem um nicho específico, embora existam também sistemas, como o Windows e o Ubuntu, 
que buscam atender a diversos públicos, incluindo gamers, programadores e usuários comuns.

<br>

## Máquinas virtuais 
Por mais óbvio que seja ler isso, o propósito de uma máquina virtual é ser justamente uma máquina virtual que é executada em nossa máquina real. Sua máquina pode estar utilizando o Windows 11, mas com um software de virtualização, você pode 
emular uma máquina dentro da sua própria máquina, daí o termo "máquina virtual".

Uma máquina virtual apresenta diversas utilidades. Uma delas é permitir que usuários de um sistema operacional específico executem softwares desenvolvidos para outro sistema operacional. Por exemplo, se você estiver utilizando o Linux, mas precisar rodar um programa exclusivo para sistemas Windows, pode resolver esse impasse instalando uma máquina virtual.

Além disso, as máquinas virtuais são valiosas para testar programas maliciosos. Todo o potencial dano causado por tais programas ocorre na máquina virtual, protegendo assim o sistema principal.

<br>

## Linguagem compilada
As linguagens compiladas são aquelas em que o código-fonte é compilado antes da execução, gerando um arquivo executável diretamente utilizado pelo sistema operacional.

Uma linguagem compilada implica que o programa escrito nela precisa passar por um processo de compilação. Após a criação do código-fonte, este é submetido a um processo de compilação, uma vez que o código contido não pode ser lido diretamente pela máquina, que compreende apenas a linguagem binária de zeros e uns. Dessa forma, o código-fonte é transformado em um formato compreensível pelas máquinas.

#### Exemplo
> A linguagem C é uma linguagem compilada. O código que escrevemos nela é incompreensível para o nosso computador.
```c
    #include <stdio.h>
    
    int main(void)
    {
        printf("Hello world!");
    }
```

Para que o programa acima seja executado em nossa máquina, é necessário passar pelo processo de compilação (que abrange diversas outras ações). E após essa etapa, teremos um arquivo contendo a representação do programa em formato binário (composto por zeros e uns). Somente então, nosso computador será capaz de ler e executar o nosso programa.

<br>

## Java Virtual Machine (JVM)
Após compreender alguns "pilares" da computação, podemos finalmente entender a JVM (ou pelo menos __começar__ a entender).

Normalmente, os softwares são desenvolvidos para serem executados em sistemas Windows, dado o amplo uso desse sistema operacional. E isso pode se tornar um obstáculo para usuários de MacOS ou Linux que desejam utilizar esses programas, afinal, eles foram feitos para rodar em Windows. 

Para adaptar um software aos diferentes sistemas operacionais, o código-fonte precisa ser modificado, e frequentemente os desenvolvedores precisam 'recriar' o software para garantir sua funcionalidade em outros sistemas operacionais. 

O Java surge como uma solução para este problema por meio da JVM (Java Virtual Machine). Os programas desenvolvidos em Java não são destinados a serem executados diretamente em nossas máquinas, mas sim pela JVM, uma máquina virtual do java, que opera dentro da nossa máquina real. Seu único papel é compreender e executar programas feitos em Java.

Quando criamos um programa em Java, ele precisa passar por um processo de compilação. Ou seja, o Java é sim uma linguagem compilada (mas de uma maneira um pouco diferente do comum). Após a compilação, é criado um arquivo `.class`, e o código deste arquivo foi feito para ser lido pela máquina virtual do Java (JVM). Por isso, dizemos que o Java é uma linguagem _compilada e interpretada_ ao mesmo tempo.

1. Escrevemos nosso programa usando a linguagem Java;
2. Compilamos este programa com o javac (Java compiler);
3. O processo de compilação gera um arquivo chamado ".class", que contém bytecode(código que a JVM consegue ler);
4. Este arquivo ".class" é lido e interpretado pela JVM.

![java and class](https://github.com/FireguiQueen/Java/assets/98475125/bd5e74c5-2332-4bea-b09a-4fb5a1cce062)

![JVM](https://github.com/FireguiQueen/Java/assets/98475125/0f973e29-41f0-424e-b832-634ada8c4d5c)

A capacidade do Java de ser "multiplataforma" significa que os programas escritos em Java podem ser executados em várias
plataformas sem a necessidade de grandes modificações, desde que haja uma Máquina Virtual Java (JVM) disponível para essa plataforma específica.

<br>

# JDK e JRE
O JDK (Java Development Kit) nada mais é do que um kit de desenvolvimento para programadores Java. Este kit contém a JVM e também o javac, que é o compilador responsável por pegar nosso programa `.java` e transformá-lo em um `.class`. Além disso, inclui outras ferramentas, como depuradores por exemplo.

O JRE (Java Runtime Environment) é focado para aqueles usuários comuns que desejam apenas executar programas feitos em Java.
Esse tipo de usuário não precisa instalar um compilador e um depurador, afinal, ele não vai desenvolver nada, 
apenas executar e interagir com os programas. 

