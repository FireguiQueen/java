public class Army
{
    public static void main(String[] args)
    {
        short age = 14;
        char genero = 'F';
        boolean alistamentoObrigatorio = false;

        if (age < 18)
        {
            System.out.println("Não pode se alistar.");
        } else if (age >= 18 && genero == 'M')
        {
            alistamentoObrigatorio = true;
        } else {
            alistamentoObrigatorio = false;
        }

        System.out.print("Alistamento: ");
        System.out.println(alistamentoObrigatorio? "obrigatório" : "não-obrigatório");
    }
}