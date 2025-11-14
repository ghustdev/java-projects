package employeetest;

/**
 *
 * @author Gustavo Cardoso
 */
public class EmployeeTest 
{

    
    public static void main(String[] args) 
    {
        Employee employee1 = new Employee("Gustavo Green", 2000.00);
        Employee employee2 = new Employee("Ster Red", 3000.00);

        // exibe o salario mensal de cada objeto
        System.out.printf("%s month salary: $%.2f %n",
        employee1.getName(),employee1.getSalarym());
        System.out.printf("%s month salary: $%.2f %n%n",
        employee2.getName(),employee2.getSalarym());
        
        // exibe o salario anual de cada objeto
        System.out.printf("%s annual salary: $%.2f %n",
        employee1.getName(),employee1.getSalarya());
        System.out.printf("%s annual salary: $%.2f %n%n",
        employee2.getName(),employee2.getSalarya());
        
        // exibe o salario anual com aumento de 10% sobre o mensal de cada objeto
        System.out.printf("%s employee: $%.2f %n",
        employee1.getName(),employee1.getSalarya10());
        System.out.printf("%s employee: $%.2f %n%n",
        employee2.getName(),employee2.getSalarya10());
 
    } // fim de main    
    
}
