
package heartratetest;

/**
 *
 * @author Gustavo
 */
import java.util.Scanner;

public class HeartRateTest 
{

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira seu nome: ");
        String nome = input.nextLine();
        
        System.out.println("Insira seu sobrenome: ");
        String sobreNome = input.nextLine();
        
        System.out.println("Insira o dia do seu nascimento: ");
        int dia = input.nextInt();
        
        System.out.println("Insira o mês do seu nascimento: ");
        int mes = input.nextInt();
        
        System.out.println("Insira o ano do seu nascimento: ");
        int ano = input.nextInt();
        
        HeartRate teste = new HeartRate(nome,sobreNome, dia, mes, ano);   
        
        System.out.println("\n\nOlá "+teste.getNome());
        System.out.println("Você tem "+teste.getIdade()+" anos");
        System.out.println("Sua frequencia cardiaca máxima é de "+teste.freqMax()+" batimentos por minuto");
        System.out.println("E "+teste.freqAlvo());
    }
    
}
    
    

