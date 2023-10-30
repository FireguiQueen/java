// Números de ponto flutuante


class Aula_06{

    public static void main(String[] args){

        // variáveis que armazenam números inteiros usam o tipo 'int'.
        // Esse tipo aceita APENAS valores INTEIROS.. Não tente armazenar outra coisa, haverá erros.
        int y = 10; 

        // Para armazenar números quebrados, usamos 'double' ou 'float'.
        double x = 10.5;


        // Não utilizar números quebrados, não significa que não geraremos eles através de cálculos.
        int numero_01 = 150;
        int numero_02 = 4; 

        // Vamos realizar a divisão. 150 dividido por 4 = 37.5 (retorna um número quebrado)
        System.out.println(numero_01 / numero_02);
        // output: 37

        // O nosso output foi 37 e não 37.5, ou seja, o nosso número quebrado não apareceu. 

        // Vemos também o desaparecimento dos números quebrados neste exemplo:
        System.out.println(4 / 150); 
        // Logicamente, o resultado correto é '0,02', mas o nosso output será 0. 
        // Então vemos que de fato, apenas números inteiros estão sendo retornados.


        // Você pode pensar: "bem, a solução é bem simples :o, basta colocar o tipo de dado 'double' xD xD"
        int num0 = 150;
        int num1 = 4;
        double divisaoFinal = num0 / num1; // 150 dividido por 4. Resultado esperado: 37.5  
        
        System.out.println(divisaoFinal);
        // ouput: 37 (resultado incorreto..)

        // Mas não, não é assim que o Java funciona. Mas por que?
        /*
            Um número inteiro dividido por outro número inteiro RESULTARÁ SEMPRE em um número inteiro.
            >> INDEPENDENTE do tipo de dado que irá armazenar eles. 

            Quando dizemos que uma variável do tipo 'double' irá armazenar a divisão de 150 por 4, estamos
            apenas dizendo ao Java que aquela variável irá SURPORTAR um valor quebrado. 
            
            Mas como o valor daquela variável foi um inteiro dividido por outro inteiro, 
            o resultado é um inteiro.
          
            Para obter resultados com casas decimais, pelo menos um dos operandos deve ser um número de 
            ponto flutuante.
        */

    }
}