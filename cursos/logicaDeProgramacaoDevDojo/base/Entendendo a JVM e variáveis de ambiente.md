# WORA
O termo "wora" é algo que reflete bastante uma das vantagens de escrever um software em Java, cujo significado é "write once, run anywhere", isto é, "escreva uma vez, rode em qualquer lugar".

Uma das ideias ao desenvolver um software em Java é a capacidade de ter uma [portabilidade excepcional](https://pt.wikipedia.org/wiki/Portabilidade_de_software), sem a necessidade de grandes ou nenhuma modificação no código.

Quando desenvolvemos um software com muitas funcionalidades em Python, como um jogo, onde a cada instante é necessário receber e enviar informações para a GPU, enfrentamos um pequeno problema: esse software é complexo e quem atua como intermediário entre seu software e hardware é algo chamado sistema operacional.


Cada sistema operacional pode operar de uma forma, tendo nuances de como interpretar informações para fazer requerimentos ao seu hardware. Mas onde eu quero chegar com isso? Veja bem, acaba que nosso software precisa operar com base no sistema operacional escolhido. Isto é, seu software foi feito para rodar em Windows 10/11, mas e quem usa outros sistemas operacionais? Sistemas Linux, como Ubuntu, Arch, Debian? Simples, este software não vai funcionar para eles.

E aí entra o Java. Um programa feito em Java, como por exemplo: MeuPrograma.java, é feito para rodar numa coisa chamada JVM (Java Virtual Machine). Este programa terá seu código fonte compilado, e como resultado, teremos um arquivo chamado MeuProgram.class, este arquivo com a extensão .class contém algo chamado "bytecode", um código que é feito para ser interpretado por algo e depois se traduzir em linguagem de máquina.

Nossos computadores não são capazes de compreender o arquivo MeuPrograma.class. Para este arquivo ser interpretado, precisamos da máquina virtual Java (JVM). Ela será a responsável por compreender esses arquivos e enviar ao computador instruções de máquina (bits, zeros e uns). A vantagem disso é que qualquer software feito em Java pode ser capaz de rodar em qualquer sistema operacional, basta o mesmo ter uma JVM.

Em suma, o código feito em Java é feito para ser lido pela JVM, então basta cada sistema operacional ter sua própria JVM, tornando este software altamente portável."

![JVM](https://github.com/FireguiQueen/Java/assets/98475125/0f973e29-41f0-424e-b832-634ada8c4d5c)

<br>

_____________

# Variáveis de ambiente: como somos capazes de executar comandos no terminal? 
Um dos comandos mais importantes ao lidar com Java no terminal é o javac (Java compiler). Ele é responsável por transformar nosso arquivo .java em um arquivo .class. Mas como nosso sistema operacional interpreta esse comando quando o digitamos no terminal?

Quando instalamos o JDK em nossa máquina, um diretório é criado para ele em algum lugar. Esse diretório contém tudo relacionado ao kit de desenvolvimento Java, incluindo o comando javac no subdiretório bin (caso você use linux). Portanto, se executarmos esse comando dentro desse subdiretório, ele será reconhecido automaticamente.

Mas como o mesmo comando é reconhecido quando o usamos em uma IDE? Afinal, ela está em outro diretório. É simples, graças às variáveis de ambiente. Ao clicarmos em um botão na IDE para compilar nosso arquivo, uma variável de ambiente chamada JAVA_HOME aponta para o diretório onde o javac está localizado.



