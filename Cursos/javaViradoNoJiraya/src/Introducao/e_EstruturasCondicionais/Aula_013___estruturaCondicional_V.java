// -> EXERCÍCIO <-
// ESTRUTURA CONDICIONAL: SWITCH CASE

package introducao.e_EstruturasCondicionais;

public class Aula_013___estruturaCondicional_V
{
    public static void main(String[] args)
    {
        byte day = 4;
        boolean isWeekendDay;

        switch(day)
        {
            case 1:
            case 7:
                isWeekendDay = true;
                break;

            default:
                isWeekendDay = false;
                break;
        }

        System.out.println("Situação: " + (isWeekendDay? "Não é dia útil" : "é dia útil"));
    }
}
