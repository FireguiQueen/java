// OPERADORES LÓGICOS
/*
    São eles:
    and: &&
    or: ||

    Quando usados em expressões, eles fazem com que a expressão retorne 'TRUE' ou 'FALSE'.
    O operador 'and' (&&) requer que duas expressões sejam verdadeiras para retornar 'TRUE'.
    O operador 'or' (||) requer que apenas uma das duas expressões seja verdadeira para retornar 'TRUE'.
*/
package introducao;

public class Aula_007_operadoresLogicos
{
    public static void main(String[] args)
    {
        // Abaixo, temos uma expressão "normal".
        int num = (50 + 50) * 2; // Essa expressão retorna o valor de 200.

        // Agora, uma expressão que utiliza um operador de COMPARAÇÃO, retornando 'true' ou 'false'.
        boolean y = 20 > 10;

        // Vamos usar operadores lógicos em expressões.
        // Neste exemplo, avaliamos a condição financeira considerando dois requisitos:
        // 1. Ter uma casa.
        // 2. Ter mais de 30.000 no banco.

        boolean temCasa = true;
        boolean temTrintaMil = true;
        boolean condicaoFinanceiraBoa = temCasa && temTrintaMil;

        // Expressão completa: temCasa && temTrintaMil
        // Aqui, o operador lógico AND (&&) verifica se ambas as condições são 'true'.
        // Se sim, a expressão completa também é 'true'.

        // LEMBRE-SE, ao usar o operador 'AND', a expressão completa retorna 'true' apenas se todas as expressões forem verdadeiras.

        // EXEMPLOS:
        System.out.println(true && true); // true (ambas são verdadeiras)
        System.out.println(true && false); // false (uma delas é falsa)
        System.out.println(true && true && true); // true (todas são verdadeiras)
        System.out.println(false && true && true); // false (uma delas é falsa)

        // COMO FUNCIONA O OPERADOR LÓGICO AND QUANDO USADO REPETIDAMENTE?
        // O operador lógico AND é simples: ele compara os dois valores à sua esquerda e à sua direita.
        // Para retornar true, ambos os valores precisam ser true.
        // Neste caso específico:
        System.out.println(false && true && true && true);
        // Primeiro, ocorre: false && true --> retorna false.
        // Com este falso retornado, é avaliado "false && true" --> retorna false.
        // Novamente, é avaliado: "false && true" --> retorna false.
        // Por fim, é avaliado: "false && true" --> retorna false.
        // O resultado final impresso será false.

        // Seria a mesma coisa que colocar:
        System.out.println( (false && true) && (true && true) );
        // É avaliado o primeiro parêntese: (false && true), retornando 'FALSE'.
        // Depois é avaliado o segundo parêntese: (true && true), retornando 'TRUE'.
        // E, por fim, temos a expressão final: FALSE && TRUE, que retorna 'false'.


        // Verificar se pode comprar bebidas alcoólicas: precisa ser maior de idade e ter dinheiro suficiente.
        double carteira = 30.0;
        int idade = 20;
        boolean podeComprarABreja = carteira >= 5 && idade >= 18;
        // a variável 'podeComprarABreja' receberá 'true' porque a carteira tem mais de 5 e a idade é maior que 18.

        // ****** * * ********* * ************ *** ****** ****** * ************ * * *************

        // Operador 'or' (||)

    }
}
