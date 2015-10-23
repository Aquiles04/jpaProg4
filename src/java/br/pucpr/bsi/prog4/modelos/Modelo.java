/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.bsi.prog4.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author alexandre.chaves
 */
@Entity
public class Modelo {
    @Id
    @GeneratedValue
    private long id;
    private String descricacao;
    
}
