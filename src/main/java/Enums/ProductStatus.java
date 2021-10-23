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
public enum ProductStatus {
    Draft("Draft"),
    Public("Public"),
    Private("Private"),
    Pending_Reviwe("Pending_Reviwe");
   
    private final String label;

    private ProductStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
