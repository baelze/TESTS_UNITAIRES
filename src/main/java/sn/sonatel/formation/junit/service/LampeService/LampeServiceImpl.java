/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service.LampeService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.sonatel.formation.junit.service.LampeService.exceptions.LampeDejaAllumeException;
import sn.sonatel.formation.junit.service.LampeService.exceptions.LampeDejaEteinteException;

/**
 *
 * @author baelze
 */
public class LampeServiceImpl implements LampeService {

    @Override
    public void allumerToutesLesLampes(List<Lampe> lampes, LampeRepositoryImpl repo) {
        lampes.forEach((l) -> {
            if(l.getEtat().equals(EtatLampe.ON))
                try {
                    throw new LampeDejaAllumeException();
            } catch (LampeDejaAllumeException ex) {
                Logger.getLogger(LampeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            l.setEtat(EtatLampe.ON);
            repo.modifierLampe(l);
        });
    }

    @Override
    public void eteindreToutesLesLampes(List<Lampe> lampes, LampeRepositoryImpl repo) {
        lampes.forEach((l) -> {
                        if(l.getEtat().equals(EtatLampe.OFF))
                try {
                    throw new LampeDejaEteinteException();
            } catch (LampeDejaEteinteException ex) {
                Logger.getLogger(LampeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            l.setEtat(EtatLampe.OFF);
            repo.modifierLampe(l);
        });
    }
}
