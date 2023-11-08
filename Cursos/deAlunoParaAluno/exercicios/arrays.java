public class arrays
{
    public static void main(String[] args)
    {

        // Construa um método capaz de iterar sobre uma lista de nomes.
        String[] nomes = {"Guilherme", "Flora", "Paulo", "Bruno"};
        iterarArray(nomes);


        // Construa um método capaz de iterar sobre arrays multidimensionais 
        String[][] escolasDiretores = { {"Vladimir", "Walter Merrison"}, {"Julia Avocado", "Mary Kauser"}};
        iterarArrayM(escolasDiretores);

        // Construa um método capaz de retornar o último e o primeiro elemento de um array. 
        int[] list = {200, 100, 900, 13414, 131, 142};
        primeiroUltimo(list);
    }

    public static void iterarArray(String[] nomes)
    {
        int arrayLength = nomes.length; 

        for (int i = 0; i < arrayLength; i++)
        {
            System.out.println(nomes[i]);
        }
    } 

    public static void iterarArrayM(String[][] escolas)
    {
        int arrayLength = escolas.length; 
        
        for (int i = 0; i < arrayLength; i++)
        {
            for (int j = 0; j < escolas[i].length; j++)
            {
                System.out.println(escolas[i][j]);
            }
        }
    }

    public static void primeiroUltimo(int[] numeros)
    {
        int arrayLength = numeros.length;
        System.out.println("Primeiro elemento: " + numeros[0]); 
        System.out.println("Último elemento: " + numeros[arrayLength - 1]);
    }

}