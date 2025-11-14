package largest;
import java.util.Scanner;

/**
 *
 * @author ritac
 */
public class Largest 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int number, largest;
        int counter = 2;
        
        System.out.println("Numero 1: ");
        number = input.nextInt();
        largest = number;
        
        while(counter <= 10)
        {
            System.out.println("Numero " + counter + ": ");
            number = input.nextInt();
            
            if(largest < number){
                largest = number;
            }
            ++counter;
            
             System.out.println("O maior numero e: "+largest);
        }
    }
}
