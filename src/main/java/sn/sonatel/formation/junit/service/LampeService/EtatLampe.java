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
public enum EtatLampe {
    ON(1), OFF(2);
    private int value;

    EtatLampe(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
