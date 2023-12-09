/*
Login Simples:
    Implemente um programa de login simples. Peça ao usuário que insira um nome de usuário e uma senha. Se o nome de
    usuário for "admin" e a senha for "senha123", exiba uma mensagem de boas-vindas, caso contrário, exiba uma mensagem de erro.
*/
package introducao.z_Exercicios;
import java.util.Objects;
import java.util.Scanner;

public class loginSimples
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Usuário: ");
        String user = userInput.next();

        System.out.print("Senha: ");
        String password = userInput.next();


        System.out.println("Codigo de acesso (opcional): ");
        long codeAcess = userInput.nextLong();

        String checkUserCredentials = (Objects.equals(user, "admin") && Objects.equals(password, "senha123") || codeAcess == 675734634634634634L)? "Olá, seja bem vindo!" : "Usuário ou senha incorretos.";

        System.out.println(checkUserCredentials);

    }
}
