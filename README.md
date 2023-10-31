# Java
Bem vindo ao meu repositório sobre Java. Aqui você encontrará cursos, exercícios e explicações.

______________

## Introdução
Este repositório foi criado não apenas para agrupar todos os cursos, exercícios e projetos pequenos que foram feitos por mim, mas também para servir como uma base para outras pessoas interessadas em aprender Java =).

### Como os cursos foram escolhidos?
_Antes de continuar a leitura, recomendo que leia <a href="https://github.com/FireguiQueen/Java/tree/main#op-certificados-servem-para-algo">"cursos te preparam ao mercado?"</a>._ 

Sou um estudante de Java, e em relação aos cursos deste repositório, eu mantenho cursos gratuitos e de boa qualidade. 
O primeiro critério foi ignorar todas as "entidades de ensino" que prometem mil maravilhas, por isso você não encontrará cursinhos da Alura ou da Rockeseat. Brincadeiras à parte, mas de fato você não vai encontrar.

A primeira coisa a ser feita foi escolher cuidadosamente os cursos. Alguns foram indicações de amigos, enquanto outros eu procurei em lugares obscuros da web (reddit). Procuro sempre fazer uma analise do professor, ver sua história e sua experiência como desenvolvedor. 
> Ficaremos longe de quem promete coisas, afinal, quem faz muitas promessas, pouco entrega. Este respositório busca manter distância dos marketeiros.  

### Instrutores e cursos 
- __William Suane__, _DevDojo:_ <a href="https://www.youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW"> Java virado no Jiraya </a>
- __Italo Grossi__, _DeAlunoParaAluno:_ <a href="https://www.youtube.com/playlist?list=PLa75BYTPDNKZLzk3xG-gSXSU_AAq5RP4g"> Programar em Java </a> 
- __Loiane Groner__, _Loiane Trainning:_ <a href="https://loiane.training/curso/java-basico"> Java básico </a>
  
___________________________

## FAQ 
Aqui estão algumas perguntas frequentes sobre Java, computação e um pouco de mercado. Algumas delas incluirão explicações técnicas (marcadas com a tag ET), e outras apresentarão opiniões pessoais (marcadas como OP). 
> É importante mencionar que minhas opiniões pessoais possuem uma forte influência de pesquisas realizadas por mim.

> _No momento ainda não coloquei as respostas para todas as perguntas._


### [ET] Java é compilado ou interpretado? O que é JVM? Qual a diferença entre JDK e JDE? 
__WORA.__ "WORA" significa _"write once, run anywhere"_. Esta frase passou-se a ser muito utilizada na comunidade de desenvolvimento devido ao Java. Em português, ela significa: "Escreva uma vez, rode em qualquer lugar". __WORA: E este é um dos propósitos da linguagem Java.__ 

O Java foi desenvolvido não apenas para ser outra linguagem de programação, para futuros softwares serem escritos nela, mas também para ser multi-plataforma. Mas o que isto significa? "Multi-plataforma?"

Para responder esta pergunta, podemos pensar na comunidade "gamer" que joga no PC. 
Os jogadores estão, em grande parte, jogando no sistema operacional Windows. O windows de fato é o sistema mais famoso entre jogadores e pessoas que usam o computador de modo geral. 

Mas cada sistema operacional funciona de um jeito, eles possuem jeitos um pouco diferentes de interpretar informações. Então, quando um jogo é criado, ele é escrito em uma linguagem de programação, com motores (Unreal, Unity..) para facilitar o desenvolvimento. Mas aí que entra o pulo do gato, os jogos são desenvolvidos para rodarem em sistemas WINDOWS. A maior parte dos jogos não possuem nativamente para outros sistemas operacionais. Para que esses mesmos jogos nativos de windows rodem em outros sistemas, há necessidade do código ser alterado pelos desenvovledores. 

E aí entra o java. O java é uma linguagem capaz de criar programas que podem ser executados em qualquer sistema operacional. Então, só precisamos _escrever o código uma vez, e podemos rodá-lo em qualquer lugar_. 
Certo.. Mas como isso funciona exatamente? Como o java consegue fazer isso? 

O programa escrito em Java __não__ é lido pelo nosso computador diretamente. O programa em java é feito para ser lido pela JVM (Java Virtual Machine). A JVM é uma máquina virtual que fica sendo executada em nossa própria máquina, mas ela é feita exclusivamente para ler programas java.

Mas há alguns passos antes da JVM ler e entender nosso programa escrito em java. Podemos entender melhor ao observar a ordem abaixo:
1. Escrevemos nosso programa com a linguagem java.  
2. Compilamos este programa com o javac (java compiller). 
3. Este processo de compilação gera um arquivo ".class". Este é um arquivo bytecode. 




> Você provavelmente já se deparou com o termo "máquina virtual". O uso de máquinas virtuais permite a adoção de sistemas operacionais distintos executados simultaneamente em um único computador. Isto é, podemos simular uma máquina que usa linux, mesmo que nós estejamos usando windows. Com um software de máquina virtual, somos capazes de ter uma máquina rodando dentro da nossa própria máquina.


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

