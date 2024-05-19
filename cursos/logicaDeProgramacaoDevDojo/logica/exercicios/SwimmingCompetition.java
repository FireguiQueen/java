public class SwimmingCompetition
{
    public static void main(String[] args)
    {
        String name = "Otavio";
        String categoria = "";
        short age = 22;

        if (age < 10)
        {
            categoria = "infantil";
        } 
        else if (age >= 11 && age <= 15)
        {
            categoria = "juvenil";   
        }
        else if (age >= 16 && age <= 19)
        {
            categoria = "pre-adulto";   
        } else 
        {
            categoria = "adulto";   
        }

        System.out.print(name + ": participará da categoria " + categoria);   
        
        
    }
}
