# Operadores lógicos 
Asssim como os operadores de comparação, os operadores lógicos compartilham do mesmo objetivo: retornar um valor boolean
após uma analise de dois operandos. 

________________________

## `&&`
O operador `and` requer que ambos os valores ou expressões sejam verdadeiros para retornar `TRUE`; caso contrário, retornará `FALSE`.

Vamos pensar em uma situação prática: para decidir sair de casa, você precisa de duas condições: ter dinheiro **e** o dia estar ensolarado. O "e" está em negrito porque é crucial para determinar nossa saída. Ele indica que tanto ter dinheiro quanto o dia estar ensolarado são requisitos __indispensáveis__.

Se não tivermos dinheiro, mesmo que o dia esteja ensolarado, não sairemos. Da mesma forma, se tivermos dinheiro, mas se o dia não estiver ensolarado, também ficaremos em casa.

```java
boolean tenhoDinheiro = true;
boolean estaEnsolarado = true;

if (tenhoDinheiro && estaEnsolarado) {
  System.out.print("Eu irei sair! Pois tenho dinheiro e o dia está ensolarado!");
} else {
  System.out.print("Eu não irei sair.");
}
```

<br>

## `||`

O operador `or` requer que apenas um dos valores ou expressões seja verdadeiro para retornar `TRUE`.

Pensando em uma situação prática: para você decidir ir ao parque, você precisa que apenas uma das condições seja verdadeira: estar com vontade **ou** alguém te chamar para ir junto. O "ou" destacado nos indica que apenas uma das condições precisa ser atendida.

Se tivermos vontade, e ninguém nos chamar, está tudo bem, iremos do mesmo jeito. Da mesma forma, podemos não ter vontade, mas se alguém nos chamar para ir, nós iremos ao parque.

```java
boolean vontadeDeSair = false;
boolean alguemNosChamouParaIr = true;

if (vontadeDeSair || alguemNosChamouParaIr) {
  System.out.print("Eu irei ao parque!");
} else {
  System.out.print("Eu não irei sair.");
}
```
