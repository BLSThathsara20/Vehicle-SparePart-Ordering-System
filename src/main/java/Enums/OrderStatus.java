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
public enum OrderStatus {
    Completed("Completed"),
    Pending_Payment("Pending Payment"),
    Processing("Processing"),
    On_hold("On hold"),
    Cancelled("Cancelled"),
    Failed("Failed"),
    Refunded("Refunded");
   
    private final String label;

    private OrderStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
