package accountteste;

/**
 *
 * @author Gustavo
 */
public class Account 
{
    private String name;
    private double balance;
    private double withdrawalAmount;
    
    // Construtor de Account que recebe dois parâmetros
    public Account(String name, double balance)
    {
        this.name = name;
        
        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0.0)
            this.balance = balance;
    
    }
    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }
    // métodod que retira apenas uma quantia válida no saldo
    public void withdrawal(double withdrawalAmount)
    {
        if (withdrawalAmount < balance)
            balance = balance - withdrawalAmount;
    }
    public double getBalance()
    {
        return balance;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}

