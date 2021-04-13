/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstone_team3;

/**
 *
 * @author Christina
 */
public class CustomerController { //WILL PROBABLY BECOME AN INTERFACE CLASS BUT STILL
    Customer current;
    
    public CustomerController(){
     current = new Customer();   
    }
    
    public void viewMenu(){
        current.viewMenu();
    }
    
    public void viewItem(){
        current.viewItem();
    }
    
    public void viewCart(){
       current.viewCart();
    }
    
    public void addItem(int itemID, Item item, int quantity){
        current.addItem(itemID, item, quantity);
    }        
    
    public void removeItem(int itemID, Item item, int quantity){
        current.removeItem(itemID, item, quantity);
    }
    
    public void purchase(){
        current.purchase();
    }
    
    
}
