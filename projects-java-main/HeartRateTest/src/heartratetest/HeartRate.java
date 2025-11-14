
package heartratetest;

/**
 *
 * @author Gustavo
 */
public class HeartRate 
{
    
    private String nome; // variável de instância
    private String sobreNome; // variável de instância
    private int dia;
    private int mes;
    private int ano;
    private int idade;
    
    public HeartRate(String nome, String sobreNome, int dia, int mes, int ano)
    {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        idade = 2022-ano;
        
    }
    
    public float freqMax(){
        int freqMaxima =  220-idade;
        
        return freqMaxima;
    }
    
    public String freqAlvo(){
        int freqMaxima =  220-idade;
        
        return ("a frequencia alvo está entre "+(freqMaxima*0.5)+" e "+(freqMaxima*0.85));
    }

    /**
     * @return the sobreNome
     */
    public String getSobreNome() {
        return sobreNome;
    }

    /**
     * @param sobreNome the sobreNome to set
     */
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

// método que define o nome
    public void setNome(String nome)
    {
        this.nome = nome;
    }
// método que retorna o nome
    public String getNome()
    {
        return nome; // retorna o valor de name ao chamador
    } // fim do método getName
}

