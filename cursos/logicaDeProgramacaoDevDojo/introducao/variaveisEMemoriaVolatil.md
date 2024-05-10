# Variáveis
As variáveis são formas de armazenar __valores__ em um determinado endereço da memória. Podendo
alterá-los e utilizá-los como for conveniente, as variáveis desempenham um papel crucial 
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

### Tipo de dado para valores numéricos
- __byte__: ao declarar uma variável do tipo byte, é alocado espaço em memória de 8 bits (1 byte). Números decimais que exedem este valor para ser repretando em formato binário, não serão capazes de pertencer a este espaço alocado. 
- __short__: ao declarar uma variável do tipo short, é alocado espaço em memória de 16 bits. Números decimais que exedem este valor para ser repretando em formato binário, não serão capazes de pertencer a este espaço alocado.  
- __int__: ao declarar uma variável do tipo int, é alocado espaço em memória de 32 bits. Números decimais que exedem este valor para ser repretando em formato binário, não serão capazes de pertencer a este espaço alocado.
- __long__: ao declarar uma variável do tipo long, é alocado espaço em memória de 64 bits. Números decimais que exedem este valor para ser repretando em formato binário, não serão capazes de pertencer a este espaço alocado.
- __float__: ao declarar uma variável do tipo float, é alocado espaço em memória de 32 bits. Números decimais que exedem este valor para ser repretando em formato binário, não serão capazes de pertencer a este espaço alocado. A diferença entre o float e o int, é que o float aceita números decimais (números com vírgula, ex: 3.50)
- __double__: ao declarar uma variável do tipo double, é alocado espaço em memória de 64 bits. Números decimais que exedem este valor para ser repretando em formato binário, não serão capazes de pertencer a este espaço alocado. A diferença entre o double e o long, é que o double aceita números decimais.

```java
short idade = 77;
int totalPessoasBrasileiras = 250000;
long totalPessoasMundo = 8000000000L;
float salario = 4000.50F;
```

<br>

### Tipo de dado para caracteres 
- __char__: ao declarar uma variável do tipo char, é alocado espaço em memória de 8 bits. Este espaço alocado em memória é utilizado para armazenar __somente__ 1 caracter, nada além disso. Não tente colocar, por exemplo, dois caracteres. Pois você estará tentando colocar 16 bits de informação em um espaço que aguenta apenas 8.  

É possível informar um caracter de duas formas:
```java
char letra = 'a';
    // ou
char letra = 65; 
```
__No fim, tanto a letra 'a' quanto o valor 65, representam o valor de `01100001` (8 bits).__

<br>

 ### Tipo de dado para representar verdadeiro/falso 
- __boolean__: ao declarar uma variável do tipo boolean, é alocado espaço em memória de 1 bit, este digito binário pode ser __zero__ ou __um__. Zero representa 'falso' e um representa 'verdadeiro'.  
