package SOLID.S;

public class Invoice {
    
    Pen pen;

    public Invoice(Pen pen){
        this.pen = pen;
    }

    public int CreateInvoice(){
        return (int) ((pen.price)*1.18)+2;
        }
    public void SendMail(){
        System.out.println("Sending Gmail");
    }    

    public void print(){
        System.out.println("printing invoice");
    }

}
