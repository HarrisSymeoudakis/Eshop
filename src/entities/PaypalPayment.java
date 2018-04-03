package entities;


public class PaypalPayment extends Payment{
    
    private int logariasmos;

    public PaypalPayment(float poso, String nomisma, int hmerominia, int i) {
        super(poso, nomisma, hmerominia);
        logariasmos=i;
    }

    public int getLogariasmos() {
        return logariasmos;
    }

    public void setLogariasmos(int logariasmos) {
        this.logariasmos = logariasmos;
    }
    
}
