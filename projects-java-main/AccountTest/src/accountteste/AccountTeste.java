package accountteste;

/**
 *
 * @author Gustavo
 */
import java.util.Scanner;

public class AccountTeste
 {
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", 30.00);

        // exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n",
        account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
        account2.getName(),account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdrawal amount for account1: "); // prompt
        double withdrawalAmount = input.nextDouble(); // obtém a entrada do usuário
        if(withdrawalAmount>=account1.getBalance())
        {
            System.out.println("Withdrawal amount exceeded account balance");
        }
        else{System.out.printf("%nwithdralwing %.2f to account1 balance%n%n",
        withdrawalAmount);
        account1.withdrawal(withdrawalAmount); // adiciona o saldo de account1
        }
        // exibe os saldos
        System.out.printf("%s balance: $%.2f %n",
        account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
        account2.getName(),account2.getBalance());
 

        System.out.print("Enter withdraw amount for account2: "); // prompt
        withdrawalAmount = input.nextDouble(); // obtém a entrada do usuário
        if (withdrawalAmount>=account2.getBalance())
        {
            System.out.println("Withdrawal amount exceeded account balance");       
        }
        else{
        System.out.printf("%nwithdraw %.2f to account2 balance%n%n",
        withdrawalAmount);
        account2.withdrawal(withdrawalAmount); // adiciona ao saldo de account2
        }
        
        // exibe os saldos
        System.out.printf("%s balance: $%.2f %n",
        account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
        account2.getName(),account2.getBalance());
    } // fim de main
} // fim da classe AccountTest