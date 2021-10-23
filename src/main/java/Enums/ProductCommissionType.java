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
public enum ProductCommissionType {
    Flat("Flat"),
    Precentage("Precentage"),
    Combine("Combine");
   
    private final String label;

    private ProductCommissionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
