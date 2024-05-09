# Comentários

## Utilidade
Comentários são utilizados para *comentar* trechos ou blocos de código. Lembre-se que, trabalhando como desenvolvedor, você não será o único a mexer no código fonte de um software.

## Comentários fazem parte do software final?
Não. Os comentários permanecem apenas durante a fase de manutenção/desenvolvimento de um software. Quando compilamos nosso programa `.java`, todos os comentários são removidos. Nosso arquivo `.class` não possuirá comentários, pois eles são irrelevantes para a JVM e são úteis apenas para nós, humanos.

## Perigo

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