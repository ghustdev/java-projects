package sales;
import java.util.Scanner;

/**
 *
 * @author ritac
 */
public class Sales {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double valueTotal = 0;
        int counter = 0;
        
        System.out.println("Insira o numero do vendedor ou -1 para sair: ");
        int vendedor = input.nextInt();
        
        while(vendedor != -1)
        {
            System.out.println("Insira o valor do item vendido ou -1 para sair: ");
            float value = input.nextFloat();
            
            while(value != -1)
            {
                valueTotal += value;
                counter += 1;
                
                System.out.println("Insira o valor do item vendido ou -1 para sair: ");
                value = input.nextFloat();
            }
            
            if (counter != 0)
            {
                double total = 200 + valueTotal * 1.09;
                
                System.out.println("O rendimento do vendedor "+vendedor+" e de R$"+total);
                System.out.println();
            }
            
            System.out.println("Insira o numero do vendedor ou -1 para sair: ");
            vendedor = input.nextInt();
        }
    }
}
