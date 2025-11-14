package datetest;

/**
 *
 * @author Gustavo Cardoso
 */
public class Date 
{
    private int day, month, ano;
    
    // Construtor de Date que recebe 3 parâmetros
    public Date(int day,int month,int ano)
    {       
        this.day = day;
        
        this.month = month;
        
        this.ano = ano;
                        
    }

    Date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // método que exiba mês, dia e ano separados por barras normais (/).
    public void displayDate()
    {
        System.out.println("A DATA E: ");
        System.out.printf("%n%d / %d / %d", month, day, ano);
        System.out.println();
    }
    
    public int getDay()
    {
        return day;
    }    
    public void setDay(int day)
    {
        this.day = day;
    }
    
    public int getMonth()
    {
        return month;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    
    public int getYear()
    {
        return ano;
    }
    public void setYear(int ano)
    {
        this.ano = ano;
    }
} // fim da classe Date

