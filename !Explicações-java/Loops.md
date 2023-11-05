#### Sumário
[Loops](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#criando-um-array") &nbsp; | &nbsp;
[While](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#arrays-multidimensionais) &nbsp; | &nbsp;
[Do while](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#iterando-um-array) &nbsp; | &nbsp;
[For](https://github.com/FireguiQueen/Java/blob/main/!Explica%C3%A7%C3%B5es-java/arrays.md#iterando-um-array) 

# Loops
Os loops são repetições, e são de extrema importância para repetirmos instruções de maneira dinâmica e eficiente. Além disso, são eles que nos permitem percorrer em arrays, strings e etc. 

Para criar um loop temos três estruturas: `for`, `while` e `do while`.

### Utilidade
Para mostrar o quão útil um loop é, criaremos um programa onde seu papel é apenas printar a mensagem "hello" 10 vezes. Não se preocupe caso não entenda o código, quero que apenas pense qual parece mais eficiente. 

- Sem loop
```java
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
```

- Com loop
```java
    for (int i = 0; i < 4; i++)
    {
        System.out.println("Hello");
    }
```

# Sintaxe: while
