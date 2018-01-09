/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service;

/**
 *
 * @author baelze
 */
public class PromotionBusinessImpl implements PromotionBusiness {

    @Override
    public double calculePromo(String nomProduit, double prixProduit) {
        PromoCalculatorServiceImpl impl = new PromoCalculatorServiceImpl();
        return impl.calculePromo(nomProduit, prixProduit);
    }
}
