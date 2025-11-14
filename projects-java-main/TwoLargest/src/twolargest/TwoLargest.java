package twolargest;
import java.util.Scanner;

/**
 *
 * @author ritac
 */
public class TwoLargest 
{
    
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        int number, largest, largest2;
        int counter = 3;
        
        System.out.println("Numero 1: ");
        number = input.nextInt();
        largest = number;
        
        System.out.println("Numero 2: ");
        number = input.nextInt();
        largest2 = number;
        
        while(counter <= 10)
        {
            System.out.println("Numero " + counter + ": ");
            number = input.nextInt();
            
            if(largest < number){
                largest = number;
            }
            else{
                largest2 = number;
            }
                
            ++counter;
        }
        
        if(largest > largest2){
            System.out.println("O maior numero e: "+largest);
            System.out.println("O segundo maior numero e: "+largest2);
        }
        else{
            System.out.println("O maior numero e: "+largest2);
            System.out.println("O segundo maior numero e: "+ largest);
        }
    }
}
