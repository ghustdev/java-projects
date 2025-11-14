

package program2;

import java.util.Scanner;

public class Program2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        
        System.out.print("Primeiro número: ");
        number1 = input.nextInt();
        
        System.out.print("Segundo número: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.printf("Soma é %d%n", sum);
        
                
    }
    
}
