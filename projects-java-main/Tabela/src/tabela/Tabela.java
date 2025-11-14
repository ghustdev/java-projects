package tabela;

/**
 *
 * @author ritac
 */
public class Tabela {

    public static void main(String[] args) {
        
        int counter = 1;
        int total = 0;
        
        System.out.printf("%nN  N*10  N*100  N*1000%n%n");
        
        while(counter <= 5){
            int dez = counter * 10;
            int cem = counter * 100;
            int mil = counter * 1000;
            System.out.printf("%d  %d    %d    %d%n", counter, dez, cem, mil);
            
            counter++;
        }
    }
    
}
