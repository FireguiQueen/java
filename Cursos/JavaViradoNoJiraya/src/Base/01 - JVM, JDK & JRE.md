# Introdução ao Java

<br>

## Sistemas operacionais
Um sistema operacional, seja ele o Windows 11, Windows 10, macOS, Ubuntu, etc., é apenas um software. Podemos afirmar que ele é o principal programa do nosso computador.

O sistema operacional é responsável por realizar diversas tarefas, incluindo:
- Estabelecer comunicação entre os softwares de nossas máquinas e os hardwares conectados a ela.
- Gerenciar recursos para nossos softwares (ex: quanto de RAM determinado porgrma pode utilizar)
- Estabelecer limites de acesso, segurança e etc.

Cada sistema operacional é desenvolvido de maneira específica, e cada um possui sua própria forma de compreender e executar ações. Isso é crucial para a computação, pois possibilita o desenvolvimento de sistemas adaptados a necessidades particulares.

Indivíduos com computadores mais antigos podem optar pelo Lubuntu, um sistema operacional projetado para proporcionar desempenho eficiente em máquinas com recursos limitados.
Pessoas que estudam ou trabalham com cibersegurança podem usar um sistema operacional chamado "Kali Linux", que é
voltado para atender a essas necessidades, pois ṕossui diversas ferramentas específicas para hacking. 

Podemos concluir que cada sistema tem um nicho específico, embora existam também sistemas, como o Windows e o Ubuntu, 
que buscam atender a diversos públicos, incluindo gamers, programadores e usuários comuns.

<br>

## Máquinas virtuais 
O propósito de uma máquina virtual é ser justamente uma máquina virtual que é executada em nossa máquina real. 
Sua máquina pode estar utilizando o Windows 11, mas com um software de virtualização, você pode 
emular uma máquina dentro da sua própria máquina, daí o termo "máquina virtual".

Uma máquina virtual têm várias utilidades. Uma delas é permitir que usuários de um sistema operacinal específico execute 
softwares desenvolvidos para rodar em outro sistema operacional. Por exemplo, se você estiver utilizando o Linux, 
mas precisar executar um programa que só funciona em sistemas Windows, pode resolver esse problema instalando uma máquina virtual. 

<br>

## Linguagem compilada
As linguagens compiladas são aquelas em que o código fonte é compilado antes da execução, gerando um arquivo executável diretamente utilizado pelo sistema operacional.

Nesse contexto, uma linguagem compilada implica que o programa escrito precisa ser compilado. Após a criação do código fonte, este passa por um processo de compilação, uma vez que o código contido não pode ser lido diretamente pela máquina, que compreende apenas a linguagem binária de zeros e uns. Assim, o código é transformado em um formato compreensível pelas máquinas.

#### Exemplo
> A linguagem C é uma linguagem compilada. O código que escrevemos nela é incompreensível para o computador.
```c
    #include <stdio.h>
    
    int main(void)
    {
        printf("Hello world!");
    }
```

Para que o programa acima seja executado pela nossa máquina, ele precisa passar pelo processo de compilação 
(que engloba diversas outras ações). Após essa etapa, teremos um arquivo que conterá a representação do programa 
em formato binário, composta por zeros e uns.

<br>

## Java Virtual Machine (JVM)
Após compreender alguns "pilares" da computação, podemos finalmente entender a JVM.

Normalmente, os softwares são desenvolvidos para serem executados em sistemas Windows, dado o amplo uso desse sistema operacional. No entanto, isso pode se tornar um obstáculo para usuários de MacOS ou Linux que desejam utilizar esses programas. Para adaptar um software aos diferentes sistemas operacionais, o código-fonte precisa ser modificado, e frequentemente os desenvolvedores precisam 'recriar' o software para garantir sua funcionalidade em, por exemplo, um Ubuntu (sistema operacional Linux).

O Java surge como uma solução para esse desafio por meio da JVM (Java Virtual Machine). Os programas desenvolvidos em Java não são destinados a serem executados diretamente em nossas máquinas, mas sim pela JVM, uma máquina virtual que opera dentro da nossa máquina real. Seu único papel é compreender e executar programas feitos em Java.

Quando criamos um programa em Java, ele precisa passar por um processo de compilação. Ou seja, o Java é sim uma linguagem compilada (mas de uma maneira um pouco diferente do comum). Após a compilação, é criado um arquivo .class, onde o código deste arquivo foi feito para ser lido pela máquina virtual do Java (JVM). Por isso, dizemos que o Java é uma linguagem compilada e interpretada ao mesmo tempo.

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
Para os desenvolvedores, utilizamos o JDK (Java Development Kit), que nada mais é do que um kit de desenvolvimento para
programadores Java. Este kit contém a JVM (para entender arquivos .class) e também o javac, que é o compilador responsável por pegar nosso programa 
.java e transformá-lo em um .class. Além disso, inclui outras ferramentas, como depuradores, usados para depurar (corrigir falhas e bugs) em nosso código.

O JRE (Java Runtime Environment) é focado para aqueles usuários comuns que desejam apenas executar programas feitos em Java.
Por exemplo, esse tipo de usuário não precisa instalar um compilador e um depurador, afinal, ele não vai desenvolver nada, 
apenas executar e interagir com os programas. 
