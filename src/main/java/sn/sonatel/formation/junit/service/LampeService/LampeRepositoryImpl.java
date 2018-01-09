/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service.LampeService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.sonatel.formation.junit.service.LampeService.exceptions.LampeExisteDejaException;
import sn.sonatel.formation.junit.service.LampeService.exceptions.LampeNotFoundException;
import sn.sonatel.formation.junit.service.LampeService.exceptions.RepositoryNullException;

/**
 *
 * @author baelze
 */
public class LampeRepositoryImpl implements LampeRepository {

    private List<Lampe> lampes;

    public LampeRepositoryImpl(List<Lampe> lampes) {
        this.lampes = lampes;
    }

    @Override
    public void ajouterLampe(Lampe l) {
        testRepoNull();

        getLampes().forEach((lampe) -> {
            if (lampe.getId().equals(l.getId())) {
                try {
                    throw new LampeExisteDejaException();
                } catch (LampeExisteDejaException ex) {
                    Logger.getLogger(LampeRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        getLampes().add(l);
    }

    @Override
    public void modifierLampe(Lampe l) {
        testRepoNull();
        for (Lampe lampe : getLampes()) {
            if (lampe.getId().equals(l.getId())) {
                lampe.setEtat(l.getEtat());
                lampe.setEmplacement(l.getEmplacement());
                return;
            }
        }
        try {
            throw new LampeNotFoundException();
        } catch (LampeNotFoundException ex) {
            Logger.getLogger(LampeRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void listerLampes() {
        testRepoNull();
        getLampes().forEach((l) -> {
            System.out.println("lampe ==== + " + l);
            System.out.println(l.toString());
        });

    }

    public void testRepoNull() {
        if (getLampes() == null) {
            try {
                throw new RepositoryNullException();
            } catch (RepositoryNullException ex) {
                Logger.getLogger(LampeRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @return the lampes
     */
    public List<Lampe> getLampes() {
        return lampes;
    }

    /**
     * @param lampes the lampes to set
     */
    public void setLampes(List<Lampe> lampes) {
        this.lampes = lampes;
    }
}
