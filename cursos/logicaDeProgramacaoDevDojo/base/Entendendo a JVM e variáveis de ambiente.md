# WORA
O termo "wora" é algo que reflete bastante uma das vantagens em escrever um software em Java, seu significado é:
"write once, run anywhere", isto é, "escreva uma vez, rode em qualquer lugar". 

Uma das ideias de se desenvolver um software em java é ser capaz de ter uma portabilidade absurda, sem necessidade
de grandes ou nenhum modificação no código.

Quando escrevemos um software com muitas funcionalidades em Python, como um jogo; onde a cada instante é necessário
receber e enviar informações para sua GPU, temos um pequeno problema: este software é complexo, e quem atua como intermediário
entre seus software e hardware é algo chamado __sistema operacional__. 

Cada sistema operacional pode operar de uma forma, tendo nuances de como interpretar informações para fazer requerimentos
ao seu hardware. Mas onde eu quero chegar com isso? Veja bem, acaba que nosso software precisa operar com base no sistem
operacional escolhido. Isto é, seu software foi feito parar rodar em Windows 10/11, mas e quem usa outros sistemas operacionais?
Sistemas linux, como Ubuntu, Arch, Debian? Simples, este software não vai funcionar para eles. 

E aí entra o Java. Um programa feito em java, como por exemplo: `MeuPrograma.java`, é feito para rodar numa coisa chamada JVM (Java virtual
machine). Este programa terá seu código fonte compilado, e como resultado, teremos um arquivo chamado `MeuProgram.class`, 
este arquivo com a extensão `.class` contém algo chamado "bytecode", um código que é feito para ser interpretado por algo
e depois se traduzir em linguiagem de máquina. 

Nossos computadores não são capazes de compreender o arquivo `MeuPrograma.class`. Para este arquivo ser interpretado, precisamos
da máquina virtual java (JVM). Ela será a responsavel por compreender esses arquivos e enviar ao computador instruções de máquina
(bits, zeros e uns). A vantagem disso é que, qualquer software feito em java pode ser capaz de rodar em qualquer sistema operacional, basta
o mesmo ter uma JVM. 

Em suma, o código feito em java é feito para ser lido pela JVM, então basta cada sistema operacional ter sua própria JVM, tornando este software altamente portável. 

![JVM](https://github.com/FireguiQueen/Java/assets/98475125/0f973e29-41f0-424e-b832-634ada8c4d5c)

