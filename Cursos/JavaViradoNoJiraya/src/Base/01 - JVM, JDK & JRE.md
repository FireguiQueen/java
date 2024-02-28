# Introdução ao Java

____________

## Sistema operacional (SO)

### O que são sistemas operacionais?
Um sistema operacional, seja ele o Windows 10, macOS, Ubuntu, etc., é o principal software do nosso computador.

O sistema operacional é responsável por realizar diversas tarefas, algumas delas são:
- Estabelecer comunicação entre os softwares de nossas máquinas e os hardwares conectados a ela.
- Gerenciar recursos para nossos softwares (ex: quanto de RAM determinado programa pode utilizar)
- Estabelecer limites de acesso, segurança e etc.

### Windows e Linux não são sistemas operacionais, mas por quê? 
Ambos os famosos sistemas operacionais, Linux e Windows, na verdade, não são sistemas operacinais. Eles são o que chamamos de "Kernel", em português, "núcleo". Portanto, quando nos referimos a um "sistema operacional Linux", estamos, na verdade, falando de um sistema operacional construído sobre o Kernel Linux.

Um Kernel é a base para qualquer sistema operacional. A Microsoft, empresa que já desenvolveu diversos sistemas operacionais (Win 10, Win 7, Win XP e etc.), é a detentora do Kernel Windows. Todo sistema operacional Windows, seja ele o Windows 10 ou qualquer outro, utiliza o Kernel Windows. 

E assim como o Kernel Windows, a mesma lógica se estende aos sistemas operacionais desenvolvidos com base no Kernel Linux. A distinção crucial é que o Kernel Windows __pertence__ a Microsoft, e apenas ela pode utilizá-lo. Este Kernel foi desenvolvido para atender as necessidades da empresa em criar seus próprios sistemas operacionais para agradar seus usuários.
 
Enquanto o Kernel Linux é de código aberto, e é mantido por uma comunidade enorme de desenvolvedores e empresas ao redor do mundo. E isto permite  permitindo que qualquer pessoa o utilize livremente o Kerne Linux para desenvolver seus próprios sistemas operacionais. 


### Por que existem tantos sistemas operacionais baseados no Kernel Linux? 
Entre os sistemas operacionais baseados em Linux, podemos citar:
Xubuntu, Ubuntu, Debian, PopOS, Mint, LinuxOS, Steam OS e etc..

Tamanha variedade existe para atender a necessidades particulares. Indivíduos com computadores mais antigos podem optar pelo "Lubuntu", um sistema operacional projetado para proporcionar desempenho eficiente em máquinas com recursos limitados. Pessoas que estudam ou trabalham com cibersegurança podem usar um sistema operacional chamado "Kali Linux", que é voltado para atender a essas necessidades, pois ele possui inúmeras ferramentas específicas para o hacking. A própria Tesla possui um sistema operacinal baseado em Linux, e ele é projetado para controlar todas as funções do veículo, desde a navegação até os sensores de segurança. 

<br>

## Máquinas virtuais 
O propósito de uma máquina virtual é ser justamente uma máquina virtual que é executada em nossa máquina real. Sua máquina pode estar utilizando o Windows 11, mas com um software de virtualização, você pode 
emular uma máquina dentro da sua própria máquina, daí o termo "máquina virtual".

Uma máquina virtual possui diversas utilidades, sendo uma delas a capacidade de permitir que usuários de um sistema operacional específico executem softwares desenvolvidos para outro sistema operacional. Por exemplo, se estiver utilizando o macOS, mas necessitar rodar um programa exclusivo para sistemas Windows, é possível resolver esse impasse por meio de uma máquina virtual.

Além disso, as máquinas virtuais são valiosas para testar programas maliciosos. Todo o potencial dano causado por tais programas ocorre na máquina virtual, protegendo assim o sistema principal.

<br>

## Linguagem compilada
As linguagens compiladas são aquelas em que o código-fonte é compilado antes da execução, gerando um arquivo executável que posteriormente será utilizado pelo sistema operacional.

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
O JDK (Java Development Kit) é essencialmente um conjunto de ferramentas de desenvolvimento projetado para programadores Java. Dentro deste kit, encontramos a JVM (Java Virtual Machine), o javac (java compiler) e classes prontas que trazem funcionalidades ao programa sem precisarmos criá-las do zero. Além desses elementos fundamentais, o JDK também abrange outras utilidades, como depuradores, proporcionando um ambiente completo para o desenvolvimento Java, desde a criação até a depuração do código.

O JRE (Java Runtime Environment) é direcionado aos usuários comuns que simplesmente desejam executar programas desenvolvidos em Java. Para esse público, não é necessário instalar um compilador ou um depurador, uma vez que eles não estarão envolvidos no processo de desenvolvimento. O foco do JRE está na execução e interação com os programas Java de maneira eficiente, oferecendo a funcionalidade essencial para usuários finais sem a necessidade de recursos avançados de desenvolvimento.

____________________________

# Recomendação de vídeos
- [Java Virtual Machine (JVM): isso é o mínimo que você precisa saber](https://youtu.be/-rqptX0AqgI)
- [Entenda o que é WORA, JVM, JDK e JRE!](https://youtu.be/U6Gh6HYyl6c)
