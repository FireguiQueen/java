> A partir desta aula, as aulas ficaram contidas no diretório `src`. 

# Packages (pacotes)
Um pacote armazena classes que podem desempenhar diferentes papéis em nosso programa. O Java já disponibiliza 
milhares de classes contidas em diversos pacotes. Por exemplo, o pacote 'util' do Java contém muitas classes, 
incluindo a classe Scanner, a qual usamos para receber informações do usuário via terminal.

Um projeto simples pode ser composto por uma quantidade enorme de classes, cada uma desempenhando um papel 
específico no programa. Por exemplo, temos classes para tipos de dados, representação de texto, números, datas, 
conexão com bancos de dados, entre outras funcionalidades. Imagina todas essas classes existindo juntas em um 
único nível de documento? E as classes que foram desenvolvidas por nós para criar o programa? 
__Como ficaria a organização desse nosso diretório, hein?!__
> Os pacotes são, na verdade, subdiretórios contidos no diretório src. Eles são utilizados para organizar 
> nosso programa e também conterão as classes usadas no desenvolvimento do programa.

<br>

### Analogia-01
Pode-se fazer uma analogia com um curso de matemática, onde o mesmo é organizado por seções. 
Por exemplo, teremos o primeiro módulo chamado 'Aritmética'. Pelo nome, já é de se esperar que os vídeos 
estejam relacionados a soma, subtração, divisão e assim por diante. 
Já no segundo módulo, chamado 'Álgebra', é de se esperar vídeos relacionados a equações, 
fatoração e outros temas similares. _Podemos imaginar que as seções são os pacotes, e as aulas desta seção são as classes._

![analogia-01](./others/explicacaoPackges.png)
> Imagem ilustrativa retirada da internet. 

<br>

### Analogia-02
Suponha que você goste de tirar muitas fotos e, ao mesmo tempo, valorize a organização. 
Para salvar suas fotos, você as deixa em seu PC. O diretório (pasta) que contém suas fotos poderia ser organizado 
da seguinte maneira: 

![analogia-02](./others/img.png)
> As pastas 'fotosEspeciais', 'Animais', 'Viagens'.. São pacotes. E as fotos contidas nesses pacotes, são as classes.

<br>

________________

# Pacotes em prática
Para criar pacotes, existe uma convenção, ou seja, um método padronizado de organizá-los. 
Imagine que sua empresa se chama Power Soft e está desenvolvendo um site comercial. 

Para estruturar o nosso diretório, começamos com o diretório chamado `src (source)`. 
O `src` será responsável por armazenar todos os projetos dessa empresa      .

![explicacao-src](./others/src.png)

- A url do site comercial será: __powersoft.com__ 
> O “com” no nome de domínio .com indica um site “comercial”. Isso pode abranger sites de negócios, sites que desejam ganhar dinheiro online , sites pessoais, blogs, portfólios e etc.

- A url do site de código será: __powersoft.org__
> O nome é a abreviação para "organização", porque o domínio . org foi projetado, no início, para ser usado em sites de organizações não-comerciais (sem fins lucrativos).

A Power Soft está desenvolvendo dois projetos, um será relacionado a área comericial, e o outro, será a parte institucional.
Então, _criaremos dois novos pacotes_ dentro do `src`. 

![explicacao-packages](./others/srcPackages.png)
> O pacote `.com` que se refere ao projeto comercial da empresa. <br>
> E o pacote `.org` que se refere ao projeto institucional da empresa que não possui fins lucrativos.



__Conclusão:__ por mais que em Java temos o nome "pacote", este conceito já existe há muito tempo.
A diferença é que, no Java, tods os arquivos dos nossos pacotes estão relacionados ao nosso programa.

