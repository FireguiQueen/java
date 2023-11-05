# Java
Bem vindo ao meu repositório sobre Java. Aqui você encontrará cursos, exercícios e explicações.

______________

## Introdução
Este repositório foi criado não apenas para agrupar todos os cursos, exercícios e projetos pequenos que foram feitos por mim, mas também para servir como uma base para outras pessoas interessadas em aprender Java =).

### Como os cursos foram escolhidos?
Eu seleciono exclusivamente cursos gratuitos. Não acredito que cursos preparem alguém para o mercado, mas os considero úteis para dar início ao aprendizado.
O primeiro critério foi ignorar todas as "entidades de ensino" focadas mais no marketing do que no ensino. Portanto, você não encontrará cursinhos da Alura ou da Rockeseat aqui. Alguns cursos foram indicados por amigos, enquanto outros eu busquei em lugares obscuros da web (reddit).

### Instrutores e cursos 
- __William Suane__, _DevDojo:_ <a href="https://www.youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW"> Java virado no Jiraya </a>
- __Italo Grossi__, _DeAlunoParaAluno:_ <a href="https://www.youtube.com/playlist?list=PLa75BYTPDNKZLzk3xG-gSXSU_AAq5RP4g"> Programar em Java </a> 
- __Loiane Groner__, _Loiane Trainning:_ <a href="https://loiane.training/curso/java-basico"> Java básico </a>

</br>

Você pode ver minha progressão nos cursos por <a href="https://github.com/FireguiQueen/Java/blob/main/progress%C3%A3o.md">aqui</a>.
___________________________

## FAQ 
Aqui estão algumas perguntas frequentes sobre Java, computação e um pouco de mercado. Algumas delas incluirão explicações técnicas (marcadas com a tag ET), e outras apresentarão opiniões pessoais (marcadas como OP). 
> É importante mencionar que minhas opiniões pessoais possuem uma forte influência de pesquisas realizadas por mim.

> _No momento ainda não coloquei as respostas para todas as perguntas._

</br>

### [ET] Java é compilado ou interpretado? O que é JVM? Qual a diferença entre JDK e JDE? 
__WORA.__ "WORA" significa _"write once, run anywhere"_. Essa expressão se tornou muito popular na comunidade de desenvolvedores devido ao Java. Em português, ela significa: "Escreva uma vez, execute em qualquer lugar". __WORA: E este é um dos propósitos da linguagem Java.__ 
> O fato de programas Java poderem ser executados em qualquer plataforma traz o conceito de "multiplataforma".

##### Mas o que é ser multi-plataforma?
Para responder a essa pergunta, podemos pensar na comunidade "gamer" que joga no PC. A maioria dos jogadores jogam em sistemas operacionais Windows, que é o sistema mais popular entre os jogadores e os usuários de computadores em geral.

O desafio surge quando esses jogos nativos do Windows precisam ser executados em outros sistemas operacionais. Geralmente, isso requer que os desenvolvedores modifiquem o código-fonte do jogo para torná-lo compatível com esses sistemas diferentes. A capacidade de Java de ser "multiplataforma" significa que os programas escritos em Java podem ser executados em várias plataformas sem a necessidade de grandes modificações, desde que haja uma Máquina Virtual Java (JVM) disponível para essa plataforma específica.

##### Certo.. Mas como isso funciona exatamente? Como o java consegue fazer isso? 
Antes de tudo, vamos entender o que é uma máquina virtual. O uso de máquinas virtuais permite a execução de sistemas operacionais distintos simultaneamente em um único computador. Isso significa que podemos simular uma máquina que usa o Windows 7, mesmo que estejamos executando o Windows 11 em nosso computador. Com o uso de software de máquina virtual, somos capazes de ter uma máquina virtual em execução dentro da nossa própria máquina real.

Os programas escritos em Java __não__ são executados diretamente pelo nosso computador. Um programa em Java é projetado para ser _executado pela JVM_ (Java Virtual Machine). A JVM é uma máquina virtual que roda em nossa máquina real, mas ela é projetada exclusivamente para ler arquivos no formato .class, que são criados a partir do código-fonte Java.

Para entender melhor, podemos observar o processo passo a passo de como um programa Java é executado em qualquer máquina:
1. Escrevemos nosso programa usando a linguagem java; 
2. Compilamos este programa com o `javac` (java compiller); 
3. O processo de compilação gera um arquivo chamado ".class", que contém bytecode. 
4. Este arquivo ".class" é lido e __interpretado__ pela JVM. 

Vimos muitas informações novas, então vamos com calma. O processo de compilação envolve a transformação do código-fonte, que é o código que escrevemos em Java, em uma linguagem que nossas máquinas podem entender. O código-fonte ainda é legível e compreensível por nós.
> O bytecode gerado é o código que a nossa máquina (JVM) consegue ler e entender.

