/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import sn.sonatel.formation.junit.service.LampeService.EtatLampe;
import sn.sonatel.formation.junit.service.LampeService.Lampe;
import sn.sonatel.formation.junit.service.LampeService.LampeRepositoryImpl;
import sn.sonatel.formation.junit.service.LampeService.exceptions.LampeExisteDejaException;
import sn.sonatel.formation.junit.service.LampeService.exceptions.LampeNotFoundException;

/**
 *
 * @author baelze
 */
public class LampeRepositoryTest {

    public static List<Lampe> lampes;
    public static LampeRepositoryImpl repo;

    @BeforeClass
    public static void init() {
        lampes = new ArrayList<>();
        repo = new LampeRepositoryImpl(lampes);
    }

    @Test
    public void testAjouterLampeAuRepository() {  
        Lampe l1 = new Lampe(UUID.randomUUID().toString(), "Chambre", EtatLampe.OFF);
        repo.ajouterLampe(l1);
        assertThat(repo.getLampes(), hasItems(l1));
        assertThat(repo.getLampes().size(), is(1));       
        repo.listerLampes();
    }
    
    @Test(expected=LampeNotFoundException.class)
    public void testModifierLampeDuRepositoryException() {
        Lampe l2=new Lampe(UUID.randomUUID().toString(), "Salon", EtatLampe.OFF);       
        repo.modifierLampe(l2);        
    }
    
    @Test(expected=LampeExisteDejaException.class)
    public void testAjouterLampeAuRepositoryException() {
        Lampe l3=new Lampe(UUID.randomUUID().toString(), "Cuisine", EtatLampe.OFF);       
        repo.ajouterLampe(l3);
        repo.ajouterLampe(l3);
    }    
}
