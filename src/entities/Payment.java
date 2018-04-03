package entities;

import java.util.Date;


public abstract class Payment {
    
    private float poso;
    private String nomisma;
    private Date hmerominia;

    public Payment(float poso, String nomisma, int hmerominia) {
        this.poso = poso;
        this.nomisma = nomisma;
        this.hmerominia = new Date(); // kathe fora pou kaleitai ayti i synartisi pairnei tin keimeni hmeromhnia, ti stigmi dld pou to kaname
    }

    public float getPoso() {
        return poso;
    }

    public void setPoso(float poso) {
        this.poso = poso;
    }

    public String getNomisma() {
        return nomisma;
    }

    public void setNomisma(String nomisma) {
        this.nomisma = nomisma;
    }

    public Date getHmerominia() {
        return hmerominia;
    }

    public void setHmerominia(Date hmerominia) {
        this.hmerominia = hmerominia; // edw ousiastika "set date"
    }
    
    
}