![java and class](https://github.com/FireguiQueen/Java/assets/98475125/bd5e74c5-2332-4bea-b09a-4fb5a1cce062)

Após a criação do bytecode, ele será lido e interpretado pela JVM. 

![JVM](https://github.com/FireguiQueen/Java/assets/98475125/0f973e29-41f0-424e-b832-634ada8c4d5c)

Finalmente, no conceito do Java, cada sistema possui sua própria JVM. A partir do momento em que temos um arquivo .class, a JVM de qualquer sistema consegue compreender e executar nosso programa. Isso nos leva a afirmar que o Java é uma linguagem _compilada_ e _interpretada_. Primeiramente, ocorre a etapa de compilação, na qual nosso código Java é transformado em um arquivo `.class`. Esse arquivo contém instruções em formato numérico compreensíveis somente pela JVM. Após a geração do arquivo .class, a JVM o interpreta e executa o programa por meio da nossa máquina.





### [ET] A linguagem Java é ruim para jogos?
Pode-se dizer que sim, mas precisamos ter cuidado ao afirmar isso. O fato de o Java ser considerado "inadequado" para o desenvolvimento de jogos não é culpa do Java em si. Antes da era dos smartphones, os celulares utilizavam o Java como a principal plataforma para aplicativos e jogos. Isso ocorria em dispositivos com recursos extremamente limitados, e ainda assim, os jogos eram desenvolvidos em Java.

Atualmente, as linguagens mais populares para o desenvolvimento de jogos são o C# e o Lua. Isso significa que a comunidade dedicou um grande esforço para criar bibliotecas e motores de alto desempenho com essas linguagens. Seria semelhante a desenvolver um jogo em Rust. Ela é uma linguagem altamente eficiente? Sim, mas a comunidade ainda não investiu tempo suficiente para torná-la tão adequada para esse propósito.



### [OP] Certificados servem para algo? 
Primeiro, vamos separar algumas coisas. Existem certificados profissionais, nos quais geralmente é necessário passar por uma prova desafiadora sobre o assunto, e você provavelmente terá que pagar para obtê-lo. Um exemplo é o certificado de Java da Oracle. Esses certificados são, de fato, úteis e possivelmente valorizados no mercado. No entanto, mesmo esse tipo de certificado não garante que o profissional seja adequado para uma determinada vaga.

Existem também certificados de conclusão de cursinho, ou seja, após o aluno concluir seu curso (seja da udemy, alura etc..) ele ganhará um certificado de conclusão. Não estou desmerecendo os cursos, só estou dizendo que este tipo de certificado é inútil. O que realmente importa é se você absorveu todo o conteúdo mostrado pelo curso.  

Vamos pensar nisso: imagine que você seja o RH de uma empresa brasileira e está procurando contratar um profissional júnior. Você agregaria mais valor a alguém pelo simples fato dele possuir vários certificados da Udemy no currículo? Creio que a resposta seja "não". 
Provavelmente você nem conhece os cursos, muito menos o instrutor desses cursos. Você nem sabe se os cursos são bons. E mesmo que os cursos sejam excelentes, como você pode ter certeza de que o indivíduo realmente concluiu todos eles, assistiu a todas as aulas e fez todos os exercícios? 

__Conclusão__:  certos certificados, como os da Oracle, AWS, Azure, entre outros, têm utilidade e __podem__ ser valorizados. Por outro lado, os certificados de plataformas como Udemy, Alura e etc, em geral, são inúteis.


### [OP] Cursos te preparam para o mercado de trabalho? 
Nenhum deles tem a capacidade de ensinar a você tudo o que uma vaga requer. Mesmo vagas de estágio podem exigir conhecimentos que não foram abordados em um determinado curso, pois os cursos são projetados para proporcionar uma _introdução_ a uma tecnologia ou assunto específico.

Os bons cursos do mercado podem, de fato, ensinar muitas coisas úteis e conceitos importantes. Mas é importante saber que todo o conteúdo do curso já está disponível na internet em formato de texto. 

O que verdadeiramente lhe trará experiência e conhecimento são os projetos reais, aqueles que trazem utilidade ao mundo. Os pequenos projetos mostrados em cursos são bem diferentes do que é feito no mundo real. Nos cursos, você tem um guia passo-a-passo e, mesmo que encontre erros, não será muito difícil resolvê-los, uma vez que, em geral, são projetos genéricos.

Na vida real você enfrenta prazos, responsabilidades e, claro, uma complexidade muito maior para concluir um projeto. Lembre-se, há dinheiro envolvido no que você constrói. Obviamente, os projetos pessoais que buscam trazer utilidade e até mesmo possíveis lucros, também podem demandar prazos e "alta" complexidade no desenvolvimento. <q>Tempo é dinheiro</q>.
Então mesmo que você esteja apenas estudando, busque por desenvolver coisas mais complexas, finja que outras pessoas lerão seu código, construa-o da melhor forma possível.

