package introducao.exercicios;

public class categoriaFutebol
{
    public static void main(String[] args)
    {
        // menor que 15 = infantil
        // entre 15 e 17 =  juvenil
        // maior que 18 = adulta

        int age = 14;

        if (age < 15)
        {
            System.out.println("Você faz parte da categoria: infantil");
        } else if (age >= 15 && age <= 17)
        {
            System.out.println("Você faz parte da categoria: juvenil");
        } else
        {
            System.out.println("Você faz parte da categoria: adulta");
        }
    }
}