
/**
 *
 * @author Gustavo Cardoso
 */
public class Invoice 
{
    private String numb;
    private String description;
    private double amount;
    private double price;
    private double value;
    
    // Construtor de Invoice que recebe 4 parÃ¢metros
    public Invoice(String numb, String description, double amount, double price)
    {
    
        this.numb = numb;
        
        this.description = description;
        
        // valida que o amount é maior que 0.0; se não for,
        // a variável de instÃ¢ncia amount mantÃ©m seu valor inicial padrÃ£o de 0.0
        if (amount > 0)
            this.amount = amount;
        
        // valida que o price é maior que 0.0; se nÃ£o for,
        // a variÃ¡vel de instÃ¢ncia price mantÃ©m seu valor inicial padrÃ£o de 0.0
        if (price > 0.0)
            this.price = price;
    
    }

    Invoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // mÃ©todo que calcula o valor de fatura (isto Ã©, multiplica amount pelo 
    // price por item) e depois retorna esse valor como double.
    /**
     *
     * @param price
     * @param amount
     * @return
     */
    public double getInvoice(double price, int amount, double value)
    {
        
        value = amount * price;
        return value;
    }
    
    public double getAmount()
    {
        return amount;
    }
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    public String getNumb()
    {
        return numb;
    }
    
    public void setNumb(String numb)
    {
        this.numb = numb;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }

    Object[] getInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}