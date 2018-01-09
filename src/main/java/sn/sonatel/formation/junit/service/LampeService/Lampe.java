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
public class Lampe {
    
    public String id;
    public String emplacement;
    public EtatLampe etat;

    public Lampe(String id, String emplacement, EtatLampe etat){
        this.id=id;
        this.emplacement=emplacement;
        this.etat=etat;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the emplacement
     */
    public String getEmplacement() {
        return emplacement;
    }

    /**
     * @param emplacement the emplacement to set
     */
    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    /**
     * @return the etat
     */
    public EtatLampe getEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(EtatLampe etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        String str = "Lampe :  " + id + "; " + emplacement + "; " + etat;
        return str;
    }
}
