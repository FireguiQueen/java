# Comentários

## Utilidade
Comentários são utilizados para *comentar* trechos ou blocos de código. Lembre-se que, trabalhando como desenvolvedor, você não será o único a mexer no código fonte de um software.

## Comentários fazem parte do software final?
Não. Os comentários permanecem apenas durante a fase de manutenção/desenvolvimento de um software. Quando compilamos nosso programa `.java`, todos os comentários são removidos. Nosso arquivo `.class` não possuirá comentários, pois eles são irrelevantes para a JVM e são úteis apenas para nós, humanos.

## Perigo
Comentar um trecho de código pode indicar alguns problemas no código-fonte. Por exemplo, se você se vê precisando comentar frequentemente partes do código, isso pode sinalizar que o código está mal estruturado ou mal documentado. Comentários excessivos muitas vezes indicam que o código não está claro o suficiente por si só, o que pode dificultar o entendimento para outros desenvolvedores (e até para você mesmo no futuro).

É importante lembrar que comentários devem ser usados de forma pontual e estratégica, para esclarecer partes complexas ou fornecer informações adicionais que não são óbvias apenas lendo o código. Se você se encontra comentando repetidamente trechos extensos de código, pode ser hora de revisar e refatorar o código para torná-lo mais claro e autoexplicativo.


## Tipos

### In line
Comentários que são feitos linha por linha. `//`
```java
    // isto é um comentário de linha.
    // !  
```

### Block
Comentários que são feitos dentro de um bloco. `/* */`
```java
    /* 
        isto é um comentário em
        bloco.
     */
```

### Java Doc 
Geralmente utilizado para documentar classes, ou seja, grandes trechos de códigos
e complexos. Este tipo de comentário aceita formatação HTML. `/** */`
```java
    /** 
        isto é um comentário em <h1>javaDoc</h1>.
        Posso colocar algumas tags html aqui e elas serão devidamente interpretadas.
     */
```