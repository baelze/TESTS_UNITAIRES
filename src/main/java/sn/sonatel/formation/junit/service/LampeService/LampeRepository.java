/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service.LampeService;

/**
 *
 * @author baelze
 */
public interface LampeRepository {
    
    void ajouterLampe(Lampe l);
    
    void modifierLampe(Lampe l);
    
    void listerLampes();
}
