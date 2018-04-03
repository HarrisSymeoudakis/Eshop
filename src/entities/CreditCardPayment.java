package entities;


public class CreditCardPayment extends Payment {
    
  private int ak;
  private String onoma;
  private int kwdikos;

    public CreditCardPayment(float poso, String nomisma, int hmerominia, int a, String o, int k) {
        super(poso, nomisma, hmerominia);
        ak=a;
        onoma=o;        //otan ftiaxnw ena antikeimeno credit card payment dhlwsame ta epipleon xaraktiristika gia arxikopoihsh, tha mporoysame na mhn ta baloume kan
        kwdikos=k;      // alla gia na ypoxreoysai na ylopoihseis autes tis metablites
     
    }

    public int getAk() {
        return ak;
    }

    public void setAk(int ak) {
        this.ak = ak;
    }

    public int getKwdikos() {
        return kwdikos;
    }

    public void setKwdikos(int kwdikos) {
        this.kwdikos = kwdikos;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }
    
}
