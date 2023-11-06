// POO (Object-oriented programming - Programação Orientada a Objetos)
/*
    Programação orientada a objetos é um conceito, é um paradigma, um jeito 
    padronizado para programar.
    >> PARADIGMA: um exemplo que serve como modelo; padrão.

    A ideia do POO é que tudo pode se tornar um objeto.
    Na vida real, nem tudo são objetos. Por exemplo, uma pessoa NÃO é um objeto.
    Mas na programação, para definirmos esta pessoa, podemos dizer que ela É um objeto.

    Um objeto carrega consigo:
    - Propriedades
    - Valores dessas propriedades
    - Ações que podem ser executadas com ele.


    Vamos transformar uma pessoa em um objeto:

    pessoa 01:
    nome: joão
    idade: 47
    cor: branca
    profissão: policial

    // essas foram as propriedades e valores do nosso objeto. Por mais que na vida real uma pessoa não possa
    ser considerada um objeto, praticamente tudo do mundo real, pode virar um objeto na programação.


    No mundo real, uma caneca é um objeto. Vamos colocar ela em nosso código, vamos definir suas propriedades
    e ações que podemos fazer com ela.

    caneca:
    cor: preta
    tamanho: média 
    ação: beber()
    ação: esvaziar()
    ação: encher()


    Novamente, não podemos dizer que uma conta bancaria é um objeto, mas em Java, podemos.

    conta-itau
    saldo: R$900
    tipo: Pessoa juridica 
    numero da conta: 42502-531
    ação: transferir()
    ação: depositar()
    ação: receber()
    ação: gerarQRCode_deTransferencia()
    ação: gerarQRCode_deRecebimento()


    Vamos nos aprofundar mais um pouco, e pensar como cada propriedade poderia ser feita. Usaremos uma
    TV como exemplo.
    Vamos dar as seguintes propriedades: ligada (s/n). Fabricante. Polegedas.
    
    Bem, agora podemos pensar. A propriedade ligada pode receber no máximo dois valores: ligado / desligada.
    Sendo assim, esta propriedade pode ser do tipo boolean.

    O nome da fabricante tende a ser um nome, como Sony, Phillips, LG. Então, para esta propriedade, usaremos
    o tipo string. 

    As polegedas são números, logo, usaremos o tipo int para representar esta propriedade.


    Mas as TVs também possuem ações, como por exemplo, aumentar o volume dela.
    Neste caso, esta ação não é representa como uma propriedade, pois é algo dinâmico.
    Então, esta ação será uma função. 

    ********* ******* ******* ******** ******* ******* ***** ***** **** ***** ******* *******

    A PARTIR DESTA AULA (aula 43), OS NOMES DOS NOSSOS ARQUIVOS, DAS NOSSAS CLASSES, TERÃO NOMES
    MAIS SIGNIFICATIVOS, TERÃO NOMES PARA REPRESENTAR UM OBJETO.
*/