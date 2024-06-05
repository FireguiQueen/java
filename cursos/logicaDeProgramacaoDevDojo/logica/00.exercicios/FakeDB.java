import java.util.Scanner;

public class FakeDB
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);



        while (true)
        {
            System.out.println("User: ");
            String user = input.next();

            if (user == null  || user.equals("") || user.equals("adm") || user.equals("administrador"))
            {
                System.out.println("Digite um usuário válido.");
                continue;
            }
            break;
        }
        System.out.println("Usuário cadastrado com sucesso!");

    }
}