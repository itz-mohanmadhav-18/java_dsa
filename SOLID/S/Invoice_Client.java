package SOLID.S;

public class Invoice_Client {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Invoice I = new Invoice(pen);
        System.out.println(I.CreateInvoice());
        I.SendMail();
        I.print();
    }

}
