/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faceds;

import Entity.ProductImage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class ProductImageFacade extends AbstractFacade<ProductImage> {

    @PersistenceContext(unitName = "VSOS")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductImageFacade() {
        super(ProductImage.class);
    }
    
}
