package fuel;

import java.util.Scanner;

/**
 *
 * @author ritac
 */
public class Fuel 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double media = 0;
        int kmTotal = 0;
        int fuelTotal = 0;
        int gradeCounter = 0;
        
        System.out.println("Enter the mileage traveled of a trip or -1 to quit: ");
        int km = input.nextInt();
        
        System.out.println("Enter the amount of liters spent on a trip or -1 to quit: ");
        int fuel = input.nextInt();
        
        while ((km != -1)|(fuel != -1))
        {
            media = km/fuel;
            kmTotal += km;
            fuelTotal += fuel;
            gradeCounter += 1;
            
            System.out.println("The consumption of km/liter is: "+media);   
            
            System.out.println("Enter the mileage traveled of a trip or -1 to quit: ");
            km = input.nextInt();
        
            System.out.println("Enter the amount of liters spent on a trip or -1 to quit: ");
            fuel = input.nextInt();
        }
        
        if (gradeCounter != 0)
        {
        System.out.println("the total mileage is: "+kmTotal);
            
        System.out.println("the total sum of liters of fuel consumed is: "+fuelTotal);
        }
          
    } 
}
