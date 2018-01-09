/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.sonatel.formation.junit.service.LampeService;

import java.util.List;

/**
 *
 * @author baelze
 */
public interface LampeService {
    void allumerToutesLesLampes(List<Lampe> lampes, LampeRepositoryImpl repo);
    void eteindreToutesLesLampes(List<Lampe> lampes, LampeRepositoryImpl repo);
}
