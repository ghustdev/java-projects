package invoicetest;
/**
 *
 * @author Gustavo
 */
public class InvoiceTest 
{
    public static void main(String[] args) {

        Invoice teste = new Invoice("GT HR08386","Compra de celular",2,7000.00);

        // exibe os valores iniciais de cada objeto
        System.out.printf("INVOICE: %n");
        System.out.printf("description: %s%n",teste.getDescription());
        System.out.printf("number: %s%n",teste.getNumb());
        System.out.printf("amount: %f%n",teste.getAmount());
        System.out.printf("price: $%f%n",teste.getPrice());
        System.out.printf("value invoice: $%f%n",teste.getInvoice());
    }

}
