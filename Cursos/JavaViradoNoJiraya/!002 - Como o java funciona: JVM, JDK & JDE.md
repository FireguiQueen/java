# Introdução ao Java

## Sistemas operacionais (en: OS; pt: SO)
O sistema operacional (Windows 11, Windows 10, macOS, Ubuntu) é um software, e podemos dizer que ele é o principal 
software do nosso computador.

O sistema operacional é responsável por realizar diversas tarefas, incluindo:
- Estabelecer comunicação entre os softwares de nossas máquinas e os hardwares conectados a ela.
- Gerenciar recursos para nossos softwares (ex: quanto de RAM determinado porgrma pode utilizar)
- Estabelecer limites de acesso, segurança e etc

Mas é importante saber que cada sistema operacional é desenvolvido de uma maneira específica, e cada um tem sua forma de
compreender e executar ações. Isso é crucial para a computação, pois permite o desenvolvimento de sistemas focados em 
objetivos específicos. Por exemplo, uma pessoa com uma máquina extremamente limitada pode usar um sistema operacional 
chamado "Lubuntu", projetado para ser leve em máquinas com recursos limitados. Pessoas que trabalham ou estudam 
cibersegurança podem usar um sistema operacional chamado "Kali Linux", voltado para atender a essas necessidades, com diversas 
ferramentas específicas. Assim, fica claro que cada sistema tem um nicho específico, embora existam também sistemas, como o Windows, 
que buscam atender a diversos públicos, incluindo gamers, programadores e usuários comuns.

Entre todos esses sistemas com propósitos diferentes, é natural pensar que cada um é construído de uma maneira única. 
Lembre-se, um sistema operacional é, em última análise, apenas um tipo de software.

## Máquinas virtuais 
O propósito de uma máquina virtual é ser uma máquina que roda em nossa máquina real. Por exemplo, sua máquina pode estar utilizando o Windows 11, mas com um software de máquinas virtuais, você pode emular uma máquina dentro da sua própria máquina, daí o termo "máquina virtual".

Elas têm várias utilidades, incluindo permitir que usuários de outros sistemas executem softwares desenvolvidos para rodar em outro sistema operacional. Por exemplo, se você estiver utilizando o Linux, mas precisar executar um programa que só funciona em sistemas Windows, pode resolver esse problema instalando uma máquina virtual no seu PC e colocando um sistema operacional Windows nela. Através dessa máquina virtual, é possível executar o programa desejado.

## Linguagem compilada
Uma linguagem compilada significa que precisamos compilar nosso programa feito nessa linguagem. Após a criação do programa, ele passará por um processo de compilação. O código contido nesse programa não pode ser lido por uma máquina, já que elas só entendem zeros e uns (binário). Então, nosso código será transformado em um formato que as máquinas conseguem compreender.


## Java Virtual Machine (JVM)
Após compreender alguns "pilares" da computação, podemos finalmente entender a JVM.

Quando um software é desenvolvido, geralmente ele tem um público-alvo específico, como um jogo. Para desenvolver um jogo, 
ou qualquer outro software, precisamos de uma linguagem de programação. Surge um problema quando os jogadores estão em 
sistemas operacinais diferentes, em sua maioria, em sistemas Windows (Win 10 e Win 11). 
Geralmente, os jogos são desenvolvidos para rodar em sistemas Windows, o que pode ser um obstáculo para usuários de MacOS 
ou Linux que desejam jogar esses games. 
Para adaptar um jogo aos diferentes sistemas operacionais, o código-fonte precisa ser modificado, e os desenvolvedores 
muitas vezes precisam "recriar" o jogo para que ele rode, por exemplo, em um Ubuntu (sistema operacional Linux).

O Java surge como uma solução para esse problema, através da JVM. Os programas feitos em Java não são feitos para serem executados diretamente em nossas máquinas, mas sim pela JVM (Java Virtual Machine). A JVM é uma máquina virtual que é executada dentro da nossa máquina real, e seu único papel é entender e executar programas feitos em Java.

Quando criamos um programa em Java, ele precisa passar por um processo de compilação. Ou seja, o Java é uma linguagem compilada, mas de uma maneira um pouco diferente do comum. Após a compilação, é criado um arquivo .class, mas o código desse arquivo não foi feito para ser lido diretamente pelo nosso computador. Esse arquivo foi feito para ser lido pela máquina virtual do Java (JVM). Por isso, dizemos que o Java é uma linguagem compilada e interpretada ao mesmo tempo.

1. Escrevemos nosso programa usando a linguagem Java;
2. Compilamos este programa com o javac (Java compiler);
3. O processo de compilação gera um arquivo chamado ".class", que contém bytecode (código que a JVM consegue ler);
4. Este arquivo ".class" é lido e interpretado pela JVM.

![java and class](https://github.com/FireguiQueen/Java/assets/98475125/bd5e74c5-2332-4bea-b09a-4fb5a1cce062)

![JVM](https://github.com/FireguiQueen/Java/assets/98475125/0f973e29-41f0-424e-b832-634ada8c4d5c)

A capacidade do Java de ser "multiplataforma" significa que os programas escritos em Java podem ser executados em várias
plataformas sem a necessidade de grandes modificações, desde que haja uma Máquina Virtual Java (JVM) disponível para essa plataforma específica.

<br>

# JDK e JDE
Para desenvolvedores, usamos o JDK (java development kit), que nada mais é do que um kit de desenvolvimento para
programadores java. Este kit contém a JVM (para entendremos arquivos .class), contém também o javac, que é o compilador
responsável pro pegar nosso programa .java e transformá-lo em um .class. E outras ferramentes, como debuggers,
que são usados para depurar (corrigir falhas e bugs) do nosso código. 

A JDE (java deve)

