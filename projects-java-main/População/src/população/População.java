package população;

/**
 *
 * @author Gustavo
 */
public class População {

    
    public static void main(String[] args) {
        
        double mundial = 780000000;//cria variavel com a população mundial
        double taxa;//cria a variavel para aplicar a taxa de crescimento populacional
        taxa = mundial * 1.01;//aplica a formula de crescimento populacional

        for (int cont = 1; cont <= 5; cont++)//loop para mostrar os anos e fazer a formula
        {
            System.out.printf("A partir de %d anos a populacao e de: %f%n", cont, taxa);//imprime o resultado dos anos e população
            taxa = taxa * 1.01;//formula da população
            taxa = Math.round(taxa);//arredonda o numero
        }
    }
    
}
