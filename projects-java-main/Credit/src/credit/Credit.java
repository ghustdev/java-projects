package credit;
import java.util.Scanner;

/**
 *
 * @author ritac
 */
public class Credit {

   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int saldoF = 0;
        int limite = 2000;
        
        System.out.println("Insira o numero da conta ou insira -1 para sair: ");
        int numConta = input.nextInt();
        
        while ( numConta != -1)
        {
            System.out.println("O limite do cliente "+numConta+" e de R$ "+limite);
            
            System.out.println("Insira o saldo do cliente: ");
            int saldoI = input.nextInt();
            
            System.out.println("Insira as despesas / o total de itens cobrados desse cliente no mes: ");
            int despesas = input.nextInt();
            
            System.out.println("Insira o total de creditos/beneficios aplicados ao cliente no mes: ");
            int creditos = input.nextInt();
            
            saldoF = saldoI + despesas - creditos;
            System.out.println("O solda final e de R$ "+saldoF);
            
            if (saldoF > limite)
                System.out.println("O limite de credito foi exedido");
            
            System.out.println("Insira o numero da conta ou insira -1 para sair: ");
            numConta = input.nextInt();
        }
    }   
}
