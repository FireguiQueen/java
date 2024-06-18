import java.util.Scanner;

public class UserAccount
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        final String userMaster = "firegin";
        final int passwordUserMaster = 123;

        while (true)
        {
            System.out.print("User: ");
            String user = input.next();

            System.out.print("Password: ");
            int password = input.nextInt();

            if (user.equals(userMaster) && password == passwordUserMaster)
            {
                System.out.println("Usuário e senha corretos!");
                break;
            }
            System.out.println("Usuário/ senha inválidos!");
        }

    }
}