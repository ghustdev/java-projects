package numberlargest;
import java.util.Scanner;

/**
 *
 * @author ritac
 */
public class NumberLargest {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int number;
        int largest = 0;
        
        while(counter <= 10)
        {
            System.out.println("Insira um numero inteiro: ");
            number = input.nextInt();
            
            if(number > number)
                largest = number;
            else
                largest = number;
            
            ++counter;
        }
        
        System.out.println("O maior numero e: "+largest);
    }
}
