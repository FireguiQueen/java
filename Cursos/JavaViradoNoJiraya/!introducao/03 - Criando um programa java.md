1. Crie um arquivo com a extensão `.java`
2. O nome deste arquivo deve ser o mesmo nome da __classe__

3. Escreve as instruções do programa:
```java
    public class primeiroPrograma
    {
        public static void main(String[] args)
        {
            System.out.println("Olá =) ");
        }
    }
```
> Não se preocupe em entender o código por agora. Apenas saiba que `public class primeiroPrograma` é a nossa classe, é o nosso programa em si. O `public static void main(..)` é o método principal do nosso programa, isto é, todas as nossas instruções devem ser contidas nele por agora. Este é o método principal, e ele que da o ponto de partida para o nosso programa. A linha que contém o `println("Olá..")` é a linha responsável por printar (imprimir) uma mensagem em nosso terminal.

<br>

3. Após escrever o programa, compile-o
> (será gerado um arquivo `.class`)

5. Pegue este arquivo `.class` e mande ele ser lido pela JVM através do comando `java`
```text
    java primeiroPrograma 
```
