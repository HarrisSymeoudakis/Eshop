/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import entities.Customer;

/**
 *
 * @author Harris
 */
public interface EShopIntf {
    
    abstract void register();
    abstract void addUser(Customer c);
    abstract boolean login(String u,String p);
    
}
