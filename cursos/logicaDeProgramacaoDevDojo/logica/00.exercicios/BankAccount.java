public class BankAccount
{
    public static void main(String[] args)
    {
        // 1 - CONTA_POUPANCA
        // 2 - CONTA_CORRENTE
        // 3 - CONTA_INVESTIMENTO

        byte typeOfAccount = 1;
        float rendimentoMensal = 0F;

        switch (typeOfAccount)
        {
            case 1:
                rendimentoMensal = 0.05F;
                break;

            case 2:
                rendimentoMensal = 0.02F;
                break;

            case 3:
                rendimentoMensal = 0.1F;
                break;

            default:
                System.out.println("Tipo de conta inválido.");
        }

        System.out.println("Rendimento mensal: " + rendimentoMensal);
    }
}