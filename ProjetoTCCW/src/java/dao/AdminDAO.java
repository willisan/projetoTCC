/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Admin;

/**
 *
 * @author aluno
 */
public class AdminDAO extends GenericDAO<Admin, Integer>{
    public AdminDAO(){
        super(Admin.class);
    }
}
