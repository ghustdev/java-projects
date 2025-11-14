package salary;
import java.util.Scanner;

/**
 *
 * @author ritac
 */
public class Salary {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        double salarioBruto;
        
        System.out.println("Insira o valor do salario-hora da empresa: ");
        double salarioHora = input.nextFloat();
        
        while(counter <= 3)
        {
            System.out.println("Qual a quantidade de horas trabalhadas por"
                    + " esse funcionario?");
            int hora = input.nextInt();
            
            if(hora <= 40)
                salarioBruto = salarioHora * hora;
            else
                salarioBruto = salarioHora * 40 + (salarioHora * (hora - 40)) * 1.50; 
            
            System.out.println("O salario bruto desse funcionario e de "
                    + "R$"+salarioBruto);
            System.out.println();
            ++counter;
        }
    }
}
