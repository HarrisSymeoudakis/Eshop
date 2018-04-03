package entities;


public class CashOnDeliveryPayment extends Payment{
    
    private float extraPoso;

    public CashOnDeliveryPayment(float poso, String nomisma, int hmerominia,float e) {
        super(poso, nomisma, hmerominia);
        extraPoso=e;
    }

    public float getExtraPoso() {
        return extraPoso;
    }

    public void setExtraPoso(float extraPoso) {
        this.extraPoso = extraPoso;
    }
    
    
}
