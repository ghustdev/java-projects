import java.util.Scanner;
public class NumberLargest {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int number;
        int largest = 0;
        
        while(counter <= 5)
        {
            System.out.println("Insira um numero inteiro: ");
            number = input.nextInt();
            
            if(number > largest)
                largest = number;
            
            counter++;
        }
        
        System.out.println("O maior numero eh: " + largest);
    }
}