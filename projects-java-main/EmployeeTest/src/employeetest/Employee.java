package employeetest;

/**
 *
 * @author Gustavo Cardoso
 */
public class Employee 
{
    private String name;
    private double salarym, salarya;
    
    public Employee(String name,double salarym)
    {       
        this.name = name;
        
        // valida que o salarym é maior que 0.0; se não for,
        // a variável de instância salarym mantém seu valor inicial padrão de 0.0
        if (salarym >= 0.0)
            this.salarym = salarym;
                        
    }

    // método que exiba mês, dia e ano separados por barras normais (/).
    public void displayDate()
    {
        
    }
    
    public String getName()
    {
        return name;
    }    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public double getSalarym()
    {
        return salarym;
    }
    public void setSalarym(double salarym)
    {
        this.salarym = salarym;
    }
    
    public double getSalarya()
    {
        salarya = salarym * 12;
        return salarya;
    }
    
    public double getSalarya10()
    {
        salarym = salarym * 1.10;
        salarya = salarym * 12;
        return salarya;
    }
} // fim da classe Employee



