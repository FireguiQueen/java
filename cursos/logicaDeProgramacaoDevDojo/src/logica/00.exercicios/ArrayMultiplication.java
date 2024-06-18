public class ArrayMultiplication
{
    public static void main(String[] args)
    {
        int arrayA[] = {1, 2, 3, 4, 5};
        int arrayB[] = {5, 10, 100, 1000, 10000};

        int totalLength = (arrayA.length);

        int arrayC[] = new int[totalLength];
        String numeroTotalArrayC = "";

        for (int i = 0; i < totalLength; i++)
        {
            int multiplicandoArrays = (arrayA[i] * arrayB[i]);
            arrayC[i] = multiplicandoArrays;
            numeroTotalArrayC = numeroTotalArrayC + multiplicandoArrays + " ";
        }

        System.out.println(numeroTotalArrayC);
    }
}