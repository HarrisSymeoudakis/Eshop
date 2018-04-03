package entities;

import java.util.ArrayList;

public class Order {

    private ArrayList<ProductInOrder> products;

    public ArrayList<ProductInOrder> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductInOrder> products) {
        this.products = products;
    }

    public float getTotalPrice() {
        float tp = 0;
        for (int i = 0; i < products.size(); i++) {
            tp += products.get(i).getTotalPrice();
        }
        return tp;
    }
}
