/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Acer
 */
public enum WebUserRole {
    System_Administrator("System Administrator"),
    Super_User("Super User"),
    Shop_Manager("Shop Manager"),
    Deliver_Agent("Deliver Agent"),
    Seller("Seller"),
    Buyer("Buyer");
   
    private final String label;

    private WebUserRole(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
