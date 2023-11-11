> A partir desta aula, todas as outras serão contidas em pacotes. O pacote que contém as próximas aulas é o `src`. 

# Packages (pacotes)
Os pacotes são na verdade, sub-diretórios, eles ficam contidos no diretório `src`. Eles são 
utilizados para organizar o nosso programa. 

### Analogia-01
Podemos fazer uma analogia com um curso, onde nele será organizado varios módulos diferentes, então por exemplo,
teremos o primeiro módulo chamado "Artimética", pelo __nome__, já é de se esperar que os vídeos são relacinados a soma, subtração, divisão e assim por diante.
Já o segundo módulo, chama-se "Algebra", e pelo seu __nome__, é de se esperar vídeos relacionados a equações, fatoração e etc.

![analogia-01](./others/explicacaoPackges.png)
> Imagem ilustrativa retirada da internet

<br>

### Analogia-02
Outro exemplo disso seria o nosso próprio computador. Vamos supor que você goste de tirar muitas
fotos, e ao mesmo tempo, você é um cara organizado. Sendo assim, o diretório que conterá suas fotos, pode ser
organizado da seguinte maneira:

![analogia-02](./others/img.png)

### Pacotes em pŕatica
Para se criar pacotes, existe uma convenção, isto é, um jeito padronizado de se organizar eles.
Vamos imaginar, que sua empresa se chama Power Soft e ela está desenvolvendo um website comercial e um site
de código aberto. Serão dois sites diferentes, com própositos diferentes, mas ambos, pertencem a mesma empresa. 

- A url do site comercial será: __powersoft.com__ 
> O “com” no nome de domínio .com indica um site “comercial”. Isso pode abranger sites de negócios, sites que desejam ganhar dinheiro online , sites pessoais, blogs, portfólios e etc.

- A url do site de código será: __powersoft.org__
> O nome é a abreviação para "organização", porque o domínio . org foi projetado, no início, para ser usado em sites de organizações não-comerciais (sem fins lucrativos).

Para organizar toda essa estrutura, Vamos começar pelo diretório chamado `src (source)`.
O `src` será responsável por armazenar todos os projetos desta empresa. A Power Soft está desenvolvendo tanto um projeto
voltado a área comericial, quanto um voltado para um organizacional

O nosso pacote principal será chamado "com.powersoft"



__Conclusão:__ por mais que em Java temos o nome "pacote", este conceito já existe há muito tempo.
A diferença é que, no Java, tods os arquivos dos nossos pacotes estão relacionados ao nosso programa.

