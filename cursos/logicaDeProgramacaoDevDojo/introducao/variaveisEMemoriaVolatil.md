# Variáveis
As variáveis são formas de armazenar valores em um determinado endereço. Podendo
alterá-los e utilizá-los como for conveniente, elas desempenham um papel crucial 
em nosso programa. 

Em java, para criamos uma variável, precisamos de três coisas essencias:
1. Definir o tipo de dado que esta variável irá armazenar;
2. Definir o nome desta variável; 
3. Atribuir um valor a esta variável. 
```java
public class programa
{
    public static void main(String[] args) {
        //1.  2.    3.
        int idade = 50; 
        System.out.print(idade);
    }
}
```

Temos também a possibilidade de __declarar__ uma variável e atruibur um valor a ela futuramente.
```java
public class programa
{
    public static void main(String[] args) {
        int idade; 
        idade = 50;
        
        System.out.print(idade);
    }
}
```

## Memória volátil e variáveis
Quando criamos uma variável, na verdade, o que estamos realmente fazendo é:
1. Alocar um espaço em memória;
2. Este espaço recebe um endereço;
3. Atribuimos um valor a este endereço.

![image](https://github.com/FireguiQueen/Java/assets/98475125/fda89935-d180-4a56-a0ff-f7be5b1015df)

Então, quando printamos o valor de nossa variável no terminal através do `System.out.print(idade)`, na verdade, `idade` refere-se
ao endereço do espaço alocado que armazena um valor.


## Valores primitivos na memória volátil
Em java, temos os seguintes valores primitivos:
- short: ao declarar uma variável do tipo short, é alocado espaço em memória de 16 bits. Números decimais que exedem este valor para ser repretando em formato binário, não serão capazes de pertencer a este espaço alocado.  
- byte
- int
- long
- float
- double
- char
- boolean 
