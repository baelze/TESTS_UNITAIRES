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
public class PromoCalculatorServiceImpl implements PromoCalculatorService {

    @Override
    public double calculePromo(String nomProduit, double prixProduit) {
        double prixPromo = 0;
        int remise = 0;
        if (prixProduit > 500) {
            remise = 2;
        }
        if (nomProduit.toUpperCase().startsWith("A")) {
            prixPromo = (prixProduit * (15 + remise)) / 100;
        } else if (nomProduit.toUpperCase().startsWith("B")) {
            prixPromo = (prixProduit * (5 + remise)) / 100;
        }
        return prixPromo;
    }
    
}
