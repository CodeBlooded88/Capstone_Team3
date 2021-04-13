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
public class Customer {
    
    private Account currentCustomer;
    private MyCart currentCart;
    private Item item;
    private Invenotry inventory;
    
    public Customer(){
        currentCart = new MyCart();
        
    }
    
    public void viewMenu(){
        
    }
    
    public void viewItem(){
        
    }
    
    public void viewCart(){
        // access currentCart
        // retrieve all data stores in currentCart
        // update view page for viewCart 
        // redirect user to view page for Cart
    }
    
    public void addItem(int itemID, Item item, int quantity){
        //will need to access MyCart class here
        //will need to access invenotry class here
        //may need to access item class here
    }        
    
    public void removeItem(int itemID, Item item, int quantity){
        //will need to access MyCart class here
    }
    
    public void purchase(){
        
    }
    
    public void viewOrder(int accountID){
        //will need to access MyCart class here
    }
    
    public void cancelOrder(int accountID){
        //will need to access MyCart class here
    }
    
    public void confirmCancelOrder(int accountID){
        //will need to access MyCart class here
    }
}
