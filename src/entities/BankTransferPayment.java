package entities;


public class BankTransferPayment extends Payment{
    
    private String name;
    private int al;
    private String dikaiouxos;
    private int iban;

    public BankTransferPayment(float poso, String nomisma, int hmerominia,String n, int a, String d, int i) {
        super(poso, nomisma, hmerominia);
        name=n;
        al=a;
        dikaiouxos=d;
        iban=i;
        
    }

    public int getAl() {
        return al;
    }

    public void setAl(int al) {
        this.al = al;
    }

    public String getDikaiouxos() {
        return dikaiouxos;
    }

    public void setDikaiouxos(String dikaiouxos) {
        this.dikaiouxos = dikaiouxos;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
