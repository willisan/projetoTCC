/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Venda;

/**
 *
 * @author aluno
 */
public class VendaDAO extends GenericDAO<Venda, Integer>{
    public VendaDAO(){
        super(Venda.class);
    }
}

