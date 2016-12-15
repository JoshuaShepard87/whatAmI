/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import dao.Dao;
import javax.naming.NamingException;

/**
 *
 * @author new
 */
public class Pojo extends Dao {
    
    public Pojo(String jndiName) throws NamingException {
        super(jndiName);
    }
    
}
