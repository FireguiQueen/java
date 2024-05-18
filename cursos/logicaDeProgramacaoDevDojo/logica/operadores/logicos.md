# Operadores lógicos 
Asssim como os operadores de comparação, os operadores lógicos compartilham do mesmo objetivo: retornar um valor boolean
após uma analise de dois operandos. 

## `&&` 
O operador `and` requer que ambos os valores ou expressões sejam verdadeiros para retornar `TRUE`; caso contrário, será retornado `FALSE`.

Vamos pensar em uma situação prática: para decidir sair de casa, você precisa de duas condições: ter dinheiro **e** o dia estar ensolarado. Observe que o "e" está em negrito, pois ele é crucial para determinar nossa saída. Ele indica que tanto ter dinheiro quanto o dia estar ensolarado são requisitos __indispensáveis__.

Se não tivermos dinheiro, mesmo que o dia esteja ensolarado, não sairemos. Da mesma forma, se tivermos dinheiro, mas o dia estiver nublado, também ficaremos em casa.
```java
  boolean tenhoDinheiro = true;
  boolean estaEnsolarado = true;

  if (tenhoDinheiro && estaEnsolarado)
  {
    System.out.print("EU irei sair! Pois tenho dinheiro e o dia está ensolarado!");
  } else {
    System.out.print("Eu não irei sair.");
  }
```

## `||`
