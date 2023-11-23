package javacore.introducaoClasses;

import javacore.introducaoClasses.classes.Carro; // Importando a classe Carro.

public class CriandoObjetos_02 {
    public static void main(String[] args) {

        // Observe que no arquivo "Carro.java" (nossa classe), as propriedades não têm valores definidos.
        // Como essas propriedades estão no escopo global, elas têm valores padrão predefinidos.

        Carro novoCarro = new Carro();
        System.out.println(novoCarro.cor); // Retorna 'null' porque a propriedade 'cor' é do tipo String (um objeto).
        System.out.println(novoCarro.totalRodas); // Retorna '0' porque a propriedade 'totalRodas' é do tipo 'integer'.

        /*
            Não é uma prática recomendada DEFINIR valores em nossa classe, pois todos os objetos instanciados dela
            receberão esses valores. Por exemplo, a propriedade "placa" da classe "Carro" tem um valor definido, o que não é ideal,
            pois todos os carros herdarão esse valor. Portanto, por padrão, todos os carros criados a partir dessa classe
            terão a mesma placa.

            Entretanto, essa placa pode ser alterada individualmente para cada objeto:
            novoCarro.placa = "qualquerOutraCoisa".
        */
    }
}
