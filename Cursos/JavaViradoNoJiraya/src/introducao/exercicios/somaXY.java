package introducao.exercicios;

public class somaXY
{
    public static void main(String[] args)
    {
        double x = 40.0;
        double y = 40.0;

        double resultado = somar(x, y);
        System.out.println("Resultado: " + resultado);

    }

    public static double somar(double x, double y)
    {
        return x + y;
    }
}