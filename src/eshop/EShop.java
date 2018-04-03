package eshop;

import entities.Customer;
import ui.Frame;
import ui.MainUI;
import ui.RegisterFrame;

public class EShop implements EShopIntf {

    private static EShop eshop;
    private static Frame frame;
    private static EshopData eShopData;
    private static RegisterFrame RegisterFrame;
    private MainUI mainUI;

    public static void main(String[] args) {
        eshop = new EShop();
        frame = new Frame(eshop);
        eShopData = new EshopData();
    }

    @Override
    public void addUser(Customer c) {
        eShopData.addUser(c);
    }

    @Override
    public void register() {
        RegisterFrame = new RegisterFrame(eshop);
    }

    @Override
    public boolean login(String u, String p) {
        for (int i = 0; i < eShopData.getUsers().size(); i++) {
            if (eShopData.getUsers().get(i).getName().equals(u)) {
                if (eShopData.getUsers().get(i).getPassword().equals(p)) {
                    log();
                }
            }
        }
        return false;
    }

    public void log() {
        mainUI = new MainUI();
        frame.dispoceF();
        mainUI.setVisible(true);
    }
}
