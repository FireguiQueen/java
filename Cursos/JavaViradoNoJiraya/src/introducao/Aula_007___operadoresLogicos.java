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

public class Aula_007___operadoresLogicos
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
        /*
            Com o operador 'or', apenas uma das expressões precisa ser verdadeira.
            Podemos pensar na seguinte situação:

            Você deseja comprar um PS5, para isso, você precisa ter R$5.000.
            Você possui duas contas bancárias, e seu objetivo é verificar se pelo menos uma dessas
            contas possui o saldo necessário para comprar o videogame.
        */
        double contaBancariaPrincipal = 200;
        double contaPoupanca = 9000;

        double valorPlaystation = 5000;

        boolean playStationCincoEhCompravel = contaBancariaPrincipal >= valorPlaystation || contaPoupanca >= valorPlaystation;
        // Expressão completa: contaBancariaPrincipal >= valorPlaystation || contaPoupanca >= valorPlaystation
        // Aqui, o operador lógico OR (||) verifica se pelo menos uma das condições é 'true'.
        // Se sim, a expressão completa também é 'true'.
        // Neste exemplo, a primeira expressão: contaBancariaPrincipal >= valorPlaystation, retorna 'false'.
        // Mas a segunda retorna 'true'. Logo, a expressão completa nos retorna 'true'.

        // EXEMPLOS:
        System.out.println(true || true ); // retorna true.
        System.out.println(true || false ); // retorna true, pois uma das expressões é 'true'.
        System.out.println(false || false ); // retorna false, pois nenhuma das expressões é 'true'.

        boolean paisPermitiram = true;
        int age = 15;
        boolean podeComprarCerveja = paisPermitiram || age >= 18;
        // Podemos dizer que a pessoa não tem idade para comprar cerveja. Mas a pergunta foi:
        // A idade é maior ou igual a 18  OU  os pais permitiram?
        // Apenas uma precisa ser 'verdadeira' para que a expressão completa retorne 'true'.


        // **** **** ****** ******

        // COMO FUNCIONA O OPERADOR LÓGICO OR QUANDO USADO REPETIDAMENTE?
        // O operador lógico OR é simples: ele compara os dois valores à sua esquerda e à sua direita.
        // Para retornar true, apenas uma expressão (seja a da direita ou a da esquerda) precisa ser verdadeira.
        // Neste caso específico:
        System.out.println(false || true || true || true);
        // Primeiro, ocorre: false || true --> retorna true.
        // Com este falso retornado, é avaliado "true || true" --> retorna true.
        // Novamente, é avaliado: "true || true" --> retorna true.
        // Por fim, é avaliado: "true || true" --> retorna true.
        // O resultado final impresso será true.

    }
}
