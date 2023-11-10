# Introdução ao Java

## Sistemas operacionais (en: OS; pt: SO)
O sistema operacional (windows 11, windows 10, macOS, Ubuntu) é um software, e podemos 
dizer que ele é o principal software de nosso computador.

O sistema operacional é responsável por fazer muitas coisas, entre elas: 
- Estabelecer uma comunicação entre softwares de nossas máquinas com os hardwares conectados a ela.
- Gerenciamento de recursos para nossos softwares

Mas é importante saber que cada sistema operacinal é desenvolvido de um jeito, e cada 
um tem sua forma de compreender e executar ações. 
E isto, claro, é super importante para a computação, já que podemos desenvolver sistemas focados
em coisas especificas. Por exemplo, uma pessoa que possui uma máquina extremamente limitada, pode fazer o uso
de um sistema operacional chamado "Lubuntu". O propósito deste sistema é ser super leve para rodar em máquinas com recursos
limitados. 
Pessoas que trabalham ou estudam cibersegurança podem usar um sitema operacional chamado "Kali Linux", que é voltado
justamente para atender essas pessoas. Pois ele possui diversas ferramentas para este fim, e além disso,
não possui muitos softwares de segurança, então, o usuário pode ser mais livre para instalar e modificar coisas
do sistema. 
Enfim, já foi possível entender que cada sistema tem um nicho especifico, e claro, existem aqueles também 
que buscam fazer de tudo, como por exemplo o Windows. Onde ele atinge o público em geral: gamers, programadores
e usuários comuns. 

Entre todos esses sistemas com própositos diferentes, já é de se pensar que cada um é construido de um jeito diferente. 
Lembre-se, um sistema operacinal
nada mais é do que um tipo de software.

## Máquinas virtuais 
O propósito de uma máquina virtual é ser uma máquina rodando em nossa máquina real.
Por exemplo, sua máquina pode estar utilizando o Windows 11, mas um software de máquinas virtuais,
você é capaz de emular uma máquina dentro da sua própria máquina, por isso chamamos de "máquina vitual".

As utilidades delas são muitas, mas uma delas é os usuários de outros sistemas possuirem a capacidade
de executar softwares que foram desenvolvidos para rodar num outro sistema operacional.
Isto é, você pode estar utilizando Linux, mas precisa executar um programa que só funciona em sistemas 
Windows. Uma forma de resolver este problema é instalando uma máquina virtual no seu PC, e colocando
um sistema operacional Windows nela, e através dela você pode executar este programa. 

## Linguagem compilada
Uma linguagem compilada significa que precisamos compilar o nosso programa feito nesta linguagem.
Após a criação do nosso programa, o mesmo passará por um processo de compilação. 
O código contido neste programa não pode ser lido por uma máquina, pois elas só entendem zeros e uns (binário).
Então, o nosso código será transformado em um código para as máquinas entenderem entenderem. 


## Java Virtual Machine (JVM)
Após entender alguns "pilares" da computação, podemos, finalmente, entendr a JVM. 

Quando um software é desenvolvido, geralmente ele possui um publico alvo. Por exemplo, um jogo.
Para se desenvolver um jogo, qualquer que seja, precisamos de uma linguagem de programação, e aí surge um problema.
Os jogadores estão, em grande parte, em sistemas WIndows (win 10 e win 11), logo, quando desenvolvem 
um game, geralmente ele é feito para rodar em sistemas Windows.
Ou seja, usuários de MacOS ou linux, podem ser incapazes de conseguir rodar esse jogo.
Para que um jogo seja desenvolvido para os sistemas operacionais, o código-fonte do mesmo precisa sofrer
alterações, e no fim, acaba que os desenvolvedores precisam "recriar" este jogo para que ele rode por exemplo,
em um Ubuntu (sistema operacinal linux). 

O java surge para resolver este problema, através da JVM. Programas feitos em Java não foram feitos para
serem executados diretamente por nossas máquinas, e sim pela JVM (Java Virtual Machine).
A JVM é uma máquina virtual que é executada dentro da nossa máquina real. E o único papel desta máquina virtual é de 
entender programas feitos em Java.  

Quando criamos um programa em java, este mesmo programa precisa passar por um processo de compilação. 
Ou seja, java é uma linguagem compilada, mas é um pouco diferente do comum.
Após a compilação, será criado um arquivo .class, mas o código deste arquivo não foi feito para ser lido
diretamente pelo nosso computador, este arquivo foi feito para ser lido pela máquina virtual do Java (JVM).
Por isso, dizemos que o java é uma linguagem compilada e interpretada ao mesmo tempo.
1. Escrevemos nosso programa usando a linguagem java;
2. Compilamos este programa com o javac (java compiller);
3. O processo de compilação gera um arquivo chamado ".class", que contém bytecode.
4. Este arquivo ".class" é lido e interpretado pela JVM.

![java and class](https://github.com/FireguiQueen/Java/assets/98475125/bd5e74c5-2332-4bea-b09a-4fb5a1cce062)

![JVM](https://github.com/FireguiQueen/Java/assets/98475125/0f973e29-41f0-424e-b832-634ada8c4d5c)

