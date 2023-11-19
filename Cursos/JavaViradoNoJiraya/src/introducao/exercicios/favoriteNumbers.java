package introducao.exercicios;

public class favoriteNumbers
{
    public static void main(String[] args)
    {
     int[] myNumbers = {7, 17, 18, 19, 600};
     int arrayLength = myNumbers.length;

     for (int i = 0; i <= 670; i++)
     {
         for (int j = 0; j < arrayLength; j++)
         {
            if(i == myNumbers[j]) System.out.println("-> " + i);
         }
     }


    }
}
