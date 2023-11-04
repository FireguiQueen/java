import java.util.Scanner; 

public class CalculadoraIMC{

    public static String calcIMC(double IMC)
    {
        String categoria;

        if (IMC <= 0)
        {
            categoria = "IMC inválido";
        } 
        else if (IMC < 18.5)
        {
            categoria = "abaixo";
        } 
        else if (IMC >= 18.5 && IMC <= 24.9)
        {
            categoria = "normal";
        }
        else if (IMC >= 25 && IMC <= 29.9)
        {
            categoria = "sobrepeso";
        } 
        else if (IMC >= 30 && IMC <= 34.9)
        {
            categoria = "obesidade I";
        }
        else if (IMC >= 35 && IMC <= 39.9){
            categoria = "obesidade II";
        }
        else{
            categoria = "obesidade III";
        }

        return categoria;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        final short PESO = userInput.nextShort();

        System.out.print("Digite sua altura (cm): ");
        double ALTURA = userInput.nextDouble();

        // transforma altura em cm para metros.
        ALTURA /= 100;

        final double IMC = PESO / (ALTURA * ALTURA);   


        System.out.println("IMC: " + IMC);
        System.out.println("Categoria: " + calcIMC(IMC));
    }
}